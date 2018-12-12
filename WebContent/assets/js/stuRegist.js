/**
 * 
 */

function students(){
	$("#students").slideUp(400);
	$("#sellers").delay(400).slideDown(400);}

function sellers(){
	$("#sellers").slideUp(400);
	$("#students").delay(400).slideDown(400);}

$(function(){
	var stuid=false ,stupsd1=false,  stupsd2=false,stuphnum=false,stucode=false;
                                   	
	$("#stuSubmit").click(function(){
		if(stuid &&stupsd1&&stupsd2&&stuphnum&&stucode ){
			return true;
		}
		else
           {
			$("#stuSubmitInfo").text("您还有信息没有填写或者填写错误").css('color','red');
			return false;
			}
	});
	
	
	$("#stuid").blur(function(){
		var  id=$(this).val();
		var info = $("#stuidInfo");
		if(id){
			$.ajax({
		        url:"CheckStuIdController",
		        type:"post",
		        dataType:"json",
		        data:{"id":id},
		        success:function(result){
		        	if(result.flag){
		        		info.text("用户名填写正确").css('color','green');
		        	}else{
		        		info.text("用户名不可用").css('color','red');
		        	}
		        } 
		    });
			stuid=true;
		}else{
			info.text("用户名不能为空").css('color','red');
		}
	})

	
	$("#psd1").blur(function(){
		var  id=$(this).val();
		var info = $("#psd1Info");
		if(id){
			info.text(" √").css('color','green');
			stupsd1=true;
		}else{
			info.text("密码不能为空").css('color','red');
		}
	})

		$("#psd2").blur(function(){
		var  psd2=$(this).val();
		var  psd1=$("#psd1").val();
		
		var info = $("#psd2Info");
		if(psd2){
			if(psd1==psd2){
				info.text(" √").css('color','green');
				stupsd2=true;
			}else{
			info.text(" 两次输入密码不一致").css('color','red');}
		}else{
			info.text("密码不能为空").css('color','red');
		}
	})
	

		$("#phnum").blur(function(){
		var  id=$(this).val();
		var info = $("#phnumInfo");
		if(id){
			info.text(" √").css('color','green');
			stuphnum=true;
		}else{
			info.text("电话号码不能为空").css('color','red');
		}
	})
	
	
		$("#checkCode").blur(function(){
		var  id=$(this).val();
		var info = $("#checkCodeInfo");
		if(id){
			$.ajax({
		        url:"CheckPhoneController",
		        type:"post",
		        dataType:"json",
		        data:{"id":id},
		        success:function(result){
		        	if(result.flag){
		        		info.text("验证码填写正确").css('color','green');
		        		stucode=true;
		        	}
		        } 
		    });
		}else{
			info.text("验证码不能为空").css('color','red');
		}
	})

});

    function sendMsg() {
	var phnum=$("#phnum").val();
	$.ajax({
        url:"getphnum",
        type:"post",
        dataType:"json",
        data:{"phnum":phnum},
        success:function(result){
//        	alert("123");
        } 
})
	}

















