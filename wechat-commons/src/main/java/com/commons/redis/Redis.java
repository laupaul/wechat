package com.commons.redis;

import com.commons.redis.provider.RedisObjectProvider;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Redis {

	public static JedisPool jedisPool;

	public static <T> T getObjectByKey(String key, Class<T> clazz) {
		Jedis jedis = getJedisPool().getResource();
		T result = new RedisObjectProvider(jedis).getSerializableObject(key, clazz);
		jedis.close();
		return result;
	}

	public static String putObjectByKey(String key, Object object) {
		Jedis jedis = getJedisPool().getResource();
		String result = new RedisObjectProvider(jedis).setObject(key, object);
		returnResource(jedis);
		return result;
	}

	private static void returnResource(Jedis jedis) {
		synchronized (jedis) {
			if (jedis != null)
				jedis.close();
		}
	}

	public static JedisPool getJedisPool() {
		if (jedisPool == null)
			jedisPool = new JedisPool(getConfig(), "10.1.125.230", 6379, 10000);
		return jedisPool;
	}

	public static synchronized JedisPoolConfig getConfig() {
		JedisPoolConfig config = new JedisPoolConfig();
	    //控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；  
        //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。  
        //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例。  
        config.setMaxIdle(50000);  
        //表示当borrow(引入)一个jedis实例时，最大的等待时间，如果超过等待时间，则直接抛出JedisConnectionException；  
        //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的;  
        config.setTestOnBorrow(true);  
		config.setMaxIdle(10000);
		config.setMaxWaitMillis(10000);
		config.setTestOnBorrow(true);
		return config;
	}
}
