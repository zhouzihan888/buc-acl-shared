package com.alibaba.buc.acl.api.input.test;

import java.util.List;
import java.util.Map;

import com.alibaba.buc.acl.api.common.AclParam;

public class CreateTestParam extends AclParam{
	
	private String name;
	private String [] names;
	private List<String> name_list;
	private List<Integer> age_list;

	private String action;
	
	private Map<Integer, List<Integer>>map;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public List<String> getName_list() {
		return name_list;
	}

	public void setName_list(List<String> name_list) {
		this.name_list = name_list;
	}

	public List<Integer> getAge_list() {
		return age_list;
	}

	public void setAge_list(List<Integer> age_list) {
		this.age_list = age_list;
	}

	public Map<Integer, List<Integer>> getMap() {
		return map;
	}

	public void setMap(Map<Integer, List<Integer>> map) {
		this.map = map;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	
	

}
