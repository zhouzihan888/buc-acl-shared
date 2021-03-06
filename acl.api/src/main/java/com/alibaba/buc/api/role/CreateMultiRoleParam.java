package com.alibaba.buc.api.role;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.alibaba.buc.api.common.AclParam;

public class CreateMultiRoleParam implements AclParam {

    private static final long         serialVersionUID = -1344962070032325134L;

    /**
     * 操作人的用户id，必选，请务必传入正确的userId，所有写接口，都会校验该用户是否拥有写的权限
     * {@link principalUserId}
     */
    @Deprecated
    private Integer                   userId;
    
    /**
     * 接口调用人id，必选，请务必传入正确的userId，所有写接口，都会校验该用户是否拥有写的权限
     * 
     */
    private Integer                    principalUserId;
    
    /**
     * 业务操作人Id
     */
    private String                    operatorUserId;
    
    /**
     * 角色英文名，必选
     */
    private String                    name;

    /**
     * 角色中文标题，必选
     */
    private String                    title;

    /**
     * 角色描述
     */
    private String                    description;

    /**
     * 角色归属人的用户id，角色Owner，必选，角色Owner将作为权限申请流程中的审批人，如果归属人离职、转岗，请重新设置
     */
    private String                    ownerUserId;

    /**
     * 权限来源，新增时必选，不能修改
     */
    private String                    permissionSourceName;

    /**
     * 归属部门，必选
     */
    private String                    orgIds;

    /**
     * 创建人的用户id，当前角色创建或变更的发起人，必选
     * {@link operatorUserId}
     */
    @Deprecated
    private String                    creatorUserId;
    /**
     * 权限审批规则类型
     * <ul>
     * <li>random：随机取审批人之一</li>
     * <li>self：用户申请该权限时自行选择审批人</li>
     * <li>parallel：所有审批人均参与审批，并行审批</li>
     * <li>org:按部门审批</li>
     * </ul>
     */
    private String                    ruleType         = "random";

    /**
     * 审批人
     * <p>
     * 当ruleType为randow，self，parallel时，取审批人为approverUserIds的值。当ruleType为org时，不从approverUserIds取值。
     * </p>
     */
    private List<String>              approverUserIds;

    /**
     * 扩展Map
     * <p>
     * 当ruleType为org时，需要用到此字段来传递审批人的值。可以为userId，value为此审批人userId对应的审批部门集合orgIds。 userId和orgIds不可重复。
     * </p>
     */
    private Map<String, List<String>> extentionMap;
    
    /**
     * added by yicheng.wp
     *
     * 权限回收策略
     */
    private String            revokeRule;

    /**
     * 1.公开可申请
     * 2.公开不可申请
     * 3.不公开
     */
    private String publicAttri = "1";

    public String getRevokeRule() {
		return revokeRule;
	}

	public void setRevokeRule(String revokeRule) {
		this.revokeRule = revokeRule;
	}

	public String getName() {
        return name;
    }

    /**
     * 角色英文名，必选
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    /**
     * 角色中文标题，必选
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    /**
     * 角色描述，必选
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerUserId() {
        return ownerUserId;
    }

    public void setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
    }

    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public List<String> getApproverUserIds() {
        return approverUserIds;
    }

    public void setApproverUserIds(List<String> approverUserIds) {
        this.approverUserIds = approverUserIds;
    }

    public Map<String, List<String>> getExtentionMap() {
        return extentionMap;
    }

    public void setExtentionMap(Map<String, List<String>> extentionMap) {
        this.extentionMap = extentionMap;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public String getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(String orgIds) {
        this.orgIds = orgIds;
    }

    public String getPermissionSourceName() {
        return permissionSourceName;
    }

    public void setPermissionSourceName(String permissionSourceName) {
        this.permissionSourceName = permissionSourceName;
    }

    public String getCreatorUserId() {
        return creatorUserId;
    }

    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    
    public Integer getPrincipalUserId() {
        return principalUserId;
    }

    
    public void setPrincipalUserId(Integer principalUserId) {
        this.principalUserId = principalUserId;
    }

    
    public String getOperatorUserId() {
        return operatorUserId;
    }

    
    public void setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

    public String getPublicAttri() {
        return publicAttri;
    }

    public void setPublicAttri(String publicAttri) {
        this.publicAttri = publicAttri;
    }
}
