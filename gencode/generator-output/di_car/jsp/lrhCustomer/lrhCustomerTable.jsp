<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/page/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>聚品商城后台管理平台 | 管理</title>
</head>

<body>
		<table class="table table-striped table-bordered table-hover" id="editable" style="font-size:13px;">
			<thead>
				<tr>
						
						<th style="width:4%">客户姓名</th>
						<th style="width:4%">客户身份证号码</th>
						<th style="width:4%">手机号码</th>
						<th style="width:4%">创建时间</th>
						<th style="width:4%">更新时间</th>
						<th style="width:4%">VBS——销售Id</th>
						<th style="width:4%">VBS——销售所属团队名称</th>
						<th style="width:4%">VBS——销售所属团队代码</th>
						<th style="width:4%">VBS——销售所属门店代码</th>
						<th style="width:4%">VBS——销售所属门店名称</th>
						<th style="width:4%">VBS——销售所属城市</th>
						<th style="width:4%">VBS——销售所属城市代码</th>
						<th style="width:4%">发展客户时间</th>
						<th style="width:4%">线上销售ID</th>
						<th style="width:4%">代理人ID</th>
						<th style="width:4%">介绍人的邀请码</th>
						<th style="width:4%">微信openId</th>
						<th style="width:4%">VBS——销售姓名</th>
						<th style="width:4%">VBS——城市code</th>
						<th style="width:4%">VBS——销售部名称</th>
						<th style="width:4%">VBS——销售部FullKey</th>
						<th style="width:4%">VBS——分部名称</th>
						<th style="width:4%">VBS——分部FullKey</th>
				<th style="width:4%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="item" varStatus="status">
				
						<tr class="gradeX" id="${item.accountId}">
				
						<td><c:out value="${item.customerName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.customerIdcard}" escapeXml="true" /></td>
				
						<td><c:out value="${item.customerMobile}" escapeXml="true" /></td>
				
						<td><c:out value="${item.createTime}" escapeXml="true" /></td>
				
						<td><c:out value="${item.modifyTime}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleSaleAgentId}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleTeamName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleTeamFullKey}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleStoreKey}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleStoreName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleCityName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleRegionKey}" escapeXml="true" /></td>
				
						<td><c:out value="${item.recomTime}" escapeXml="true" /></td>
				
						<td><c:out value="${item.onlineSaleId}" escapeXml="true" /></td>
				
						<td><c:out value="${item.customerAgentId}" escapeXml="true" /></td>
				
						<td><c:out value="${item.introducerInviteCode}" escapeXml="true" /></td>
				
						<td><c:out value="${item.openId}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleAgentName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsCityCode}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSalesDepartmentName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSalesDepartmentKey}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsDivisionName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsDivisionKey}" escapeXml="true" /></td>
				
				     <td class="center">
					 <a href="javascript:void(0);" onclick="toEditPage('${item.accountId}')" class="btn btn-warning btn-sm" role="button">
					     		<span class="glyphicon glyphicon-edit" aria-hidden="true"></span> 修改
					     	</a>
					<a href="javascript:void(0);" onclick="deleteLrhCustomer('${item.accountId}','');" class="btn btn-danger btn-sm" role="button">
					     		<span class="glyphicon glyphicon-trash" aria-hidden="true"></span> 删除
					     	</a>
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
					     	
							
					     	
				     </td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
            
        <!-- table div -->
        <div class="row">
            <%@ include file="/WEB-INF/jsp/page/common/listPage.jsp" %>
        </div>

    <!-- Page-Level Scripts -->
    <script>
    
    </script>

</body>

</html>
