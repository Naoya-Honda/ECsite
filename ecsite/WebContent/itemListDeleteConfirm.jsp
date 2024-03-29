<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>商品削除確認画面</title>

<style type="text/css">
/*=============TAG LAYOUT=============*/
body {
	margin: 0;
	padding: 0;
	line-height: 1.6;
	letter-spacing: 1px;
	font-family: Verdana, Helvetica, sans-serif;
	font-size: 12px;
	color: #333;
	background: #fff;
}

table {
	text-align: center;
	margin: 0 auto;
}

/* ========ID LAYOUT======== */
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
	width: 100%;
	height: 500px;
	text-align: center;
}

#footer {
	width: 100%;
	height: 80px;
	background-color: black;
	clear: both;
}

#text-right {
	display: inline-block;
	text-align: right;
}
</style>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>itemListDeleteConfirm</p>
		</div>
		<div>
			<p>商品情報を削除します。よろしいですか？</p>

			<table border="1">
				<tr>
					<th>商品名</th>
					<th>価格</th>
					<th>在庫</th>
					<th>商品登録日</th>
				</tr>
				<s:iterator value="itemInfoDTOList">
					<tr>
						<td><s:property value="itemName" /></td>
						<td><s:property value="itemPrice" /></td>
						<td><s:property value="itemStock" /></td>
						<td><s:property value="insert_date" /></td>
					</tr>
				</s:iterator>
			</table>

			<s:form action="ItemListDeleteCompleteAction">
				<s:submit value="OK" />
			</s:form>
			<s:form action="ItemListAction">
				<s:submit value="キャンセル" />
			</s:form>
		</div>
	</div>

</body>
</html>