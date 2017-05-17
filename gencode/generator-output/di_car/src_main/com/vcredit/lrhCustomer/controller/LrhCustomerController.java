package  com.vcredit.lrhCustomer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

import com.vcredit.lrhCustomer.entity.LrhCustomer;
import com.vcredit.lrhCustomer.service.LrhCustomerService;
import com.vcredit.common.util.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;


/**
 * 
 * @author <zhangzhizhong>
 * @version  2017-05-10 11:44:30
 * @see com.vcredit.web.LrhCustomer
 */
@Controller
@RequestMapping(value="/lrhcustomer")
public class LrhCustomerController {
	 @Autowired
	private LrhCustomerService lrhCustomerService;
	
	/**
	 * 列表主页面
	 *
	 * @return string
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String lrhCustomerMain(Map<String, Object> map) {
		Page<LrhCustomer> page = new Page<LrhCustomer>(10);
		Map<String, Object> queryMap=new HashMap<String, Object>();
		page = lrhCustomerService.queryLrhCustomerPage(page, queryMap);
		List<LrhCustomer> list = page.getResult();
		map.put("list", list);
		map.put("page", page);
		return "page/lrhCustomer/lrhCustomerList";
	}
	
	/**
	 * 查询
	 *
	 * @return String
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String lrhCustomerList(@ModelAttribute Page<LrhCustomer> page, Map<String, Object> map, @ModelAttribute LrhCustomer lrhCustomer) {		
		Map<String, Object> queryMap=new HashMap<String, Object>();
		queryMap.put("lrhCustomer",lrhCustomer);
		page = lrhCustomerService.queryLrhCustomerPage(page, queryMap);
		List<LrhCustomer> list = page.getResult();
		map.put("list", list);
		map.put("page", page);
		return "page/lrhCustomer/lrhCustomerTable";
	}
	
	/**
	 * 进入新增页面
	 *
	 * @return String
	 */
	@RequestMapping(value = "/addPage", method = RequestMethod.GET)
	public String lrhCustomerAddPage() {
		
		return "page/lrhCustomer/lrhCustomerAdd";
	}
	
	/**
	 * 提交新增
	 *
	 * @param lrhCustomer
	 * @param request
	 * @return String
	 */
	@RequestMapping(value = "/lrhCustomerAdd", method = RequestMethod.PUT, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String lrhCustomerAdd(@ModelAttribute LrhCustomer lrhCustomer, HttpServletRequest request) throws Exception{
		String message="";
		Map<String, Object> result = new HashMap<String,Object>();
		
		int status = lrhCustomerService.saveLrhCustomer(lrhCustomer);

		if(status==0){
			result.put("status",0);
			result.put("message","新增失败！");
		}else{
			result.put("status",1);
			result.put("message","新增成功！");
		}
		message = JSON.toJSONString(result);
		return message;
	}
	
	/**
	 * 进入修改页面
	 *
	 * @param id
	 * @return String
	 */
	@RequestMapping(value = "/editPage/{id}", method = RequestMethod.GET)
	public String lrhCustomerEditPage(Map<String, Object> map,@PathVariable String id) throws Exception{
		//获取实体基本信息
		LrhCustomer lrhCustomer = lrhCustomerService.selectLrhCustomerById(Long.valueOf(id));
		map.put("lrhCustomer", lrhCustomer);

		return "page/lrhCustomer/lrhCustomerEdit";
	}
	
	/**
	 * 提交修改
	 *
	 * @param lrhCustomer
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/lrhCustomerEdit", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String lrhCustomerUpdate(LrhCustomer lrhCustomer, HttpServletRequest request) throws Exception{
		String message = "";
		Map<String, Object> result = new HashMap<String,Object>();
		
		int status = lrhCustomerService.updateLrhCustomerById(lrhCustomer);
		
		if(status==0){
			result.put("status",0);
			result.put("message","修改失败！");
		}else{
			result.put("status",1);
			result.put("message","修改成功！");
		}
		message = JSON.toJSONString(result);
		return message;
	}
	
	/**
	 * 删除
	 *
	 * @param id
	 * @return String
	 */
	@RequestMapping(value = "/lrhCustomerDelete/{id}", method = RequestMethod.DELETE, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String lrhCustomerDelete(@PathVariable String id) {
		String message = "";
		Map<String, Object> result = new HashMap<String,Object>();
		
		int status = lrhCustomerService.deleteLrhCustomerById(Long.valueOf(id));
		if(status==0){
			result.put("status",0);
			result.put("message","修改失败！");
		}else{
			result.put("status",1);
			result.put("message","删除成功！");
		}
		message = JSON.toJSONString(result);
		return message;
	}
}
