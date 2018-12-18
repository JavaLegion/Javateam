<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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
    <title>大学生兼职网</title>
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
    <link href="css/robot.css" rel="stylesheet" type="text/css"/>
    <link href="css/search.css" rel="stylesheet" type="text/css"/>
    
    <script src="js/ajax.js"></script>
    <script src="js/ie-emulation-modes-warning.js"></script>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/ie10-viewport-bug-workaround.js"></script>
    <script src="js/robot.js"></script>
    
    
</head>
<body>
<div class="navbar-wrapper">
    <div class="container">
            <div class="container">
                <div id="navbar" class="navbar-collapse collapse navbar-right">
                    <ul class="nav navbar-nav navbar-navxg">
                        <li class="active"><a href="Indexpre.jsp">首页</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">查找兼职 <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">按时间</a></li>
                                <li><a href="#">按工资</a></li>
                                <li><a href="#">按地点</a></li>
                                <li role="separator" class="divider"></li>
                                <li class="dropdown-header">Nav header</li>
                                <li><a href="#">Separated link</a></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                        <li><a href="Login.jsp">发布兼职</a></li>
                        <li><a href="Login.jsp">发布记录</a></li>
                        <li><a href="Login.jsp">兼职记录</a></li>
                                   <li>
                        			<span>
                               			 <a href="Login.jsp">登录</a>/
                              			 <a href="Register.jsp">注册</a>
			            			</span>
                                </li>
                            <li>
                                  <div class="search bar">
                                          <form action="" method="">
                                              <input type="text" id="work" onkeyup="getMoreContents()"
           										onblur="workBlur()" onfocus="getMoreContents()" placeholder="输入搜索的内容">
                                              <button type="submit"></button>
                                               <div id="popDiv"> 
             									<table id="content-table" bgcolor="#FFFAFA" border="0" cellspacing="0" cellpadding="0"> 
 									                <tbody id="content_table_body"> 
 									                   <!-- 动态查询出来的数据显示在这里 -->
 									                </tbody> 
             									</table> 
         									  </div> 
                                          </form>
                                  </div>
                            </li>
                    </ul>
                </div>
            </div>
    </div>
</div>
<div id="myCarousel" class="carousel slide car-slide" data-ride="carousel">
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img class="first-slide" src="images/1.jpg">
        </div>
        <div class="item">
            <img class="second-slide" src="images/2.jpg">
        </div>
        <div class="item">
            <img class="third-slide" src="images/3.jpg">
        </div>
        <div class="item">
            <img class="third-slide" src="images/4.jpg">
        </div>
                <div class="item">
            <img class="third-slide" src="images/5.jpg">
        </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon  glyimg-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon  glyimg-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<div class="cont-gxwd">
    <div class="cont-gxtit">
        <span class="con-span">
            <i class="icon iconfont icon-shijian"></i>
            <span>推荐兼职</span>
        </span>

    </div>
</div>
<div class="container marketing">
    <div class="row">
        <div class="col-xs-6 col-sm-12 col-md-12 col-wxg cw-wxg clearfix">
         <c:forEach items="${userlist}" var="user"> 
         <form>
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
                    </span>
                    <span class="wpw-span">
                    <a href="Login.jsp" class="btn btn-primary" role="button">查看详情</a>
                    </span>
                    </dd>
                </dl>
                </form>
        </c:forEach>
<!--             <div><textarea></textarea></div> -->
        </div>
    </div>
</div>

<div class="yb_conct">
  <div class="yb_bar">
    <ul>
      <li class="yb_top">返回顶部</li>
      <li class="yb_phone">13065113592</li>
      <li class="yb_QQ">
      	<a target="_blank" href="https://www.baidu.com/">在线咨询</a>
      </li>
      <li class="yb_ercode" style="height:53px;">微信二维码 <br>
        <img class="hd_qr" src="images/weixin.png" width="125" alt="关注你附近"> </li>
    </ul>
  </div>
</div>
<footer>

    <div class="cp-foonter">
        <div class="container">
            <div class="row pc-foot">
                <div class="col-sm-4 col-md-4 pc-flist">
                    <h3>扫一扫关注Java特工组</h3>
                    <div class="pc-wwx">
                        <img src="images/wwx.jpg" alt=""/>
                    </div>
                </div>
                <div class="col-sm-4 col-md-4 pc-flist">
                    <h3>关于主办方：</h3>
                    <div class="pc-conp">
                        <strong>java特工组</strong><br>
                        java特工组介绍
                    </div>
                </div>
                <div class="col-sm-4 col-md-4 pc-flist pc-flispad">
                    <h3>联系我们</h3>
                    <div class="pc-address">
                        <dl class="dl-horizontal">
                            <dt>邮编：</dt>
                            <dd>330022</dd>
                            <dt>Email：</dt>
                            <dd>1683348030@qq.com</dd>
                            <dt>联系电话：</dt>
                            <dd>13065113592</dd>
                            <dt>地址：</dt>
                            <dd>江西省南昌市南昌县紫阳大道99号</dd>
                        </dl>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="pcy">
        <span>
            技术支持：<a href="#">x3512工作室</a>
        </span>
    </div>
</footer>
</body>
        <script>
            $(document).ready(function(){
                dropdownOpen();//调用
            });
            /**
             * 鼠标划过就展开子菜单，免得需要点击才能展开
             */
            function dropdownOpen() {

                var $dropdownLi = $('li.dropdown');

                $dropdownLi.mouseover(function() {
                    $(this).addClass('open');
                }).mouseout(function() {
                    $(this).removeClass('open');
                });
            }
        </script>
</html>