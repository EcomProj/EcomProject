/**
 * Contains the common methods for data process and api calls
 * 
 * Perform Ajax Function Parameters
 * --------------------------------
 * requestUrl: Request url of the controller/service
 * requestMethod: Method type(GET, POST,PUT or DELETE)
 * postData: String json data that to be send as request data to the controller/service
 * callbackFn: Callback function that handles the response data
 * callbackFnArgumentsArray: Callback argument array is the data which we want to send existing data to the callback function
 * contentType: Content type of the requested data
 * 
 * 
 */

function performAJAX(requestUrl, requestMethod, postData, callbackFn,
		callbackFnArgumentsArray, contentType) {
	
	/*$('#loading').html('<img src="resources/images/loader.gif">');*/
	
	
	console.log("URL IS");
/*	var appname	=	appName();
	console.log(appname);
	appname	=	appName()+requestUrl;
	console.log(appname);
	console.log("url is: "+appName()+requestUrl);*/
	console.log("URL IS");
	return $.ajax({
		url : requestUrl,
		data : postData,
		type : requestMethod,
		//crossDomain: true,
		//headers: {'Access-Control-Allow-Origin': '*'},
		contentType : contentType,
		success : function(result, status, xhr) {
			console.log("result is....");
			console.log(result);
			console.log("result is........");
			$('.loader').hide();
			
			callbackFn(result, callbackFnArgumentsArray);
		},
		error : function(xhr, status, error) {
			console.log("Error Block in AJAX response");
			console.log(xhr.readyState);
			console.log(xhr.status);
			console.log(status);
			console.log(error);
			//console.log(xhr.responseText);
		/*	
			 setTimeout(function () {
	                $('#loading').html('');
	            }, 2000);*/
			callbackFn(callbackFnArgumentsArray, callbackFnArgumentsArray);
		}
	});
}






function performAJAXForSubSeqEvent(requestUrl, requestMethod, postData, callbackFn,
		callbackFnArgumentsArray, contentType) {
	
	/*$('#loading').html('<img src="resources/images/loader.gif">');*/
	
	
	console.log("URL IS");
/*	var appname	=	appName();
	console.log(appname);
	appname	=	appName()+requestUrl;
	console.log(appname);
	console.log("url is: "+appName()+requestUrl);*/
	console.log("URL IS");
	return $.ajax({
		url : requestUrl,
		data : postData,
		type : requestMethod,
		//crossDomain: true,
		//headers: {'Access-Control-Allow-Origin': '*'},
		contentType : contentType,
		success : function(result, status, xhr) {
			console.log("result is....");
			console.log(result);
			console.log("result is........");
			$('.loader').hide();
			
			callbackFn(result, callbackFnArgumentsArray);
		},
		error : function(xhr, status, error) {
			console.log("Error Block in AJAX response");
			console.log(xhr.readyState);
			console.log(xhr.status);
			console.log(status);
			console.log(error);
			//console.log(xhr.responseText);
		/*	
			 setTimeout(function () {
	                $('#loading').html('');
	            }, 2000);*/
			callbackFn(callbackFnArgumentsArray, callbackFnArgumentsArray);
		}
	});
}







function performAJAXCron(requestUrl, requestMethod, postData, callbackFn,
		callbackFnArgumentsArray, contentType) {
	
	/*$('#loading').html('<img src="resources/images/loader.gif">');*/
	
	
	console.log("URL IS");
/*	var appname	=	appName();
	console.log(appname);
	appname	=	appName()+requestUrl;
	console.log(appname);
	console.log("url is: "+appName()+requestUrl);*/
	console.log("URL IS");
	return $.ajax({
		url : requestUrl,
		data : postData,
		//async: false,
		type : requestMethod,
		//crossDomain: true,
		//headers: {'Access-Control-Allow-Origin': '*'},
		contentType : contentType,
		success : function(result, status, xhr) {
			console.log("result is....");
			console.log(result);
			console.log("result is........");
		//	$('.loader').hide();
			
			callbackFn(result, callbackFnArgumentsArray);
		},
		error : function(xhr, status, error) {
			console.log("Error Block in AJAX response");
			console.log(xhr.readyState);
			console.log(xhr.status);
			console.log(status);
			console.log(error);
			//console.log(xhr.responseText);
		/*	
			 setTimeout(function () {
	                $('#loading').html('');
	            }, 2000);*/
			callbackFn(callbackFnArgumentsArray, callbackFnArgumentsArray);
		}
	});
}









