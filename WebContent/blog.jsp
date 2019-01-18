<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MyBlog</title>

<!-- Le styles -->
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">
    <!-- <link href="http://ibootstrap-file.b0.upaiyun.com/www.layoutit.com/css/builder/v3/layoutit.css" rel="stylesheet"> -->

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
        <script src="http://ibootstrap-file.b0.upaiyun.com/www.layoutit.com/js/html5shiv.js"></script>
        <![endif]-->
        

    
    <!-- Fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="http://ibootstrap-file.b0.upaiyun.com/www.layoutit.com/img/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="http://ibootstrap-file.b0.upaiyun.com/www.layoutit.com/img/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="http://ibootstrap-file.b0.upaiyun.com/www.layoutit.com/img/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="http://ibootstrap-file.b0.upaiyun.com/www.layoutit.com/img/apple-touch-icon-57-precomposed.png">
    <link rel="shortcut icon" href="http://ibootstrap-file.b0.upaiyun.com/www.layoutit.com/img/favicon.png">
    
    <script type="text/javascript" src="http://cdn.staticfile.org/jquery/2.0.0/jquery.min.js"></script>
    <!-- <script type="text/javascript" src="http://cdn.staticfile.org/jqueryui/1.10.2/jquery-ui.min.js"></script> -->
    <!-- <script type="text/javascript" src="http://cdn.staticfile.org/jqueryui-touch-punch/0.2.2/jquery.ui.touch-punch.min.js"></script> -->
    <script type="text/javascript" src="http://cdn.staticfile.org/twitter-bootstrap/3.0.1/js/bootstrap.min.js"></script>
    
    <!-- <script type="text/javascript" src="http://ibootstrap-file.b0.upaiyun.com/www.layoutit.com/js/jquery.htmlClean.js"></script> -->
    <!-- <script type="text/javascript" src="http://ibootstrap-file.b0.upaiyun.com/www.layoutit.com/js/builder/v3/scripts.min.js"></script> -->
    <script type="text/javascript" src="js/common.js"></script>
    <!--<script type="text/javascript" src="js/bootstrap-modal.js"></script>-->
    <link rel="stylesheet" type="text/css" href="css/mycss.css">
    
