<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>

        
        <title>注册(Regist)</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="assets/css/supersized.css">
        <link rel="stylesheet" href="assets/css/style.css">
        
        <!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js" ></script>
        <script src="assets/js/supersized.3.2.7.min.js" ></script>
        <script src="assets/js/supersized-init.js" ></script>
        <script src="assets/js/scripts.js" ></script>
        <script src="assets/js/rigist.js" ></script>

    </head>

    <body>

        <div class="page-container"   style="display:none;"  id="students">
            <h1>学生注册(Regist) </h1>
            <button id="change2" onclick="students()">我是商家</button>
            <form action="" method="post">
                <input type="text" name="username" class="username" placeholder="请输入您的用户名！">
                <input type="password" name="password1" class="password" placeholder="请输入您的用户密码！">
                <input type="password" name="password2" class="password" placeholder="请再次输入您的用户密码！">
                <input type="text" name="phonenumber" class="password" placeholder="请输入您的手机号码！">
                <input type="Captcha" class="Captcha" name="Captcha" placeholder="请输入验证码！">
                <button type="submit" class="submit_button">注册</button>
               
            </form>
            
        </div>
        <div class="page-container"  id="sellers">
            <h1>商家注册(Regist)</h1>
             <button class="register_ff" id="change" onclick="sellers()"  >我是学生</button>
            <form action="" method="post">
                <input type="text" name="username" class="username" placeholder="请输入您的用户名！">
                <input type="password" name="password1" class="password" placeholder="请输入您的用户密码！">
                <input type="password" name="password2" class="password" placeholder="请再次输入您的用户密码！">
                <input type="text" name="phonenumber" class="password" placeholder="请输入您的手机号码！">
                <input type="Captcha" class="Captcha" name="Captcha" placeholder="请输入验证码！">
                <button type="submit" class="submit_button">注册</button>
               
            </form>
            
        </div>
		


    </body>


</html>