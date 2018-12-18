<%@page import="org.apache.catalina.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="renderer" content="webkit" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta http-equiv="x-rim-auto-match" content="none">
    <title>发布记录</title>
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">

</head>
<body>
<div class="container marketing">
    <!-- Three columns of text below the carousel -->
    <div class="row">
        <div class="col-xs-6 col-sm-12 col-md-12 col-wxg cw-wxg clearfix">
         <c:forEach items="${userlist}" var="user"> 
        <form action="DisplayDetails" method="post">
                <dl class="dl-horizontal">
                    <dt><img src="images/logo2.jpg" alt=""/></dt>
                    <dd>
                        <h3>${user.workname}</h3>
                        <h5>${user.workreq}</h5>
                    <span class="wpw-span">
                       <span>${user.sworkdate}</span>
                       <span>${user.fworkdate}</span>
                       <span>${user.worktime}</span>
                       <span>${user.worksalary}</span>
                       <input type="hidden" name="workid" value="${user.workid}">
                    </span>
                    <span class="wpw-span">
                    <input type="submit" value="查看详情">
                    </span>
                    </dd>
                </dl>
        </form>
        </c:forEach>
<!--             <div><textarea></textarea></div> -->
        </div>
    </div>
</div>
</body>
</html>