function performAJAXAsync(requestUrl, requestMethod, postData, callbackFn,
		callbackFnArgumentsArray, contentType) {
	
	/*$('#loading').html('<img src="resources/images/loader.gif">');*/
	
	
	console.log("URL IS");
/*	var appname	=	appName();
	console.log(appname);
	appname	=	appName()+requestUrl;
	console.log(appname);
	console.log("url is: "+appName()+requestUrl);*/
	console.log("URL IS");
	return $.ajax({
		url : requestUrl,
		data : postData,
		async: false,
		type : requestMethod,
		//crossDomain: true,
		//headers: {'Access-Control-Allow-Origin': '*'},
		contentType : contentType,
		success : function(result, status, xhr) {
			console.log("result is....");
			console.log(result);
			console.log("result is........");
		//	$('.loader').hide();
			
			callbackFn(result, callbackFnArgumentsArray);
		},
		error : function(xhr, status, error) {
			console.log("Error Block in AJAX response");
			console.log(xhr.readyState);
			console.log(xhr.status);
			console.log(status);
			console.log(error);
			//console.log(xhr.responseText);
		/*	
			 setTimeout(function () {
	                $('#loading').html('');
	            }, 2000);*/
			callbackFn(callbackFnArgumentsArray, callbackFnArgumentsArray);
		}
	});
}






function bindSubsequentCount(bindingType, installationId, userId, bindid){
	
	//getAllEventsCount 'ParkingCount','90D05CD5-7401-4E35-B7A7-14C7C1F23DEA'
	//vType, userID return EventCount
	var callbackArgs	=	{
			"bindid" : bindid
	}
	
	var data	=	{
			bindingType		:	bindingType,
			installationId	:	installationId,
			userId			:	userId
	}
	
	performAJAX("/"+document.location.pathname.split('/')[1]+"/getsubseqeventscount.do", "GET", data, bindSubsequentCountCallback, callbackArgs);
	//performAJAX("/"+document.location.pathname.split('/')[1]+"/getsubseqeventscount.do", "GET", data, bindSubsequentCountCallback, callbackArgs);
}





function bindSubsequentCountCallback(data, callbackArgs){
	
	data	=	JSON.parse(data);
	$(callbackArgs.bindid).html(data.ssecount);
	
}






//Calling missed event API

function updateMissedEvent(slotid, bindingType, installationId){

	var data	=	{
			type		:	bindingType,
			installationId	:	installationId,
			uid:	$('#userid').val(),
			roleid: $('#roleid').val() 
		}
	
	var callBackArgs	=	{
			
			slotid: slotid
	}
	
	//performAJAX("/"+document.location.pathname.split('/')[1]+"/updatemissedevents.do", "POST", data, updateMissedEventCallback);
	
	performAJAX("http://"+document.location.host+"/vgsservices/updatemissedevents", "POST", data, getCamioEvent, callBackArgs);
}


function updateMissedEventCallback(data, callbackArgs){
	
	console.log("called logout after pause event");
	//$(location).attr('href', 'logoutuser.do');
}









function openLiveViewPD(element){
	var index	=	$(element).closest('.cardbox').find('.indexval').val();
	//var camname	=	$(element).closest('.cardbox').find('.eventcamname').text();
	
	var	installationid	=	$('#installationpdlid'+index).val();
	var	camname	=	$('#cameranameid'+index).val();
	
	//var camname	=	"F191 - Camera 4";
	
	var data	=	{
			installationid	:	installationid,
			cameraname	:	camname
	}
	var callbackArgs	=	{
			camname: 	camname
	}
	
//	$('.loader').show();
	performAJAX("http://"+document.location.host+"/vgsservices/getlivestreaming", "POST", data, getLiveCamioCallback, callbackArgs);
	//performAJAXCron(url, "POST", "", getLiveCamioCallback,  callbackArgs);
    
}





