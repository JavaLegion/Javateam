<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
<!-- css -->
<link href="css/message.css" rel="stylesheet">
<!-- js -->
<script src="assets/js/jquery-1.8.2.min.js" ></script>
<script src="assets/js/changePwd.js" ></script>
</head>
<body>
<div class="mid">
<h1>修改密码</h1>

 	<form action="ChangStuPwdController" method="post">
        <table>
         <tr>
            <td class="">请输入用户名：</td>
            <td><input type="text"  name="stuId"  id="stuId"></td>
           <td><span id="stuIdInfo"></span></td> 
        </tr>
        <tr>
            <td class="">请输入原始密码：</td>
            <td><input type="password"  name="oldPwd"  id="oldPwd"></td>
           <td><span id="oldPwdInfo"></span></td> 
        </tr>
        <tr>
            <td class="">请输入修改密码：</td>
            <td><input type="password" name="newPwd1"  id="newPwd1"></td>
           <td><span id="newPwd1Info"></span></td>
        </tr>
        
        <tr>
            <td class="">确认修改的密码：</td>
            <td><input type="password"  name="newPwd2"  id="newPwd2"></td>
           <td><span id="newPwd2Info"></span></td>
        </tr>
        <tr>
        	<td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	<!-- <input type="button"  value="提交"></td> -->
        	<input type="submit"  id="changPwdSubmit"  name="changPwdSubmit" value="注册" ></td>
                <td><span id="changPwdSubmitInfo"></span></td>
        </tr>
    </table>    
    </form>
</div>	
</body>
</html>