package com.vteba.tianxun.user.model;

import java.util.List;
import java.util.Set;

import com.vteba.annotation.Kryo;
import com.vteba.security.user.Resource;

@Kryo
public class Authority implements com.vteba.security.user.Authority {
	private static final long serialVersionUID = 4144315167773876986L;
	
	private Set<String> urlResource;
	private String urls;
	private Boolean showMenu;
	private List<Menu> menuList;
	
	private Set<String> methodResource;

	/**
     * order by 排序语句
     * 对应数据库表字段 authority
     */
    private String orderBy;

    /**
     * 分页开始记录
     * 对应数据库表字段 authority
     */
    private Integer start;

    /**
     * 分页大小
     * 对应数据库表字段 authority
     */
    private int pageSize = 10;

    /**
     * 是否去重
     * 对应数据库表字段 authority
     */
    private boolean distinct;

    /**
     * 对应数据库表字段 authority.id
     */
    private String id;

    /**
     * 对应数据库表字段 authority.name
     */
    private String name;

    /**
     * 对应数据库表字段 authority.desc
     */
    private String desc;

    /**
     * 对应数据库表字段 authority.enabled
     */
    private Integer enabled;

    /**
     * 对应数据库表字段 authority.module_id
     */
    private String moduleId;

    /**
     * 对应数据库表字段 authority.action
     */
    private String action;

    /**
     * 对应数据库表字段 authority.show
     */
    private Boolean show;

    /**
     * 对应数据库表字段 authority.orders
     */
    private Integer orders;

    /**
     * 对应数据库表字段 authority.state
     */
    private Integer state;

    /**
     * 对应数据库表字段 authority.icon
     */
    private String icon;

    /**
     * 对应数据库表字段 authority.initial
     */
    private Byte initial;

    /**
     * 设置 order by 排序语句
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 获得 order by 排序语句
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * 设置 start，分页开始记录
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 获得 start，分页开始记录
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 设置 pageSize，分页大小
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 获得 pageSize，分页大小
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置 distinct，是否去重
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 获得 distinct，是否去重
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获得字段 authority.id 的值
     *
     * @return the value of authority.id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置字段 authority.id 的值
     *
     * @param id the value for authority.id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获得字段 authority.name 的值
     *
     * @return the value of authority.name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置字段 authority.name 的值
     *
     * @param name the value for authority.name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获得字段 authority.desc 的值
     *
     * @return the value of authority.desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置字段 authority.desc 的值
     *
     * @param desc the value for authority.desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获得字段 authority.enabled 的值
     *
     * @return the value of authority.enabled
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * 设置字段 authority.enabled 的值
     *
     * @param enabled the value for authority.enabled
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * 获得字段 authority.module_id 的值
     *
     * @return the value of authority.module_id
     */
    public String getModuleId() {
        return moduleId;
    }

    /**
     * 设置字段 authority.module_id 的值
     *
     * @param moduleId the value for authority.module_id
     */
    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * 获得字段 authority.action 的值
     *
     * @return the value of authority.action
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置字段 authority.action 的值
     *
     * @param action the value for authority.action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * 获得字段 authority.show 的值
     *
     * @return the value of authority.show
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * 设置字段 authority.show 的值
     *
     * @param show the value for authority.show
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * 获得字段 authority.orders 的值
     *
     * @return the value of authority.orders
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置字段 authority.orders 的值
     *
     * @param orders the value for authority.orders
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * 获得字段 authority.state 的值
     *
     * @return the value of authority.state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置字段 authority.state 的值
     *
     * @param state the value for authority.state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获得字段 authority.icon 的值
     *
     * @return the value of authority.icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置字段 authority.icon 的值
     *
     * @param icon the value for authority.icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获得字段 authority.initial 的值
     *
     * @return the value of authority.initial
     */
    public Byte getInitial() {
        return initial;
    }

    /**
     * 设置字段 authority.initial 的值
     *
     * @param initial the value for authority.initial
     */
    public void setInitial(Byte initial) {
        this.initial = initial;
    }

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	public void setUrlResource(Set<String> urlResource) {
		this.urlResource = urlResource;
	}
	
	@Override
	public Set<String> getUrlResource() {
		return urlResource;
	}

	@Override
	public Set<String> getMethodResource() {
		return methodResource;
	}

	public void setMethodResource(Set<String> methodResource) {
		this.methodResource = methodResource;
	}
	
	@Override
	public String getAuthName() {
		return name;
	}

	@Override
	public String getAuthDesc() {
		return desc;
	}

	@Override
	public String getTenantId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUrls() {
		return urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
	}

	public Boolean getShowMenu() {
		return showMenu;
	}

	public void setShowMenu(Boolean showMenu) {
		this.showMenu = showMenu;
	}

	@Override
	public List<? extends Resource> getResourceList() {
		// TODO Auto-generated method stub
		return null;
	}
}