</head>
<body>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">Blog</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
					<s:if test="#session.account!=null">
						<li>
							 <a href="#">个性签名:<s:property value="#signure"/></a>
						</li>
					</s:if>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">搜索</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						
						<!-- 登录 -->
						<s:if test="#session.account==null">
							<li><a id="modal-792503" href="#modal-container-792503" role="button" class="btn" data-toggle="modal">登录</a></li>
						</s:if>
						<s:else>
							<li><a data-toggle="modal">欢迎你！<s:property value="#session.account"/></a></li>	
						</s:else>			
			<!-- 登陆框 -->
			<div class="modal fade" id="modal-container-792503" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
							<h4 class="modal-title" id="myModalLabel">
								登录
							</h4>
						</div>
						<div class="modal-body">
                            <div class="col-md-12 column">
                                    <form role="form" action="login_login">
                                        <div class="form-group">
                                                <label for="exampleInputEmail1">账号名</label><input type="text" class="form-control" id="strPassword" name = "strUsername" />
                                        </div>
                                        <div class="form-group">
                                                <label for="exampleInputPassword1">密码</label><input type="password" class="form-control" id="strPassword" name = "strPassword"/>
                                        </div>                        
                                        <div class="checkbox">
                                                <label><input type="checkbox" />记住</label>
                                        </div> <button type="submit" class="btn btn-default">登录</button>
                                    </form>
                                </div>
						</div>
						<div class="modal-footer">
							 <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> <button type="button" class="btn btn-primary" data-dismiss="modal" >确定</button>
						</div>
					</div>
				</div>
			</div>
				
						<!-- 登陆后操作 -->
						<s:if test="#session.account!=null">
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">操作<strong class="caret"></strong></a>
							<ul class="dropdown-menu">	
							 <!-- 注销 -->
							 <li>
							 <a href="login_logout">注销</a>
							 </li>
								<li>
									 <a href="login_goback">管理</a>
								</li>
								<!-- <li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">Separated link</a>
								</li> -->
							</ul>
						</li>
					   </s:if>
					   <s:else>
					   		<li><a id="modal-792504" href="#modal-container-792504" role="button" class="btn" data-toggle="modal">注册</a></li>
							<!-- 注册框 -->
								<div class="modal fade" id="modal-container-792504" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
												<h4 class="modal-title" id="myModalLabel">
													注册
												</h4>
											</div>
											<div class="modal-body">
					                            <div class="col-md-12 column">
					                                    <form role="form" action="login_regist">
					                                        <div class="form-group">
					                                                <label for="exampleInputAccount1">账号名</label><input type="text" class="form-control" id="strPassword" name = "strUsername" />
					                                        </div>
					                                        <div class="form-group">
					                                                <label for="exampleInputPassword1">密码</label><input type="password" class="form-control" id="strPassword" name = "strPassword"/>
					                                        </div>
					                                        <div class="form-group">
					                                                <label for="exampleInputEmail1">邮箱</label><input type="email" class="form-control" id="strEmail" name = "strEmail"/>
					                                        </div>                          
					                                         <button type="submit" class="btn btn-default">注册</button>
					                                    </form>
					                                </div>
											</div>
											<div class="modal-footer">
													<button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
											</div>
										</div>
										
									</div>
									
								</div>
								
					   </s:else>
					</ul>
				</div>
				
			</nav>
			<div class="carousel slide" id="carousel-159175">
				<ol class="carousel-indicators">
					<li class="active" data-slide-to="0" data-target="#carousel-159175">
					</li>
					<li data-slide-to="1" data-target="#carousel-159175">
					</li>
					<li data-slide-to="2" data-target="#carousel-159175">
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="item active">
						<img alt="" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/1/default.jpg" />
						<div class="carousel-caption">
							<h4>
								First Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/2/default.jpg" />
						<div class="carousel-caption">
							<h4>
								Second Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
					<div class="item">
						<img alt="" src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/3/default.jpg" />
						<div class="carousel-caption">
							<h4>
								Third Thumbnail label
							</h4>
							<p>
								Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
							</p>
						</div>
					</div>
				</div> <a class="left carousel-control" href="#carousel-159175" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-159175" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
			<div class="row clearfix">
				<div class="col-md-12 column" id="blog_content">
			
			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="col-md-3 column img_wrapper">
						<div class="img_box">
							<img class="img-responsive center-block"  src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/1/default.jpg">
						</div>
					</div>
					<div class="col-md-9 column">
					<div class="blog_content">
						<h2>
							Heading
						</h2>
						<p>
							Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
						</p>
						<p>
							 <a class="btn" href="#">View details »</a>
						</p>
					</div>
						
					</div>
					</div>
				</div>
			
			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="col-md-3 column img_wrapper">
						<div class="img_box">
							<img class="img-responsive center-block"  src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/1/default.jpg">
						</div>
					</div>
					<div class="col-md-9 column">
					<div class="blog_content">
						<h2>
							Heading
						</h2>
						<p>
							Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
						</p>
						<p>
							 <a class="btn" href="#">View details »</a>
						</p>
					</div>
						
					</div>
					</div>
				</div>
				
				
				
				<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="col-md-3 column img_wrapper">
							<img class="img-responsive center-block"  src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/1/default.jpg">
					</div>
					<div class="col-md-9 column">
						<h2>
							Heading
						</h2>
						<p>
							Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui.
						</p>
						<p>
							 <a class="btn" href="#">View details »</a>
						</p>
					</div>
					</div>
				</div>
		</div>
					<ul class="pagination">
						<li>
							 <a href="#">Prev</a>
						</li>
							<li>
								 <a href="#">1</a>
							</li>
							<li>
								 <a href="#">2</a>
							</li>
							<li>
								 <a href="#">3</a>
							</li>
							<li>
								 <a href="#">4</a>
							</li>
							<li>
								 <a href="#">5</a>
							</li>
						<li>
							 <a href="#">Next</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-12 column">
			<p>
				 <em>Git</em> 是一个分布式的版本控制系统，最初由 <strong>Linus Torvalds</strong> 编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在 <small>Ruby</small> 社区中。
			</p>
		</div>
	</div>
	
	<!-- blog content show -->
	<li><a id="nouse" href="#model-blog-content"  role="button" class="btn" data-toggle="modal">nouse</a></li>
								<div class="modal fade in" style="margin-left:100px" id="model-blog-content" >
									<div class="modal-dialog">
										<div class="modal-content">
											<div class="modal-header">
												 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
												<h4 class="modal-title" id="blog_show_title">
													博客标题
												</h4>
												<small id="blog_show_desc">
													博客描述
												</small>
											</div>
											<div class="modal-body">
					                            <div class="col-md-12 column" id="blog_show_content">
					                                                                                                 博客内容   
					                            </div>
											</div>
											<div class="modal-footer">
													<button type="button" class="btn btn-primary" data-dismiss="modal">关闭</button>
											</div>
										</div>
										
									</div>
									
								</div>
