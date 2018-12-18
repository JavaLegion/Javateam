<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>兼职信息</title>
        
        <link href="css/message.css" rel="stylesheet">

</head>
<body>
<div class="">
<div class="mid">   
<form action="" method="post">
<h1>兼职信息</h1>   
    <c:forEach items="${userlist}" var="user">   
        <table>
        <tr>
            <td class="">工作类型：</td>
            <td>${user.workname}</td>
        </tr>
                     
        <tr>
            <td class="">兼职要求：</td>
            <td>${user.workreq}</td>
        </tr>
          
        <tr>
            <td class="">兼职时长：</td>
            <td>${user.worktime}</td>
        </tr>
        <tr>
            <td class="">开始兼职时间：</td>
            <td>${user.sworkdate}</td>
        </tr>
        <tr>
            <td class="">结束兼职时间：</td>
            <td>${user.fworkdate}</td>
        </tr>
        <tr>
            <td class="">工资：</td>
            <td>${user.worksalary}</td>
    </table>
      </c:forEach> 
</form>

    </div>   
</div>
</body>
</html>