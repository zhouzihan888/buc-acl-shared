package com.alibaba.buc.acl.api.output.app;

import com.alibaba.buc.acl.api.common.AclResult;

/**
 * @author baidian.zc
 */
public class AppResult extends AclResult {
	private static final long serialVersionUID = 3314953127794071233L;

	private String            name; //如果此值为null,可以认为返回结果为null
    private String            title;
    private String            description;
    private String            aoneAppId;

    public String getName() {
        return name;
    }

    public AppResult(){
    }

    public AppResult(String name, String title, String description, String aonAppId){
        super();
        this.name = name;
        this.title = title;
        this.description = description;
        this.aoneAppId = aonAppId;
    }

    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
        this.name = name;
    }

    public String getAoneAppId() {
        return aoneAppId;
    }

    public void setAoneAppId(String aoneAppId) {
        this.aoneAppId = aoneAppId;
    }
	
}