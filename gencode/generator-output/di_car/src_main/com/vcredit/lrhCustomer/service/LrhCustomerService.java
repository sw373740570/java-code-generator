package com.vcredit.lrhCustomer.service;

import com.vcredit.lrhCustomer.entity.LrhCustomer;
import com.vcredit.common.util.Page;
import java.util.List;
import java.util.Map;


/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 11:44:30
 * @see com.vcredit.service.LrhCustomer
 */
public interface LrhCustomerService {
	/**
	 *保存
	 *
	 */
	public Integer  saveLrhCustomer(LrhCustomer entity ) throws Exception;
	/**
	 *修改
	 *
	 */
	public Integer updateLrhCustomerById(LrhCustomer entity ) throws Exception;
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	LrhCustomer selectLrhCustomerById(Object id);
	
	/**
	 *查询分页列表信息
	 *@param page
	 *@param queryMap
	 *@return page
	 */
	Page<LrhCustomer> queryLrhCustomerPage(Page<LrhCustomer> page, Map<String,Object> queryMap);
	
	/**
	 *删除
	 *
	 */
	Integer deleteLrhCustomerById(Object id);
	
		
}
