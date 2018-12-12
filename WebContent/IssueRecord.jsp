<%@page import="org.apache.catalina.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
    
    <script src="js/ie-emulation-modes-warning.js"></script>
    <script src="js/jquery-3.3.1.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/ie10-viewport-bug-workaround.js"></script>
</head>
<body>
<div class="container marketing">
    <!-- Three columns of text below the carousel -->
    <div class="row">
        <div class="col-xs-6 col-sm-12 col-md-12 col-wxg cw-wxg clearfix">
            <a href="#">
                <dl class="dl-horizontal">
                    <dt><img src="images/logo2.jpg" alt=""/></dt>
                    <dd>
                        <h3>工作类型（例如：外卖员）</h3>
                        <h5>兼职介绍</h5>
                    <span class="wpw-span">
                       <span>兼职起始时间</span>
                       <span>兼职结束时间</span>
                    </span>
                    <span class="wpw-span">
                       <span>兼职时长</span>
                       <span><%=%>out.print(user.getWorksalary())</span>
                    </span>
                    </dd>
                </dl>
            </a>
<!--             <div><textarea></textarea></div> -->
        </div>
        <div class="col-xs-6 col-sm-12 col-md-12 col-wxg cw-wxg clearfix">
            <a href="#">
                <dl class="dl-horizontal">
                    <dt><img src="images/logo2.jpg" alt=""/></dt>
                    <dd>
                        <h3>工作类型（例如：外卖员）</h3>
                        <h5>兼职介绍</h5>
                    <span class="wpw-span">
                       <span>兼职时间地点</span>
                       <span>工资</span>
                    </span>
                    </dd>
                </dl>
            </a>
        </div>
        <div class="col-xs-6 col-sm-12 col-md-12 col-wxg cw-wxg clearfix">
            <a href="#">
                <dl class="dl-horizontal">
                    <dt><img src="images/logo2.jpg" alt=""/></dt>
                    <dd>
                        <h3>工作类型（例如：外卖员）</h3>
                        <h5>兼职介绍</h5>
                    <span class="wpw-span">
                       <span>兼职时间地点</span>
                       <span>工资</span>
                    </span>
                    </dd>
                </dl>
            </a>
        </div>
        <div class="col-xs-6 col-sm-12 col-md-12 col-wxg cw-wxg clearfix">
            <a href="#">
                <dl class="dl-horizontal">
                    <dt><img src="images/logo2.jpg" alt=""/></dt>
                    <dd>
                        <h3>工作类型（例如：外卖员）</h3>
                        <h5>兼职介绍</h5>
                    <span class="wpw-span">
                       <span>兼职时间地点</span>
                       <span>工资</span>
                    </span>
                    </dd>
                </dl>
            </a>
        </div>
        <div class="col-xs-6 col-sm-12 col-md-12 col-wxg cw-wxg clearfix">
            <a href="#">
                <dl class="dl-horizontal">
                    <dt><img src="images/logo2.jpg" alt=""/></dt>
                    <dd>
                        <h3>工作类型（例如：外卖员）</h3>
                        <h5>兼职介绍</h5>
                    <span class="wpw-span">
                       <span>兼职时间地点</span>
                       <span>工资</span>
                    </span>
                    </dd>
                </dl>
            </a>
        </div>
        <div class="col-xs-6 col-sm-12 col-md-12 col-wxg cw-wxg clearfix">
            <a href="#">
                <dl class="dl-horizontal">
                    <dt><img src="images/logo2.jpg" alt=""/></dt>
                    <dd>
                        <h3>工作类型（例如：外卖员）</h3>
                        <h5>兼职介绍</h5>
                    <span class="wpw-span">
                       <span>兼职时间地点</span>
                       <span>工资</span>
                    </span>
                    </dd>
                </dl>
            </a>
        </div>
        <div class="col-xs-6 col-sm-12 col-md-12 col-wxg cw-wxg clearfix">
            <a href="#">
                <dl class="dl-horizontal">
                    <dt><img src="images/logo2.jpg" alt=""/></dt>
                    <dd>
                        <h3>工作类型（例如：外卖员）</h3>
                        <h5>兼职介绍</h5>
                    <span class="wpw-span">
                       <span>兼职时间地点</span>
                       <span>工资</span>
                    </span>
                    </dd>
                </dl>
            </a>
        </div>
        <div class="col-xs-6 col-sm-12 col-md-12 col-wxg cw-wxg clearfix">
            <a href="#">
                <dl class="dl-horizontal">
                    <dt><img src="images/logo2.jpg" alt=""/></dt>
                    <dd>
                        <h3>工作类型（例如：外卖员）</h3>
                        <h5>兼职介绍</h5>
                    <span class="wpw-span">
                       <span>兼职时间地点</span>
                       <span>工资</span>
                    </span>
                    </dd>
                </dl>
            </a>
        </div>

    </div>
    <!--电脑分页-->
    <div class="row rog-page">
        <nav aria-label="">
            <ul class="pagination">
                <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">首页</span></a></li>
                <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
                <li><a href="#">2 <span class="sr-only">(current)</span></a></li>
                <li><a href="#">3 <span class="sr-only">(current)</span></a></li>
                <li><a href="#">4 <span class="sr-only">(current)</span></a></li>
                <li><a href="#">5 <span class="sr-only">(current)</span></a></li>
                <li><a href="#">6 <span class="sr-only">(current)</span></a></li>
                <li><a href="#" aria-label="Next"><span aria-hidden="true">下一页</span></a></li>
            </ul>
        </nav>
    </div>
    <!--电脑分页 end-->
    <!--手机分页-->
    <div class="row row-wphone">
        <div class="row-phone">
            <div>点击查看更多</div>
            <div class="glyphicon glyphicon-menu-down"></div>
        </div>
    </div>
    <!--手机分页 end-->
</div>
</body>
</html>