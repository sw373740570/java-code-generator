package com.vcredit.lrhCustomer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.StringUtils;



/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 11:44:30
 * @see com.vcredit.entity.LrhCustomer
 */

public class LrhCustomer  implements Serializable{
	
	//columns START
	/**
	 * 账户编号
	 */
	private String accountId;
	/**
	 * 客户姓名
	 */
	private String customerName;
	/**
	 * 客户身份证号码
	 */
	private String customerIdcard;
	/**
	 * 手机号码
	 */
	private String customerMobile;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date modifyTime;
	/**
	 * VBS——销售Id
	 */
	private String vbsSaleSaleAgentId;
	/**
	 * VBS——销售所属团队名称
	 */
	private String vbsSaleTeamName;
	/**
	 * VBS——销售所属团队代码
	 */
	private String vbsSaleTeamFullKey;
	/**
	 * VBS——销售所属门店代码
	 */
	private String vbsSaleStoreKey;
	/**
	 * VBS——销售所属门店名称
	 */
	private String vbsSaleStoreName;
	/**
	 * VBS——销售所属城市
	 */
	private String vbsSaleCityName;
	/**
	 * VBS——销售所属城市代码
	 */
	private String vbsSaleRegionKey;
	/**
	 * 发展客户时间
	 */
	private Date recomTime;
	/**
	 * 线上销售ID
	 */
	private String onlineSaleId;
	/**
	 * 代理人ID
	 */
	private String customerAgentId;
	/**
	 * 介绍人的邀请码
	 */
	private String introducerInviteCode;
	/**
	 * 微信openId
	 */
	private String openId;
	/**
	 * VBS——销售姓名
	 */
	private String vbsSaleAgentName;
	/**
	 * VBS——城市code
	 */
	private Integer vbsCityCode;
	/**
	 * VBS——销售部名称
	 */
	private String vbsSalesDepartmentName;
	/**
	 * VBS——销售部FullKey
	 */
	private String vbsSalesDepartmentKey;
	/**
	 * VBS——分部名称
	 */
	private String vbsDivisionName;
	/**
	 * VBS——分部FullKey
	 */
	private String vbsDivisionKey;
	//columns END 数据库字段结束
	
	

	//get and set
	public void setAccountId(String accountId) {
	    
		    if(StringUtils.isNotBlank(accountId)){
			 accountId=accountId.trim();
			}
		this.accountId = accountId;
	}
	
	
	public String getAccountId() {
		return this.accountId;
	}
	public void setCustomerName(String customerName) {
	    
		    if(StringUtils.isNotBlank(customerName)){
			 customerName=customerName.trim();
			}
		this.customerName = customerName;
	}
	
	
	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerIdcard(String customerIdcard) {
	    
		    if(StringUtils.isNotBlank(customerIdcard)){
			 customerIdcard=customerIdcard.trim();
			}
		this.customerIdcard = customerIdcard;
	}
	
	
	public String getCustomerIdcard() {
		return this.customerIdcard;
	}
	public void setCustomerMobile(String customerMobile) {
	    
		    if(StringUtils.isNotBlank(customerMobile)){
			 customerMobile=customerMobile.trim();
			}
		this.customerMobile = customerMobile;
	}
	
	
	public String getCustomerMobile() {
		return this.customerMobile;
	}
		/*
	public String getcreate_timeString() {
		return DateUtils.convertDate2String(FORMAT_CREATE_TIME, getcreate_time());
	}
	public void setcreate_timeString(String value) throws ParseException{
		setcreate_time(DateUtils.convertString2Date(FORMAT_CREATE_TIME,value));
	}*/
	
	public void setCreateTime(Date createTime) {
	    
		this.createTime = createTime;
	}
	
	
	public Date getCreateTime() {
		return this.createTime;
	}
		/*
	public String getmodify_timeString() {
		return DateUtils.convertDate2String(FORMAT_MODIFY_TIME, getmodify_time());
	}
	public void setmodify_timeString(String value) throws ParseException{
		setmodify_time(DateUtils.convertString2Date(FORMAT_MODIFY_TIME,value));
	}*/
	
