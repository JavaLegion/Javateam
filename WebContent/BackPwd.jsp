<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>找回密码</title>
<!-- css -->
<link href="css/message.css" rel="stylesheet">
<!-- js -->
<script src="assets/js/jquery-1.8.2.min.js" ></script>
<script src="assets/js/BackPwd.js" ></script>
</head>
<body>
<div class="mid">
<h1>找回密码</h1>

 	<form action="backStuPwd" method="post">
 	 <select id="consumer" name="consumer">
						<option value="1"  id="student">学生用户</option>
						<option value="2"  id="seller">商家用户</option>
					</select>
        <table>
        
         <tr>
            <td class="">请输入手机号：</td>
            <td><input type="text"  name="stuPhnum"  id="stuPhnum"></td>
            <td><input type="button"  onclick=sendMsg() value="获取验证码"></td>
            <td><span id="stuPhnumInfo"></span></td>
        </tr>
        <tr>
            <td >请输入验证码：</td>
            <td><input type="text"  id="checkCode"  name="checkCode"></td>
           <td><span id="checkCodeInfo"></span></td> 
        </tr>
  <tr>
            <td class="">请输入新密码：</td>
            <td><input type="password"  name="newPwd1"   id="newPwd1"></td>
           <td><span id="newPwd1Info"></span></td>
        </tr>
        
        <tr>
            <td class="">请确认新密码：</td>
            <td><input type="password"  name="newPwd2"  id="newPwd2"></td>
           <td><span id="newPwd2Info"></span></td>
        </tr>
        <tr>
        	<td></td>
        	<td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit"  id="newPwdSubmit"  name="newPwdSubmit" value="提交新密码" ></td>
              <td><span id="newPwdSubmitInfo"></span></td> 
        </tr>
    </table>    
    </form>
</div>	
</body>
</html>