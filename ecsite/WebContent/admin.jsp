<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<title>admin画面</title>

	<style type="text/css">
	/*=============TAG LAYOUT=============*/
	body {
	  margin: 0;
	  padding: 0;
	  line-height: 1.6;
	  letter-spacing: 1px;
	  font-family: Verdana,Helvetica,sans-serif;
	  font-size: 12px;
	  color: #333;
	  background: #fff;
	}

	table {
	  display: inline-block;
	  text-align: center;
	  margin: auto;
	}
	/*===========ID LAYOUT============*/
	#top {
	  width: 780px;
	  margin: 30px auto;
	  border: 1px solid #333;
	}

	#header {
	  width: 100%;
	  height: 80px;
	  background-color: black;
	}
	#main {
	  width:100%;
	  height: 500px;
	  text-align: center;
	}

	#footer {
	  width: 100%;
	  height: 80px;
	  background-color: black;
	  clear: both;
	}


	</style>
</head>
<body>
		<div id="header">
				<div id="pr">
				</div>
		</div>

		<div id="main">
				<div id="top">
					<p>管理者画面</p>
				</div>


					<table>
						<tr>
							<td>
								<p>商品</p>
								<s:form action="ItemCreateAction">
									<s:submit value="新規登録"/>
								</s:form>


								<s:form action="ItemListAction">
									<s:submit value="商品一覧"/>
								</s:form>
							</td>
						</tr>
					</table>

					<table>
						<tr>
							<td>
								<p>ユーザー</p>
								<s:form action="UserCreateAction">
									<s:submit value="新規登録"/>
								</s:form>


								<s:form action="UserListAction">
									<s:submit value="ユーザー一覧"/>
								</s:form>
							</td>
						</tr>
					</table>

				</div>
				<div id="footer">
					<div id="pr">
					</div>
				</div>


</body>
</html>