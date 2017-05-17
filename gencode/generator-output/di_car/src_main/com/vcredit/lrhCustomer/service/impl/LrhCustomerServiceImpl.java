package com.vcredit.lrhCustomer.service.impl;


import com.vcredit.lrhCustomer.entity.LrhCustomer;
import com.vcredit.lrhCustomer.service.LrhCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vcredit.common.util.Page;
import java.util.List;
import java.util.Map;

import com.vcredit.lrhCustomer.dao.LrhCustomerDao;



/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 11:44:30
 * @see com.vcredit.service.impl.LrhCustomer
 */
@Service("lrhCustomerService")
public class LrhCustomerServiceImpl implements LrhCustomerService {
	@Autowired
    private LrhCustomerDao lrhCustomerDao;
   
    @Override
	public Integer  saveLrhCustomer(LrhCustomer entity ) throws Exception{
	       return lrhCustomerDao.saveLrhCustomer(entity);
	}

	
	@Override
    public Integer updateLrhCustomerById(LrhCustomer entity ) throws Exception{
	return lrhCustomerDao.updateLrhCustomerById(entity);
    }
	
    @Override
	public LrhCustomer selectLrhCustomerById(Object id){
	 return lrhCustomerDao.selectLrhCustomerById(id);
	}
	
	@Override
	public Page<LrhCustomer> queryLrhCustomerPage(Page<LrhCustomer> page, Map<String,Object> queryMap){
		
		List<LrhCustomer> list = lrhCustomerDao.selectLrhCustomerListByMap(queryMap);
		page.setTotalCount(list.size());
		page.setResult(list);
		return page;
		
	}
	
	@Override
	public Integer deleteLrhCustomerById(Object id){
		return lrhCustomerDao.deleteLrhCustomerById(id);
	}


}
