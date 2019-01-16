//require jQuery

var Logger = function(){
    var content;
    return function(text){
        console.log(content = text);
    }
}

function HTMLDecode(text) {
    var temp = document.createElement("div");
    temp.innerHTML = text;
    var output = temp.innerText || temp.textContent;
    temp = null;
    return output;
}

var xkLog =(function(){
    this.LogGoTo = function(data,url){
        alert(data);
        window.location.href = url;
    },
    this.webLogger = function(data,msg,fun){
        if(data.resultcode==0){
            alert(msg);
            if(fun) fun();
        }
    }
});

var xKHttpObject = (function(){

    this.xk_simple_post=function(postUrl,postData,funSuccess,funError,funBefore,funComplete){
        $.ajax({
            type: "POST",
            url: postUrl,
            dataType: 'json',
            data: postData,
            success: funSuccess,
            error: funError,
            beforeSend: funBefore,
            complete: funComplete
          });
    },
    this.xk_form_post= function(postUrl,postData,funSuccess,funError,funBefore,funComplete){
        $.ajax({
            type: "POST",
            url: postUrl,
            dataType:'json',
            processData:false,
            contentType:false,
            data:postData,
            success: funSuccess,
            error:funError,
            beforeSend: funBefore,
            complete: funComplete
          });
    }
})

function xk_post(postUrl,postData,funSuccess){
    $.ajax({
        type: "POST",
        url: postUrl,
        dataType:'json',
        processData:false,
        contentType:false,
        data:postData,
        success: funSuccess,
        error: function(err){
          console.log(err);
        }
      });
}
var httpObj = new xKHttpObject();


//获取Get的值
function GetQueryString(name)
{
    var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if(r!=null)return  unescape(r[2]); return null;
}

