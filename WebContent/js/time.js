/**
 * 
 */
function CheckTime(){
	var sdate = document.getElementById("sworkdate").value;
	var fdate = document.getElementById("fworkdate").value;
	if(getDate(sdate)-getDate(fdate)>0){
//		$("#CheckTimeInfo").text("结束时间不能小于开始时间").css('color','red');
		alert("结束时间不能小于开始时间");
//     }else if(getDate(sdate)-getDate(fdate)<=0){
//    	 $("#CheckTimeInfo").text("").css('color','green');
		}
}
function getDate(date){
    var dates = date.split("-");
    var dateReturn = '';
    for(var i=0; i<dates.length; i++){
        dateReturn+=dates[i];
    }
    return dateReturn;
}
