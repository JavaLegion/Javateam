/**
 * 
 */
$(function(){
	var stuId0=false ,oldPwd0=false,  newPwd1=false,newPwd2=false;
   	
	$("#changPwdSubmit").click(function(){
		if(stuId0 &&newPwd1&&newPwd2&&oldPwd0 ){
			return true;
		}
		else
           {
			$("#changPwdSubmitInfo").text("您还有信息没有填写或者填写错误").css('color','red');
			return false;
			}
	});
	
	$("#stuId").blur(function(){
		var  id=$(this).val();
		var info = $("#stuIdInfo");
		if(id){
			info.text(" √").css('color','green');
			stuId0=true;
		}else{
			info.text("用户名不能为空").css('color','red');
		}
	})

	$("#oldPwd").blur(function(){
		var  oldPwd=$(this).val();
		var stuId=$("#stuId").val();
		var info = $("#oldPwdInfo");	
		if(oldPwd){
			$.ajax({
		        url:"checkMerOldPwdController",
		        type:"post",
		        dataType:"json",
		        data:{"oldPwd":oldPwd,
		        	"stuId":stuId},
		        success:function(result){
		        	if(result.flag){
		        		
		        		info.text("原密码填写正确").css('color','green');
		        	}else{
		        		info.text("原密码填写错误").css('color','red');
		        		
		        	}
		        } 
		    });
			oldPwd0=true;
		}else{
			info.text("原密码不能为空").css('color','red');
		}
	})
	
		$("#newPwd1").blur(function(){
		var  id=$(this).val();
		var info = $("#newPwd1Info");
		if(id){
			info.text(" √").css('color','green');
			newPwd1=true;
		}else{
			info.text("原密码不能为空").css('color','red');
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