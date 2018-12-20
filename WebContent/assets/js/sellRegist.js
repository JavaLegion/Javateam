/**
 * 
 */

$(function(){
	var sellerName=false ,sellerPsd1=false,  sellerPsd2=false,sellerPhnum=false,sellerCode=false;
	
	$("#sellerSubmit").click(function(){
		if(sellerName&&sellerPsd1&&sellerPsd2&&sellerPhnum&&sellerCode ){
			return true;
		}
		else
           {
			$("#sellerSubmitInfo").text("您还有信息没有填写或者填写错误").css('color','red');
			return false;
			}
	});
	
		$("#sellName").blur(function(){
		var  id=$(this).val();
		var info = $("#sellNameInfo");
		if(id){
			info.text(" √").css('color','green');
			sellerName=true;
		}else{
			info.text("用户名不能为空").css('color','red');
		}
	})
	
	$("#sellerPsd1").blur(function(){
		var  id=$(this).val();
		var info = $("#spsd1Info");
		var info1 = $("#spsd2Info");
		var psd2 = $("#sellerPsd2").val();
		
		if(id){
			if(psd2==""){
				info.text(" √√√").css('color','green');
			}else{
				if(id==psd2){
					info.text(" √").css('color','green');
					sellerPsd1=true;
					info1.text(" √").css('color','green');
				}else{
				info1.text(" 两次输入密码不一致").css('color','red');
						}
				}
			}else{
			info.text("密码不能为空").css('color','red');
		}
	})
//		$("#sellerPsd1").blur(function(){
//		var  id=$(this).val();
//		var info = $("#spsd1Info");
//		if(id){
//			info.text(" √").css('color','green');
//			sellerPsd1=true;
//		}else{
//			info.text("密码不能为空").css('color','red');
//		}
//	})
	
		$("#sellerPsd2").blur(function(){
		var  psd2=$(this).val();
		var  psd1=$("#sellerPsd1").val();
		var info = $("#spsd2Info");
		if(psd2){
			if(psd1==psd2){
				info.text(" √").css('color','green');
				sellerPsd2=true;
				sellerPsd1=true;
			}else{
			info.text(" 两次输入密码不一致").css('color','red');}
		}else{
			info.text("密码不能为空").css('color','red');
		}
	})
	
		$("#sellerPhnum").blur(function(){
		var  id=$(this).val();
		var info = $("#sphnumInfo");
		if(id){
			info.text(" √").css('color','green');
			sellerPhnum=true;
		}else{
			info.text("电话号码不能为空").css('color','red');
		}
	})
	

	
			$("#scheckCode").blur(function(){
		var  scheckCode=$(this).val();
		var info = $("#scheckCodeInfo");
		if(scheckCode){
			$.ajax({
		        url:"checkphoneCodeOfSellerController",
		        type:"post",
		        dataType:"json",
		        data:{"scheckCode":scheckCode},
		        success:function(result){
		        	if(result.flag){
		        		info.text("验证码填写正确").css('color','green');
		        		sellerCode=true;
		        	}
		        } 
		    });
		}else{
			info.text("验证码不能为空").css('color','red');
		}
	})
	
});


    function sendMsg() {
	var phnum=$("#sellerPhnum").val();
	$.ajax({
        url:"getphnum",
        type:"post",
        dataType:"json",
        data:{"phnum":phnum},
        success:function(result){
//       	alert("123");
        } 
	})
  }
