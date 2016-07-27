package com.racing.redis;

import com.racing.redis.provider.RedisObjectProvider;

import redis.clients.jedis.Jedis;

public class Redis {

	public static <T> T getObjectByKey(String key, Class<T> clazz) {
		Jedis jedis = new Jedis("10.1.200.122", 6379, 10000);
		T result = new RedisObjectProvider(jedis).getSerializableObject(key, clazz);
		jedis.close();
		return result;
	}

	public static String putObjectByKey(String key, Object object) {
		Jedis jedis = new Jedis("10.1.200.122", 6379, 10000);
		String result = new RedisObjectProvider(jedis).setObject(key, object);
		jedis.close();
		return result;
	}
}
