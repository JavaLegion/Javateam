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
    <link href="css/robot.css" rel="stylesheet" type="text/css"/>
    <link href="css/search.css" rel="stylesheet" type="text/css"/>
    
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
                             <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">我的 <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="Message.jsp">我的信息</a></li>
                                <li><a href="ChangeMsg.jsp">修改基本信息</a></li>
                                <li><a href="ChangePwd.jsp">修改密码</a></li>
                            </ul>
                            <li>
                                  <div class="search bar">
                                          <form action="" method="">
                                              <input type="text" id="keyword" onkeyup="getMoreContents()"
           										onblur="keywordBlur()" onfocus="getMoreContents()" placeholder="输入搜索的内容">
                                              <button type="sumbit"></button>
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
            <a href="4.html">
                <dl class="dl-horizontal">
                    <dt><img src="images/logo2.jpg" alt=""/></dt>
                    <dd>
                        <h3>workname（例如：外卖员）</h3>
                        <h5>workreq</h5>
                    <span class="wpw-span">
                       <span>worktime</span>
                       <span>worksalary</span>
                        <span>sworkdate</span>
                        <span>fworkdate</span>
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
<script type="text/javascript">
    var xmlHttp;
    //获得用户输入内容的关联信息的函数
    function getMoreContents() {
        //首先要获得用户输入
        var content = document.getElementById("keyword");
        if (content.value == "") {
            clearContent();
            return;
        }
        //然后要给服务器发送用户输入的内容，因为我们采用的是ajax异步发送数据
        //所以我们要使用一个对象，叫做XmlHttp对象
        xmlHttp = createXMLHttp();
        //要给服务器发送数据
        var url = "search?keyword=" + escape(content.value);
        //true 表示js脚本会在send()方法之后继续执行，而不会等待来自服务器的响应
        xmlHttp.open("GET", url, true);
        //xmlHttp绑定回调方法，这个回调方法会在xmlHttp状态改变的时候调用
        //xmlHttp的状态0-4，我们只关心4(complete)这个状态，因为
        //当数据传输的过程完成之后，在调用回调方法才有意义
        xmlHttp.onreadystatechange = callback;//无()传递的是函数对象
        xmlHttp.send(null);

    }
    //获得XmlHttp对象
    function createXMLHttp() {
        //对于大多数的浏览器都适用
        var xmlHttp;
        if (window.XMLHttpRequest) {
            xmlHttp = new XMLHttpRequest();
        }
        //要考虑浏览器的兼容性
        if (window.ActiveXObject) {
            xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
            if (!xmlHttp) {
                xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");

            }
        }
        return xmlHttp;
    }
    //回调函数
    function callback() {
        //4代表完成
        if (xmlHttp.readyState == 4) {
            //200代表服务器响应成功，404代表资源未找到，500代表服务器内部错误
            if (xmlHttp.status == 200) {
                //交互成功，获得相应的数据，是文本格式
                var result = xmlHttp.responseText;
                //解析获得数据
                var json = eval("(" + result + ")");
                //获得数据之后，就可以动态的显示这些数据了，把这些数据展示到输入框下面
                //alert(json);
                setContent(json);
            }
        }
    }
    //设置关联数据的显示
    function setContent(contents) {
        //清空之前的数据
        clearContent();
        //设置位置
        setLocaltion();
        //首先获得关联数据的长度，由此来确定生成多少个tr
        var size = contents.length;
        //设置内容
        for (var i = 0; i < size; i++) {
            var nextNode = contents[i];//代表的是json格式数据的第i个元素
            var tr = document.createElement("tr");
            var td = document.createElement("td");
            td.setAttribute("border", "0");
            td.setAttribute("gbcolor", "#FFFAFA");

            td.onmouseover = function() {
                this.className = 'mouseOver';
            };

            td.onmouseout = function() {
                this.className = 'mouseOut';
            };
            td.onclick = function() {
                //当选择其中的数据时，关联数据自动设置为输入框的数据
            };
            td.onmousedown = function() {
                //当鼠标点击一个关联数据时，自动在输入框添加数据
                document.getElementById("keyword").value = this.innerText;

            };
            //鼠标悬浮于关联数据上时，自动添加到输入框中
            /* td.onmouseover = function(){
                this.className = 'mouseOver';
                if(td.innerText != null)
                document.getElementById("keyword").value =this.innerText;

            } */
            var text = document.createTextNode(nextNode);
            td.appendChild(text);
            tr.appendChild(td);
            document.getElementById("content_table_body").appendChild(tr);
        }
    }

    //清空数据的方法 (输入框失去焦点，输入其他值等)
    function clearContent() {
        var contentTableBody = document.getElementById("content_table_body");
        var size = contentTableBody.childNodes.length;
        for (var i = size - 1; i >= 0; i--) {
            contentTableBody.removeChild(contentTableBody.childNodes[i]);
        }
        //清除关联数据的外边框
        var popDiv = document.getElementById("popDiv").style.border = "none";
    }
    //当输入框失去焦点的时候
    function keywordBlur() {
        clearContent();
    }
    //设置显示关联信息的位置
    function setLocaltion() {
        //关联信息的显示位置要和输入框一致
        var content = document.getElementById("keyword");
        var width = content.offsetWidth;//输入框的长度
        var left = content["offsetLeft"];//到左边框的距离
        var top = content["offsetTop"] + content.offsetHeight;//到顶部的距离(加上输入框本身的高度)
        //获得显示数据的div
        var popDiv = document.getElementById("popDiv");
        popDiv.style.border = "gray 1px solid";
        popDiv.style.left = left + "px";
        popDiv.style.top = top + "px";
        popDiv.style.width = width + "px";
        document.getElementById("content-table").style.width = width + "px";
    }
</script>
</body>
</html>