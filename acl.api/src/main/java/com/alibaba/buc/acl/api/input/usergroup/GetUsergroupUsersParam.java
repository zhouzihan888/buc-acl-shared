package com.alibaba.buc.acl.api.input.usergroup;

import com.alibaba.buc.acl.api.common.AclParam;

/**
 * 获取用户组下的用户的入参
 *
 * @author taigao
 */
public class GetUsergroupUsersParam extends AclParam {

    private static final long serialVersionUID = 5404876725236625136L;

    /**
     * 用户组英文名
     */
    private String usergroupName;

    public String getUsergroupName() {
        return usergroupName;
    }

    public void setUsergroupName(String usergroupName) {
        this.usergroupName = usergroupName;
    }

}
