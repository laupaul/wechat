package com.wechat.persistence.system;

import com.wechat.model.system.Menu;
import com.wechat.persistence.mapper.BaseMapper;

public interface MenuMapper extends BaseMapper<Menu> {
	int deleteByPrimaryKey(Long id);

	int insert(Menu record);

	int insertSelective(Menu record);

	Menu selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Menu record);

	int updateByPrimaryKey(Menu record);

}