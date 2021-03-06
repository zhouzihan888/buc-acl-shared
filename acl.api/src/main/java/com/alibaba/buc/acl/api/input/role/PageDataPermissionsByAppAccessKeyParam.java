package com.alibaba.buc.acl.api.input.role;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 封装分页查询应用数据权限的参数
 * 类PageDataPermissionsByAppAccessKeyParam.java的实现描述：TODO 类实现描述 
 * @author tongxu 2017年9月25日 上午10:05:11
 */
public class PageDataPermissionsByAppAccessKeyParam extends AclParam {

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -1140663756577434038L;

    /**
     * 数据权限中文名，支持全模糊查询
     */
    private String title;
    
    /**
     * 数据权限code，支持全模糊查询
     */
    private String name;
    
    /**
     * 关联的角色code
     */
    private String roleName;
    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getRoleName() {
        return roleName;
    }


    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    
}
