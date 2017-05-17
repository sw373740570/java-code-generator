package com.vcredit.lrhAccount.service.impl;


import com.vcredit.lrhAccount.entity.LrhAccount;
import com.vcredit.lrhAccount.service.LrhAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vcredit.common.util.Page;
import java.util.List;
import java.util.Map;

import com.vcredit.lrhAccount.dao.LrhAccountDao;



/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 10:46:13
 * @see com.vcredit.service.impl.LrhAccount
 */
@Service("lrhAccountService")
public class LrhAccountServiceImpl implements LrhAccountService {
	@Autowired
    private LrhAccountDao lrhAccountDao;
   
    @Override
	public Integer  saveLrhAccount(LrhAccount entity ) throws Exception{
	       return lrhAccountDao.saveLrhAccount(entity);
	}

	
	@Override
    public Integer updateLrhAccountById(LrhAccount entity ) throws Exception{
	return lrhAccountDao.updateLrhAccountById(entity);
    }
	
    @Override
	public LrhAccount selectLrhAccountById(Object id){
	 return lrhAccountDao.selectLrhAccountById(id);
	}
	
	@Override
	public Page<LrhAccount> queryLrhAccountPage(Page<LrhAccount> page, Map<String,Object> queryMap){
		
		List<LrhAccount> list = lrhAccountDao.selectLrhAccountListByMap(queryMap);
		page.setTotalCount(list.size());
		page.setResult(list);
		return page;
		
	}
	
	@Override
	public Integer deleteLrhAccountById(Object id){
		return lrhAccountDao.deleteLrhAccountById(id);
	}


}