	public void setModifyTime(Date modifyTime) {
	    
		this.modifyTime = modifyTime;
	}
	
	
	public Date getModifyTime() {
		return this.modifyTime;
	}
	public void setVbsSaleSaleAgentId(String vbsSaleSaleAgentId) {
	    
		    if(StringUtils.isNotBlank(vbsSaleSaleAgentId)){
			 vbsSaleSaleAgentId=vbsSaleSaleAgentId.trim();
			}
		this.vbsSaleSaleAgentId = vbsSaleSaleAgentId;
	}
	
	
	public String getVbsSaleSaleAgentId() {
		return this.vbsSaleSaleAgentId;
	}
	public void setVbsSaleTeamName(String vbsSaleTeamName) {
	    
		    if(StringUtils.isNotBlank(vbsSaleTeamName)){
			 vbsSaleTeamName=vbsSaleTeamName.trim();
			}
		this.vbsSaleTeamName = vbsSaleTeamName;
	}
	
	
	public String getVbsSaleTeamName() {
		return this.vbsSaleTeamName;
	}
	public void setVbsSaleTeamFullKey(String vbsSaleTeamFullKey) {
	    
		    if(StringUtils.isNotBlank(vbsSaleTeamFullKey)){
			 vbsSaleTeamFullKey=vbsSaleTeamFullKey.trim();
			}
		this.vbsSaleTeamFullKey = vbsSaleTeamFullKey;
	}
	
	
	public String getVbsSaleTeamFullKey() {
		return this.vbsSaleTeamFullKey;
	}
	public void setVbsSaleStoreKey(String vbsSaleStoreKey) {
	    
		    if(StringUtils.isNotBlank(vbsSaleStoreKey)){
			 vbsSaleStoreKey=vbsSaleStoreKey.trim();
			}
		this.vbsSaleStoreKey = vbsSaleStoreKey;
	}
	
	
	public String getVbsSaleStoreKey() {
		return this.vbsSaleStoreKey;
	}
	public void setVbsSaleStoreName(String vbsSaleStoreName) {
	    
		    if(StringUtils.isNotBlank(vbsSaleStoreName)){
			 vbsSaleStoreName=vbsSaleStoreName.trim();
			}
		this.vbsSaleStoreName = vbsSaleStoreName;
	}
	
	
	public String getVbsSaleStoreName() {
		return this.vbsSaleStoreName;
	}
	public void setVbsSaleCityName(String vbsSaleCityName) {
	    
		    if(StringUtils.isNotBlank(vbsSaleCityName)){
			 vbsSaleCityName=vbsSaleCityName.trim();
			}
		this.vbsSaleCityName = vbsSaleCityName;
	}
	
	
	public String getVbsSaleCityName() {
		return this.vbsSaleCityName;
	}
	public void setVbsSaleRegionKey(String vbsSaleRegionKey) {
	    
		    if(StringUtils.isNotBlank(vbsSaleRegionKey)){
			 vbsSaleRegionKey=vbsSaleRegionKey.trim();
			}
		this.vbsSaleRegionKey = vbsSaleRegionKey;
	}
	
	
	public String getVbsSaleRegionKey() {
		return this.vbsSaleRegionKey;
	}
		/*
	public String getrecom_timeString() {
		return DateUtils.convertDate2String(FORMAT_RECOM_TIME, getrecom_time());
	}
	public void setrecom_timeString(String value) throws ParseException{
		setrecom_time(DateUtils.convertString2Date(FORMAT_RECOM_TIME,value));
	}*/
	
