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
						
						<th style="width:8%">登录用户名</th>
						<th style="width:8%">登录密码</th>
						<th style="width:8%">帐号类型（01：客户，02销售）</th>
						<th style="width:8%">创建时间</th>
						<th style="width:8%">更新时间</th>
						<th style="width:8%">我的邀请码标识</th>
						<th style="width:8%">帐号是否启用(1: 已启用，0: 未启用)</th>
						<th style="width:8%">注册时间</th>
						<th style="width:8%">app渠道来源</th>
						<th style="width:8%">手机品牌型号</th>
						<th style="width:8%">注册设备唯一标识</th>
						<th style="width:8%">注册设备类型(android, ios)</th>
				<th style="width:8%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="item" varStatus="status">
				
						<tr class="gradeX" id="${item.accountId}">
				
						<td><c:out value="${item.loginName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.password}" escapeXml="true" /></td>
				
						<td><c:out value="${item.accountType}" escapeXml="true" /></td>
				
						<td><c:out value="${item.createTime}" escapeXml="true" /></td>
				
						<td><c:out value="${item.updateTime}" escapeXml="true" /></td>
				
						<td><c:out value="${item.inviteCode}" escapeXml="true" /></td>
				
						<td><c:out value="${item.isEnabled}" escapeXml="true" /></td>
				
						<td><c:out value="${item.registerTime}" escapeXml="true" /></td>
				
						<td><c:out value="${item.appChannel}" escapeXml="true" /></td>
				
						<td><c:out value="${item.brand}" escapeXml="true" /></td>
				
						<td><c:out value="${item.deviceId}" escapeXml="true" /></td>
				
						<td><c:out value="${item.deviceType}" escapeXml="true" /></td>
				
				     <td class="center">
					 <a href="javascript:void(0);" onclick="toEditPage('${item.accountId}')" class="btn btn-warning btn-sm" role="button">
					     		<span class="glyphicon glyphicon-edit" aria-hidden="true"></span> 修改
					     	</a>
					<a href="javascript:void(0);" onclick="deleteLrhAccount('${item.accountId}','');" class="btn btn-danger btn-sm" role="button">
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
