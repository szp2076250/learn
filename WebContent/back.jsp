<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Manage</title>

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
    <script type="text/javascript" src="http://cdn.staticfile.org/twitter-bootstrap/3.0.1/js/bootstrap.min.js"></script>
    
    <script type="text/javascript" src="js/common.js"></script>
</head>

<body>
	<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    管理页 <small>welcome <s:property value="#CurrentUser.userAccount"/>!</small>
                </h1>
            </div>
          
            <ul class="breadcrumb">
                <li>
                    <a href="modify_home">Home</a>
                </li>
                <li class="active">
                    manage
                </li>
            </ul>
               
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row clearfix">
                <div class="col-md-2 column">
                    <div class="list-group">
                        <a href="#" class="list-group-item active">选项</a>
                        <a class="list-group-item " href="#panel-563392" data-toggle="tab">修改资料</a>
                        <a class="list-group-item " href="#panel-blog" data-toggle="tab">写博文</a>
                        <a class="list-group-item " id="enter_blog_list" href="#panel-563393" data-toggle="tab">博文列表
                        <span class="badge"><s:property value="#total_count"/></span></a>
                        <a class="list-group-item " href="#panel-blog-modify" data-toggle="tab">轮播图</a>
                        <a class="list-group-item " href="#panel-563392" data-toggle="tab"><span class="badge">14</span>评论</a>
                    </div>
                </div>
                <div class="col-md-10 column">
                    <div class="tabbable" id="tabs-746709">
                        <ul class="nav nav-tabs">
                            <!-- <li>
                                <a href="#panel-563392" data-toggle="tab">Section 1</a>
                            </li>
                            <li class="active">
                                <a href="#panel-533759" data-toggle="tab">Section 2</a>
                            </li> -->
                        </ul>
                        <div class="tab-content">
                            <div class="tab-pane" id="panel-563392">
                                <p>
                                    <!-- modify user info start-->
                                    <form role="form" action="modify_modify">
                                    	
                                        <div class="form-group">
                                            <label for="exampleInputEmail1">邮箱</label><input type="email" class="form-control" 
                                            value="<s:property value="#CurrentUser.userEmailAddr"/>" 
                                            id="strEmail" name="strEmail"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">密码</label><input type="password" class="form-control" 
                                            value="<s:property value="#CurrentUser.userPassword"/>" 
                                            id="strPassword" name="strPassword"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">重复一次密码</label><input type="password" class="form-control" 
                                            value="<s:property value="#CurrentUser.userPassword"/>"
                                            id="strPasswordRepeat" name="strPasswordRepeat"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">签名</label><input type="text" class="form-control" 
                                            value="<s:property value="#CurrentUser.userSignature"/>" 
                                            id="strSignure" name="strSignure"/>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputFile">上传头像</label><input type="file" 
                                            id="fileHeadImage" name="fileHeadImage"/>
                                        </div>
                                       	注册时间:<s:property value="#CurrentUser.userRegisterTime"/><br/> 
                                        <div class="checkbox">
                                        </div> <button type="submit" class="btn btn-default">提交修改</button>
                                    </form>
                                    <!-- modify user info end-->
                                </p>
                            </div>
                            
                            <!-- blog list start -->
                            <div class="tab-pane" id="panel-563393">
                                
								    <div class="row clearfix">
								        <div class="col-md-12 column">
								            <table class="table table-striped table-hover">
								                <thead>
								                    <tr>
								                        <th>
								                            编号
								                        </th>
								                        <th>
								                            博文标题
								                        </th>
								                        <th>
								                            博文描述
								                        </th>
								                        <th>
								                            发布时间
								                        </th>
								                        <th>
								                            操作
								                        </th>
								                    </tr>
								                </thead>
								                <tbody class="replace_list">
								                

									                <s:iterator value="#blog_first_page" id="item"  status="st">
									                	
									                <s:if test="#st.even">
									                	<tr class="warning">
									                </s:if>
									                <s:else>
									                	<tr class="success">
									                </s:else>
									                <td><s:property value="#st.index+1"/></td>
									               <td><s:property value="#item.blogTitle"/></td>
											 		<td><s:property value="#item.blogDesc" /></td>
											 		<td><s:property value="#item.blogTime" /></td>
											 		<td>
			
			<div class="btn-group">
				 <button class="btn btn-default dropdown-toggle" data-toggle="dropdown">操作</button>
				<ul class="dropdown-menu">
					<li>
						 <a href="#" id="<s:property value="#item.blogId" />" class="blog_item">删除</a>
					</li>
					<li class="divider">
					</li>
					<li>
						 <a href="#panel-blog-modify" id="<s:property value="#item.blogId" />" class="blog_modify_item" data-toggle="tab">编辑</a>
					</li>
				</ul>
			</div>
											 		</td>
									               		</tr>
									                </s:iterator>
									                
							
								                </tbody>
								                
								            </table>
								            <div class="row clearfix">
								                <div class="col-md-4 column">
								                </div>
								                <div class="col-md-4 column">
								                    <ul class="pagination">
								                        <li>
								                            <a href="#">Prev</a>
								                        </li>
								                
								                    <s:bean name="org.apache.struts2.util.Counter" id="counter">
													   <s:param name="first" value="1" />  
													   <s:param name="last" value="#total_count/10+1" />  
													   <s:iterator>				
													     <li ><a href="#" class="page" name="<s:property/>" >
									                        <s:property/>
									                      </a></li>
													   </s:iterator>
													</s:bean>
													
								
								                        <li>
								                            <a href="#">Next</a>
								                        </li>
								                    </ul>
								                   	<script>

								                   		//refresh
								                   		$(".page").click(function(){
								                   			var fd = new FormData();
												    		fd.append("page",$(this).attr("name"));
												    		current_page=$(this).attr("name");
												    		$(".page").parent().removeClass("active");
												    		$(this).parent().addClass("active");
												    		
												    		var base = 10*(parseInt(current_page)-1);
												    		
												    		xk_post("blog_page",fd,function(ret){
												    			returnRet = ret;
																var data = JSON.parse(ret.result);
																var total="";
																for(var i=0;i<(data.data.length);i++){
																	var op = "<td><div class=\"btn-group\">"+
																		 "<button class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">操作</button>"+
																			"<ul class=\"dropdown-menu\">"+
																				"<li><a href=\"\" id=\""+data.data[i].blogId+"\" class=\"blog_item\">删除</a></li>"+
																				"<li class=\"divider\"></li>"+
																				"<li><a href=\"#panel-blog-modify\" id=\""+data.data[i].blogId+"\" class=\"blog_modify_item\" data-toggle=\"tab\">编辑</a></li>"+
																			"</ul></div></td>";
																	
																	var header = (i%2==0?"<tr class=\"warning\">":"<tr class=\"success\">");
																	var row = header+
																	"<td>"+(base+i+1)+"</td>"+
																	"<td>"+data.data[i].blogTitle+"</td>"+
																	"<td>"+data.data[i].blogDesc+"</td>"+
																	"<td>"+data.data[i].blogTime+"</td>"+
																	op+"</tr>";
																	total+=row;
																}
																$(".replace_list").html(total);
												    		});
								                   			
								                   		});
								                   		
								                  
								                   		
								                 $(document).ready(function(){
								              		var returnRet;
							                   		var jsonRet;
							                   		var current_page=1;
													var modify_id = -1;
													
								                	 function refresh(){
															var fd = new FormData();
												    		//fd.append("page",$(this).attr("name"));
												    		//current_page=$(this).attr("name");
												    		fd.append("page",current_page);
												    		//$(".page").parent().removeClass("active");
												    		//$(this).parent().addClass("active");
												    		
												    		var base = 10*(parseInt(current_page)-1);
												    		
															xk_post("blog_page",fd,function(ret){
												    			returnRet = ret;
																var data = JSON.parse(ret.result);
																console.log(data);
																var total="";
																for(var i=0;i<(data.data.length);i++){
																	console.log(data.data[i]);
																	var op = "<td><div class=\"btn-group\">"+
																		 "<button class=\"btn btn-default dropdown-toggle\" data-toggle=\"dropdown\">操作</button>"+
																			"<ul class=\"dropdown-menu\">"+
																				"<li><a href=\"#\" id=\""+data.data[i].blogId+"\" class=\"blog_item\">删除</a></li>"+
																				"<li class=\"divider\"></li>"+
																				"<li><a href=\"#panel-blog-modify\" id=\""+data.data[i].blogId+"\" class=\"blog_modify_item\" data-toggle=\"tab\">编辑</a></li>"+
																			"</ul></div></td>";
																	
																	var header = (i%2==0?"<tr class=\"warning\">":"<tr class=\"success\">");
																	var row = header+
																	"<td>"+(base+i+1)+"</td>"+
																	"<td>"+data.data[i].blogTitle+"</td>"+
																	"<td>"+data.data[i].blogDesc+"</td>"+
																	"<td>"+data.data[i].blogTime+"</td>"+
																	op+"</tr>";
																	total+=row;
																}
																$(".replace_list").html(total);
												    		});
														}
								                	 
								              			//delete
								              			$("body").on("click",".blog_item",function(){
								              				console.log("delete");
								              				var fd = new FormData();
												    		fd.append("id",$(this).attr("id"));
												    		xk_post("blog_delete",fd,function(ret){
												    			refresh();
												    		});
								              			});
								              				
								                   		//enter_modify
								                   		$("body").on("click",".blog_modify_item",function(){
								                   			console.log("enter_modify");
								                   			var fd = new FormData();
								                   			jsonRet=$(this).attr("id");
								                   			console.log("id="+$(this).attr("id"));
								                   			modify_id = $(this).attr("id");
												    		fd.append("id",parseInt($(this).attr("id")));
												    		xk_post("blog_info",fd,function(ret){
												    			jsonRet=JSON.parse(ret.result);
												    			console.log(jsonRet);
												    //clear
												    $("#strBlogTitleModify").val("");
												    $("#strBlogDescModify").val("");
												    editor_modify.txt.html("");
												    //---set
												   $("#strBlogTitleModify").val(jsonRet.data.blogTitle);
												   $("#strBlogDescModify").val(jsonRet.data.blogDesc);
												   editor_modify.txt.html(jsonRet.data.blogContent);
												    		});
								                   		});
								                   		//modify
								                   		$("#blog_modify").click(function(){
								                   			var fd = new FormData();
												    		fd.append("strBlogTitle",$("#strBlogTitleModify").val());
												    		fd.append("strBlogDesc",$("#strBlogDescModify").val());
												    		fd.append("strBlogContent",editor_modify.txt.html());
												    		fd.append("id",modify_id);
												    		xk_post("blog_modify",fd,function(ret){
												    			console.log(ret);
												    			refresh();
												    			$("#enter_blog_list").click();
												    			modify_id = -1;
												    		});
								                   		});
								                   		
								                   
						//add
						$("#blog_submit").click(function(){
				    		var fd = new FormData();
				    		fd.append("strBlogTitle",$("#strBlogTitle").val());
				    		fd.append("strBlogDesc",$("#strBlogDesc").val());
				    		fd.append("strBlogContent",editor.txt.html());
				    		
				    		xk_post("blog_add",fd,function(ret){
				    			refresh();
				    			$("#strBlogTitle").val("");
					    		$("#strBlogDesc").val("");
					    		editor.txt.html("");
				    			$("#enter_blog_list").click();
				    		});
			    	
				    	});
								             	});
								                   	</script>
								                </div>
								                <div class="col-md-4 column">
								                </div>
								            </div>
								        </div>
								    </div>

                            </div>
                            <!-- blog list end -->
                            
                            <div class="tab-pane active" id="panel-533759">
                                <p>
                                    选择选项进行操作。
                                </p>
                            </div>
                         
                    <!-- BlogModifyPageStart -->
                   <div class="tab-pane" id="panel-blog-modify">
                 		<form role="form">
                 		修改...
		                <div class="form-group-modify">
		                    <label for="exampleInputPassword1">博文标题</label><input type="text" class="form-control" 
		                    <%-- value="<s:property value="#CurrentUser.userSignature"/>"  --%>
		                    id="strBlogTitleModify" name="strBlogTitle"/>
		                </div>
		                <div class="form-group">
		                    <label for="exampleInputPassword1">博文描述</label><input type="text" class="form-control" 
		                  <%--   value="<s:property value="#CurrentUser.userSignature"/>"  --%>
		                    id="strBlogDescModify" name="strBlogDesc"/>
		                </div>	                
					
					<!-- EditorStart -->
					<div class="form-group">
		                    <label for="exampleInputPassword1">博文内容</label>
				    <div id="editor-modify">
				      <p>请输入博文内容</p>
				    </div>
				        <script type="text/javascript" src="js/wangEditor.min.js"></script>
					    <script type="text/javascript">
					        var E_M = window.wangEditor
					        var editor_modify = new E_M('#editor-modify')
					        editor_modify.create()
					    </script>
					</div>
				    <!-- EditorEnd -->
				    <button type="button" class="btn btn-default" id="blog_modify">修改</button>
				    </form>	
                  </div>
                  	<script>
                    $("#blog_modify").click(function(){
			    		var fd = new FormData();
			    		fd.append("strBlogTitle",$("#strBlogTitleModify").val());
			    		fd.append("strBlogDesc",$("#strBlogDescModify").val());
			    		fd.append("strBlogContent",editor_modify.txt.html());
			    		
			    		xk_post("blog_modify",fd,function(ret){
		/* 	    			if(ret.resultcode==0) alert("新增成功!"+ret.resultcode);
			    			else alert("新增失败!"+ret.resultcode+ret.data.resultcode); */
			    		});
		    	
			    	});
			    </script>
                  	</script>
				    <!-- BlogModifyPageEnd -->
                            
                   <!-- BlogPageStart -->
                   <div class="tab-pane" id="panel-blog">
                 		<form role="form">
                 		
		                <div class="form-group">
		                    <label for="exampleInputPassword1">博文标题</label><input type="text" class="form-control" 
		                    <%-- value="<s:property value="#CurrentUser.userSignature"/>"  --%>
		                    id="strBlogTitle" name="strBlogTitle"/>
		                </div>
		                <div class="form-group">
		                    <label for="exampleInputPassword1">博文描述</label><input type="text" class="form-control" 
		                  <%--   value="<s:property value="#CurrentUser.userSignature"/>"  --%>
		                    id="strBlogDesc" name="strBlogDesc"/>
		                </div>	                
					
					<!-- EditorStart -->
					<div class="form-group">
		                    <label for="exampleInputPassword1">博文内容</label>
				    <div id="editor">
				      <p>请输入博文内容</p>
				    </div>
				        <script type="text/javascript" src="js/wangEditor.min.js"></script>
					    <script type="text/javascript">
					        var E = window.wangEditor
					        var editor = new E('#editor')
					        editor.create()
					    </script>
					</div>
				    <!-- EditorEnd -->

				    <button type="button" class="btn btn-default" id="blog_submit">提交</button>
				    
				    <script>
				   //before
				    </script>
				    
				    </form>	
                            </div>
                 <!-- BlogPageEnd -->
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <p class="text-info text-center">
                <em>Git</em> 是一个分布式的版本控制系统，最初由 <strong>Linus Torvalds</strong>
                编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在 <small>Ruby</small> 社区中。
            </p>
        </div>
    </div>
</div>
</body>
</html>