<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发布兼职</title>
<link href="css/message.css" rel="stylesheet">
<script type="text/javascript" src="js/Calendar.js"></script>
</head>
<body>
<div class="mid">
<h1>发布兼职</h1>
<form action="IssueJobController" method="post">
        <table>
        <tr>
            <td class="">工作类型：</td>
            <td>
             <div class="box1">
		      <select name="workname" id="">
			    <option value="无">请选择工作类型</option>
				<option value="外卖员">外卖员</option>
				<option value="服务员">服务员</option>
				</select>
				</div>
            </td>
        </tr>
        <tr>
            <td class="">兼职要求：</td>
            <td><textarea class="request" name="workreq"></textarea></td>
        </tr>
        <tr>
            <td class="">兼职时长：</td>
            <td>
            <div class="box1">
		      <select name="worktime" id="">
			    <option value="0">请选择时间</option>
				<option value="1">1小时/天</option>
				<option value="2">2小时/天</option>
				<option value="3">3小时/天</option>
				<option value="4">4小时/天</option>
				<option value="5">5小时/天</option>
				<option value="6">6小时/天</option>
				<option value="7">7小时/天</option>
				<option value="8">8小时/天</option>
				<option value="9">9小时/天</option>
				<option value="10">10小时/天</option>
				<option value="11">11小时/天</option>
				<option value="12">12小时/天</option>
				<option value="13">13小时/天</option>
				<option value="14">14小时/天</option>
				<option value="15">15小时/天</option>
				<option value="16">16小时/天</option>
				<option value="17">17小时/天</option>
				<option value="18">18小时/天</option>
				<option value="19">19小时/天</option>
				<option value="20">20小时/天</option>
				<option value="21">21小时/天</option>
				<option value="22">22小时/天</option>
				<option value="23">23小时/天</option>
				<option value="24">24小时/天</option>
		      </select>
	        </div>                               
            </td>
        </tr>
        <tr>
            <td class="">开始兼职时间：</td>
            <td>
                  <span><input name="sworkdate" type="text" id="sworkdate" class="time" size="10" maxlength="10" onClick="new Calendar().show(this);" readonly="readonly" /></span>		            
            </td>
            </tr>
            <tr>
            <td class="">结束兼职时间：</td>
            <td >            
		          <span><input name="fworkdate" type="text" id="fworkdate" class="time" size="10" maxlength="10" onClick="new Calendar().show(this);" readonly="readonly" /></span>
            </td>
            </tr>
        <tr>
            <td class="">工资：</td>
            <td>
            <div class="box1">
            	<select name="worksalary" id=""> 
            	<option value="0">请选择工资</option>
				<option value="1">1元/时</option>
				<option value="2">2元/时</option>
				<option value="3">3元/时</option>
				<option value="4">4元/时</option>
				<option value="5">5元/时</option>
				<option value="6">6元/时</option>
				<option value="7">7元/时</option>
				<option value="8">8元/时</option>
				<option value="9">9元/时</option>
				<option value="10">10元/时</option>
				<option value="11">11元/时</option>
				<option value="12">12元/时</option>
				<option value="13">13元/时</option>
				<option value="14">14元/时</option>
				<option value="15">15元/时</option>
				<option value="16">16元/时</option>
				<option value="17">17元/时</option>
				<option value="18">18元/时</option>
				<option value="19">19元/时</option>
				<option value="20">20元/时</option>
				<option value="21">21元/时</option>
				<option value="22">22元/时</option>
				<option value="23">23元/时</option>
				<option value="24">24元/时</option>
				<option value="25">25元/时</option>
				<option value="26">26元/时</option>
				<option value="27">27元/时</option>
				<option value="28">28元/时</option>
				<option value="29">29元/时</option>
				<option value="30">30元/时</option>
				<option value="35">35元/时</option>
				<option value="40">40元/时</option>
				<option value="45">45元/时</option>
				<option value="50">50元/时</option>
				<option value="55">55元/时</option>
				<option value="60">60元/时</option>
				<option value="70">70元/时</option>
				<option value="80">80元/时</option>
				<option value="90">90元/时</option>
				<option value="100">100元/时</option>
				<option value="150">150元/时</option>
				<option value="200">200元/时</option>
				<option value="300">300元/时</option>
				<option value="400">400元/时</option>
				<option value="500">500元/时</option>
				<option value="800">800元/时</option>
				<option value="1000">1000元/时</option>
				<option value="2000">2000元/时</option>
				</select>
			</div>
            </td>
        </tr>
        <tr>
           <td>
           <input type="submit" value="确认发布">
           </td>
           <td>
           <input type="reset" value="重置信息">
           </td>
        </tr>
    </table> 
   </form>   
</div>
</body>
</html>