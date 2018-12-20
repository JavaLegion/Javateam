$(function(){
	
	var Phnum=false ,checkPhCode=false,  newPwd1=false,newPwd2=false;
	
	$("#newPwdSubmit").click(function(){
		if(stuPhnum&&checkPhCode&&newPwd1&&newPwd2){
			$("#newPwdSubmitInfo").text("√").css('color','green');
			return true;
		}
		else
           {
			$("#newPwdSubmitInfo").text("有信息未填写或填写错误").css('color','red');
			return false;
			}
	});
	
	$("#stuPhnum").blur(function(){
		var  stuPhnum=$(this).val();
		var info = $("#stuPhnumInfo");
		if(stuPhnum){
			$.ajax({
		        url:"checkStuPhnumIsExist",
		        type:"post",
		        dataType:"json",
		        data:{"stuPhnum":stuPhnum,
		        	},
		        success:function(result){
		        	if(result.flag){
		        		info.text("手机号填写正确").css('color','green');
		        		Phnum=true;
		        	}else{
		        		info.text("手机号填写错误").css('color','red');
		        	}
		        } 
		    });
		}else{
			info.text("手机号不能为空").css('color','red');
		}
	})
	
	$("#checkCode").blur(function(){
		var  checkCode=$(this).val();
		var info = $("#checkCodeInfo");
		if(checkCode){
			$.ajax({
		        url:"CheckPhoneCodeController",
		        type:"post",
		        dataType:"json",
		        data:{"checkCode":checkCode},
		        success:function(result){
		        	if(result.flag){
		        		info.text("验证码填写正确").css('color','green');
		        		
		        		checkPhCode=true;
		        	}
		        } 
		    });
		}else{
			info.text("验证码不能为空").css('color','red');
		}
	})


	
	$("#newPwd1").blur(function(){
		var  id=$(this).val();
		var info = $("#newPwd1Info");
		if(id){
			info.text(" √").css('color','green');
			newPwd1=true;
		}else{
			info.text("密码不能为空").css('color','red');
		}
	})
	$("#newPwd2").blur(function(){
		var  psd2=$(this).val();
		var  psd1=$("#newPwd1").val();
		
		var info = $("#newPwd2Info");
		if(psd2){
			if(psd1==psd2){
				info.text(" √").css('color','green');
				newPwd2=true;
			}else{
			info.text(" 两次输入密码不一致").css('color','red');}
		}else{
			info.text("密码不能为空").css('color','red');
		}
	})
})


	function sendMsg() {
	var phnum=$("#stuPhnum").val();
	$.ajax({
        url:"getphnum",
        type:"post",
        dataType:"json",
        data:{"phnum":phnum},
        success:function(result){

        		} 
			})
	}