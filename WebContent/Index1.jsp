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
    <title>大学生兼职网</title>
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
<div class="navbar-wrapper">
    <div class="container">
        <nav class="navbar  navbar-static-top">
            <div class="container">
            <!-- 大学生兼职网logo -->
                <div class="navbar-header navbar-relative">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-logo" href="#">
                        <img src="images/.jpg" alt=""/>
                    </a>
                </div>
                <div id="navbar" class="navbar-collapse collapse navbar-right">
                    <ul class="nav navbar-nav navbar-navxg">
                        <li class="active"><a href="Index.jsp">首页</a></li>
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
                        <li><a href="MyRecord.jsp">兼职记录</a></li>
                        <li>
                        <div >
                               <a href="Login.jsp">登录</a>/
                               <a href="Register.jsp">注册</a>
			            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
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
    </div>
</div>
<!--导航 end-->
<!-- Carousel
================================================== -->
<div id="myCarousel" class="carousel slide car-slide" data-ride="carousel">
    <!-- Indicators -->
    <!--<ol class="carousel-indicators">-->
    <!--<li data-target="#myCarousel" data-slide-to="0" class="active"></li>-->
    <!--<li data-target="#myCarousel" data-slide-to="1"></li>-->
    <!--<li data-target="#myCarousel" data-slide-to="2"></li>-->
    <!--</ol>-->
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
<!-- /.container -->
<footer>

    <div class="cp-foonter">
        <div class="container">
            <!--电脑footer-->
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
            <!--电脑footer end-->
            <!--手机footer-->
            <div class="row ph-footer">
                <div class="col-xs-4 ph-foimg">
                    <img src="images/wwx.jpg" alt=""/>
                </div>
                <div class="col-xs-8 ph-focont">
                    <h3>010-81301045</h3>
                    <h4>中国 · 北京 · 北京中科服科技有限公司</h4>
                    <div class="media">
                        <div class="media-left">
                            地址：
                        </div>
                        <div class="media-body">
                            北京市石景山区中关村科技园实
                            兴大街30号院17号楼4层
                        </div>
                    </div>
                    <div class="media">
                        <div class="media-left">
                            地址：
                        </div>
                        <div class="media-body">
                            保定市新市区绿都皇城
                        </div>
                    </div>
                </div>
            </div>
            <!--手机footer end-->
        </div>
    </div>
    <!--公用部分-->
    <div class="pcy">
        <span>
            技术支持：<a href="http://www.zhongkefu.com.cn/">x3512工作室</a>
        </span>
    </div>
    <!--公用部分 end-->

</footer>
</body>
</html>