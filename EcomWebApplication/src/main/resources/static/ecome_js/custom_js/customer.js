 $(document).ready(function(){
       console.log("hi i am here");
       performAJAX("/getcustomer", "GET", "", getCustomerDetailsCallBack);

    });

 
    function getCustomerDetailsCallBack(data){
    	console.log("DATA0"+data);
    	var installationslist = "";
    	var jsondata = JSON.parse(data);
    	
    	var instalationlist = jsondata;
    	$("#custbody").empty();

    		
    		$.each(jsondata, function (index, value) {

    			instalationlist += '<tr><td>' + value.cno + ' </td><td>' + value.cname + ' </td><td>' + value.caddr + ' </td></tr>';

    		})

    		$("#custbody").append(instalationlist);
    }
    
 
