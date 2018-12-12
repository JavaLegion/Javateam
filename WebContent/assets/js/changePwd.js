/**
 * 
 */
$(function(){
	

	$("#oldPwd").blur(function(){
		var  id=$(this).val();
		var info = $("#oldPwdInfo");
		if(id){
			info.text(" √").css('color','green');
		}else{
			info.text("原密码不能为空").css('color','red');
		}
	})
	
		$("#newPwd1").blur(function(){
		var  id=$(this).val();
		var info = $("#newPwd1Info");
		if(id){
			info.text(" √").css('color','green');
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
			}else{
			info.text(" 两次输入密码不一致").css('color','red');}
		}else{
			info.text("密码不能为空").css('color','red');
		}
	})
	
	
	
})