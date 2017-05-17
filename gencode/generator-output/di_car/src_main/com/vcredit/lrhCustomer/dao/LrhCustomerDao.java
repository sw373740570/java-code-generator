package com.vcredit.lrhCustomer.dao;

import com.vcredit.lrhCustomer.entity.LrhCustomer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 11:44:30
 * @see com.vcredit.dao.LrhCustomer
 */
@Mapper
public interface LrhCustomerDao{
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
	 * 根据Map查找
	 * @param queryMap
	 * @return list
	 * @throws Exception
	 */
	List<LrhCustomer> selectLrhCustomerListByMap(Map<String,Object> queryMap);
	
	/**
	 *删除
	 *
	 */
	Integer deleteLrhCustomerById(Object id);
	
}
