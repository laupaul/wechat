package com.wechat.model.system;

import com.wechat.persistence.mapper.BaseEntity;

/**
 * 系统菜单
 * 
 * @author liupeng
 */
public class Menu extends BaseEntity {
	// ID
	private Integer id;
	// 菜单名称
	private String name;
	// 菜单URL
	private String url;
	// 序号
	private Integer seq;
	// 级别
	private Integer levl;
	// 父节点
	private Integer parent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public Integer getLevl() {
		return levl;
	}

	public void setLevl(Integer levl) {
		this.levl = levl;
	}

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}
}