<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/page/common/taglibs.jsp"%>
<%@ include file="/WEB-INF/jsp/page/common/page_head.jsp"%>
<!DOCTYPE html>

<html>
<script src="/script/lrhCustomer/lrhCustomer.js"></script>
<head>
	<title>维信金科后台管理平台 | 管理</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

</head>

<body>

        <div class="row wrapper border-bottom white-bg page-heading">
            <div class="col-lg-10">
            		<h>&nbsp;</h>
                <ol class="breadcrumb">
                    <li>
                        <a href="index.html">主页</a>
                    </li>
                    <li>
                        <a>系统管理</a>
                    </li>
                    <li class="active">
                        <strong>管理</strong>
                    </li>
                </ol>
            </div>
            <div class="col-lg-2">

            </div>
        </div>

        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
                <div class="col-lg-12">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>列表</h5>
                    </div>
                    <form id="searchForm">
                    <div class="ibox-content">
	                    	<div style="float:left;">
							
								<input type="text" class="form-control" style="width:300px; float:left; " id="customerName" name="customerName" placeholder="客户姓名"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="customerIdcard" name="customerIdcard" placeholder="客户身份证号码"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="customerMobile" name="customerMobile" placeholder="手机号码"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="createTime" name="createTime" placeholder="创建时间"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="modifyTime" name="modifyTime" placeholder="更新时间"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsSaleSaleAgentId" name="vbsSaleSaleAgentId" placeholder="VBS——销售Id"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsSaleTeamName" name="vbsSaleTeamName" placeholder="VBS——销售所属团队名称"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsSaleTeamFullKey" name="vbsSaleTeamFullKey" placeholder="VBS——销售所属团队代码"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsSaleStoreKey" name="vbsSaleStoreKey" placeholder="VBS——销售所属门店代码"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsSaleStoreName" name="vbsSaleStoreName" placeholder="VBS——销售所属门店名称"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsSaleCityName" name="vbsSaleCityName" placeholder="VBS——销售所属城市"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsSaleRegionKey" name="vbsSaleRegionKey" placeholder="VBS——销售所属城市代码"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="recomTime" name="recomTime" placeholder="发展客户时间"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="onlineSaleId" name="onlineSaleId" placeholder="线上销售ID"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="customerAgentId" name="customerAgentId" placeholder="代理人ID"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="introducerInviteCode" name="introducerInviteCode" placeholder="介绍人的邀请码"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="openId" name="openId" placeholder="微信openId"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsSaleAgentName" name="vbsSaleAgentName" placeholder="VBS——销售姓名"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsCityCode" name="vbsCityCode" placeholder="VBS——城市code"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsSalesDepartmentName" name="vbsSalesDepartmentName" placeholder="VBS——销售部名称"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsSalesDepartmentKey" name="vbsSalesDepartmentKey" placeholder="VBS——销售部FullKey"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsDivisionName" name="vbsDivisionName" placeholder="VBS——分部名称"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
								<input type="text" class="form-control" style="width:300px; float:left; " id="vbsDivisionKey" name="vbsDivisionKey" placeholder="VBS——分部FullKey"
	                    			onkeypress="enterPress(event)" onkeydown="enterPress()" />&nbsp;&nbsp;
	                    		<input type='text' style='display:none' value="防止表单回车提交事件用"/>
	                    		<button type="button" class="btn btn-outline btn-info" style="width:90px; float:right; " onclick="search();">
	                    			<span class="glyphicon glyphicon-search" aria-hidden="true"></span> 查询</button>
	                    	</div>

				            <div class="" style="float:right">
				            		<a href="javascript:void(0);" onclick="toAddPage();" class="btn btn-primary ">
				            			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span> 新增</a>
				            </div>

			            <!-- 表格 -->
			            <div id="tableDiv">
							<jsp:include page="/WEB-INF/jsp/page/lrhCustomer/lrhCustomerTable.jsp" />
						</div>
                    </div>
                    </form>
                </div>
            </div>
            </div>
		</div>
		
        <div id="deleteConfirmModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span></button>
                        <h4 class="modal-title">删除确认对话框</h4>
                    </div>
                    <div class="modal-body">
                        <p>是否要删除选择的记录？</p>
                        <p>名称：<label id="del_name" ></label></p>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button id="confirm_del" onclick="aaa" type="button" class="btn btn-primary">删除</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>

    <!-- Page-Level Scripts -->
    <script>

    </script>

</body>

</html>