</div>

<script type="text/javascript">

function calc(s){
	var bordT = $(s).outerWidth() - $(s).innerWidth();  
	var paddT = $(s).innerWidth() - $(s).width();  
	var margT = $(s).outerWidth(true) - $(s).outerWidth();
	console.log(bordT);
	console.log(paddT);
	console.log(margT);
}

$(document).ready(function(){
	var returnRet;
	var current_page=1;
	var total_page=0;
	
	var wrapper = $(".img_wrapper");

 	var refresh = (function(){
		var fd = new FormData();
		fd.append("page",current_page);
		xk_post("blog_page",fd,function(ret){
			returnRet = ret;
			var data = JSON.parse(ret.result);
			var total="";
			for(var i=0;i<(data.data.length);i++){
				
				var row="<div class=\"row clearfix\">"+
				"<div class=\"col-md-12 column\">"+
					"<div class=\"col-md-3 column img_wrapper\">"+
							"<img class=\"img-responsive center-block\"  src=\"http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/1/default.jpg\">"+
					"</div>"+
					"<div class=\"col-md-9 column\">"+
						"<h2>"+
					data.data[i].blogTitle+
						"</h2>"+
						"<p>"+
						data.data[i].blogDesc+
						"</p>"+
						"<p>"+
							 "<a class=\"blog_show_info\" blog_id=\""+data.data[i].blogId+"\" href=\"#\">查看详情  »</a>"+
						"</p>"+
					"</div></div></div>";
					
				total+=row;
			}
			$("#blog_content").html(total);
			
			$(".center-block").css("padding-top","25px");
			$(".center-block").height("100"); 
		});
	}); 
 	
 	refresh();
 	
 	(function(){
 		var fd = new FormData();
		fd.append("page",current_page);
		xk_post("blog_count",fd,function(ret){
			total_page = JSON.parse(ret.result).count%10==0?JSON.parse(ret.result).count/10:JSON.parse(ret.result).count/10+1;
			var total="";
			console.log(total_page);
			for(var index=0;index<parseInt(total_page);index++){
				total+="<li><a class=\"page\" name=\""+(index+1)+"\" href=\"#\">"+(index+1)+"</a></li>";
			}
			$(".pagination").html("<li><a  href=\"#\">Prev</a></li>"+total+"<li><a href=\"#\">Next</a></li>");
		});
 	})();
 	
 	
 	$("body").on("click",".page",function(){
 		var fd = new FormData();
		fd.append("page",$(this).attr("name"));
		current_page=$(this).attr("name");
		$(".page").parent().removeClass("active");
		$(this).parent().addClass("active");
		
		refresh();
 	});
 	
 	$("#nouse").hide();
 	$("body").on("click",".blog_show_info",function(){
 		var fd = new FormData();
 		fd.append("id",$(this).attr("blog_id"));
 		xk_post("blog_info",fd,function(ret){
			jsonRet=JSON.parse(ret.result);
			console.log(jsonRet);
			//clear
			$("#blog_show_title").html("");
			$("#blog_show_content").html("");
			$("#blog_show_desc").html("");
			//set
		   $("#blog_show_title").html(jsonRet.data.blogTitle);
		   $("#blog_show_desc").html(jsonRet.data.blogDesc);
		   $("#blog_show_content").html(jsonRet.data.blogContent);
		   $("#nouse").click();
 		});
 	});
});	
</script>

</body>
</html>