function openLiveView(element){
	var index	=	$(element).closest('.cardbox').find('.indexval').val();
	//var camname	=	$(element).closest('.cardbox').find('.eventcamname').text();
	
	var	installationid	=	$('#installationdlid'+index).val();
	var	camname	=	$('#cameranameid'+index).val();
	
	//var camname	=	"F191 - Camera 4";
	
	var data	=	{
			installationid	:	installationid,
			cameraname	:	camname
	}
	var callbackArgs	=	{
			camname: 	camname
	}
	
//	$('.loader').show();
	performAJAX("http://"+document.location.host+"/vgsservices/getlivestreaming", "POST", data, getLiveCamioCallback, callbackArgs);
	//performAJAXCron(url, "POST", "", getLiveCamioCallback,  callbackArgs);
    
}




var getLiveCamioCallback	=	function (data, callbackArgs){
	
	var base64data = JSON.parse(data);
	var url = base64data.live_streaming.liveurl;
	$('#playlivevideo').html('');
	var appendval = "<div style=' height: 430px;'><object type='application/x-shockwave-flash' id='player' data='./camio_player_plugin/GrindPlayer.swf' width='100%' height='100%' style='visibility: visible;'><param name='allowFullScreen' value='true'><param name='allowScriptAccess' value='always'><param name='wmode' value='opaque'><param name='flashvars' value='autoPlay=true&amp;src="+url+"&amp;streamType=live&amp;scaleMode=letterbox'></object></div>"
	$('#livecamname').val(callbackArgs.camname);
	$('#vidurlid').val(url);
	$('#playlivevideo').append(appendval);
	$('.c-video').serce();
	
}




function setalarmPD(element){
	var index	=	$(element).closest('.cardbox').find('.indexval').val();
	//var camname	=	$(element).closest('.cardbox').find('.eventcamname').text();
	
	var	installationid	=	$('#installationpdlid'+index).val();
	var data	=	{
			installationId	:	installationid,
			level			: 'level2',
			uid:	$('#userid').val(),
			roleid: $('#roleid').val(),
			eventid: $('#eventid'+index).val() 
	}
	
	var callbackArgs	=	{
			index: 	index
	}
	
	performAJAX("http://"+document.location.host+"/vgsservices/callstobealarm", "POST", data, setAlarmCallback, callbackArgs);
	
}

function setalarmDL(element){
	var index	=	$(element).closest('.cardbox').find('.indexval').val();
	//var camname	=	$(element).closest('.cardbox').find('.eventcamname').text();
	
	var	installationid	=	$('#installationdlid'+index).val();
	var data	=	{
			installationId	:	installationid,
			level			: 'level3',
			uid:	$('#userid').val(),
			roleid: $('#roleid').val(),
			eventid: $('#eventid'+index).val()
	}
	var callbackArgs	=	{
			index: 	index
	}
	performAJAX("http://"+document.location.host+"/vgsservices/callstobealarm", "POST", data, setAlarmCallback, callbackArgs);
	
}

function setAlarmCallback(data, callbackArgs){
	
	data	=	JSON.parse(data);
	console.log(data.status);
	$('#pdalarmsgid'+callbackArgs.index).find('.showalarmmsg').html(data.status);
	$('#pdalarmsgid'+callbackArgs.index).show();
	
	setTimeout(function() {
		$('#pdalarmsgid'+callbackArgs.index).hide();
		
	}, 2000);
	
	$('#pdalarmsgid'+callbackArgs.index).find('.showalarmmsg').html('');
	console.log(data.status);
}


/*var appName	=	function appName(){
	 var path = location.pathname.split('/');
		 if (path[path.length-1].indexOf('.do')>-1) {
		   path.length = path.length - 1;
		 }
	 return path[path.length-2];;
}*/