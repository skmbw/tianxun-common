package com.vteba.tianxun.common.bean;

import java.util.List;

public class Node {
	public static final String TYPE_DEF = "default";
	public static final String TYPE_FILE = "file";
	public static final String TYPE_BRIEF = "briefcase";
	
	private String id;
	private String text;
	private String parent;
	private String type = TYPE_DEF;
	private State state;
	private String icon;
	private List<Node> children;
	private String href;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<Node> getChildren() {
		return children;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}
}