	public void setRecomTime(Date recomTime) {
	    
		this.recomTime = recomTime;
	}
	
	
	public Date getRecomTime() {
		return this.recomTime;
	}
	public void setOnlineSaleId(String onlineSaleId) {
	    
		    if(StringUtils.isNotBlank(onlineSaleId)){
			 onlineSaleId=onlineSaleId.trim();
			}
		this.onlineSaleId = onlineSaleId;
	}
	
	
	public String getOnlineSaleId() {
		return this.onlineSaleId;
	}
	public void setCustomerAgentId(String customerAgentId) {
	    
		    if(StringUtils.isNotBlank(customerAgentId)){
			 customerAgentId=customerAgentId.trim();
			}
		this.customerAgentId = customerAgentId;
	}
	
	
	public String getCustomerAgentId() {
		return this.customerAgentId;
	}
	public void setIntroducerInviteCode(String introducerInviteCode) {
	    
		    if(StringUtils.isNotBlank(introducerInviteCode)){
			 introducerInviteCode=introducerInviteCode.trim();
			}
		this.introducerInviteCode = introducerInviteCode;
	}
	
	
	public String getIntroducerInviteCode() {
		return this.introducerInviteCode;
	}
	public void setOpenId(String openId) {
	    
		    if(StringUtils.isNotBlank(openId)){
			 openId=openId.trim();
			}
		this.openId = openId;
	}
	
	
	public String getOpenId() {
		return this.openId;
	}
	public void setVbsSaleAgentName(String vbsSaleAgentName) {
	    
		    if(StringUtils.isNotBlank(vbsSaleAgentName)){
			 vbsSaleAgentName=vbsSaleAgentName.trim();
			}
		this.vbsSaleAgentName = vbsSaleAgentName;
	}
	
	
	public String getVbsSaleAgentName() {
		return this.vbsSaleAgentName;
	}
	public void setVbsCityCode(Integer vbsCityCode) {
	    
		this.vbsCityCode = vbsCityCode;
	}
	
	
	public Integer getVbsCityCode() {
		return this.vbsCityCode;
	}
	public void setVbsSalesDepartmentName(String vbsSalesDepartmentName) {
	    
		    if(StringUtils.isNotBlank(vbsSalesDepartmentName)){
			 vbsSalesDepartmentName=vbsSalesDepartmentName.trim();
			}
		this.vbsSalesDepartmentName = vbsSalesDepartmentName;
	}
	
	
	public String getVbsSalesDepartmentName() {
		return this.vbsSalesDepartmentName;
	}
	public void setVbsSalesDepartmentKey(String vbsSalesDepartmentKey) {
	    
		    if(StringUtils.isNotBlank(vbsSalesDepartmentKey)){
			 vbsSalesDepartmentKey=vbsSalesDepartmentKey.trim();
			}
		this.vbsSalesDepartmentKey = vbsSalesDepartmentKey;
	}
	
	
	public String getVbsSalesDepartmentKey() {
		return this.vbsSalesDepartmentKey;
	}
	public void setVbsDivisionName(String vbsDivisionName) {
	    
		    if(StringUtils.isNotBlank(vbsDivisionName)){
			 vbsDivisionName=vbsDivisionName.trim();
			}
		this.vbsDivisionName = vbsDivisionName;
	}
	
	
	public String getVbsDivisionName() {
		return this.vbsDivisionName;
	}
	public void setVbsDivisionKey(String vbsDivisionKey) {
	    
		    if(StringUtils.isNotBlank(vbsDivisionKey)){
			 vbsDivisionKey=vbsDivisionKey.trim();
			}
		this.vbsDivisionKey = vbsDivisionKey;
	}
	
	
	public String getVbsDivisionKey() {
		return this.vbsDivisionKey;
	}
	
	public String toString() {
		return new StringBuffer()
			.append("accountId=").append(getAccountId()).append(",")
			.append("customerName=").append(getCustomerName()).append(",")
			.append("customerIdcard=").append(getCustomerIdcard()).append(",")
			.append("customerMobile=").append(getCustomerMobile()).append(",")
			.append("createTime=").append(getCreateTime()).append(",")
			.append("modifyTime=").append(getModifyTime()).append(",")
			.append("vbsSaleSaleAgentId=").append(getVbsSaleSaleAgentId()).append(",")
			.append("vbsSaleTeamName=").append(getVbsSaleTeamName()).append(",")
			.append("vbsSaleTeamFullKey=").append(getVbsSaleTeamFullKey()).append(",")
			.append("vbsSaleStoreKey=").append(getVbsSaleStoreKey()).append(",")
			.append("vbsSaleStoreName=").append(getVbsSaleStoreName()).append(",")
			.append("vbsSaleCityName=").append(getVbsSaleCityName()).append(",")
			.append("vbsSaleRegionKey=").append(getVbsSaleRegionKey()).append(",")
			.append("recomTime=").append(getRecomTime()).append(",")
			.append("onlineSaleId=").append(getOnlineSaleId()).append(",")
			.append("customerAgentId=").append(getCustomerAgentId()).append(",")
			.append("introducerInviteCode=").append(getIntroducerInviteCode()).append(",")
			.append("openId=").append(getOpenId()).append(",")
			.append("vbsSaleAgentName=").append(getVbsSaleAgentName()).append(",")
			.append("vbsCityCode=").append(getVbsCityCode()).append(",")
			.append("vbsSalesDepartmentName=").append(getVbsSalesDepartmentName()).append(",")
			.append("vbsSalesDepartmentKey=").append(getVbsSalesDepartmentKey()).append(",")
			.append("vbsDivisionName=").append(getVbsDivisionName()).append(",")
			.append("vbsDivisionKey=").append(getVbsDivisionKey()).append(",")
			.toString();
	}
	
	
}

	
