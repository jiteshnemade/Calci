/*function add() {
	alert("add called");
	var formElement=document.querySelector("form");
	var formData = new FormData(formElement);
	
	$.post({
	    url: "webapi/myresource/add",
	    data: {
	        formData
	    },
	    success: function(response) {
	    	alert(response);
	        console.log(response);
	    }
	});

}*/

function add() {
	// Create an FormData object 
    var fdata = new FormData($('#form')[0]);
    //alert("Add called in js"+data);
    //alert("hello");
    fdata.append("key","value");
    $.ajax({
        type: "POST",
        enctype: 'multipart/form-data',
        url: "webapi/myresource/add",
        async: false,
        data: fdata,
        processData: false,
        contentType: false,
        cache: false,
        timeout: 600000,
        success: function (data) {

            //$("#result").text(data);
        	alert("Answer = "+data);
            console.log("SUCCESS : ", data);

        },
        error: function (e) {
        	alert("error "+e);
            console.log("ERROR : ", e.responseText);

        }
    });
	
}
function add_json(){
	var op1=document.getElementById("op1").value;
	var op2=document.getElementById("op2").value;
	
}
function sub() {
    // Get form
    var form = $('#form')[0];

	// Create an FormData object 
    var data = new FormData(form);
    //alert("sub called in js"+data);
	$.post({
        enctype: 'multipart/form-data',
        async: false,

	    url: "webapi/myresource/sub",
	    data:data,
	    processData: false,  // Important!
        contentType: false,
        cache: false,

	    success: function(resp , status) {
	    	alert("Answer = "+resp);
	        console.log(status);
	    },
		error : function(resp){
			alert("Error Status : "+resp.responseText);
		}
	});
}
function mul() {
    // Get form
    var form = $('#form')[0];

	// Create an FormData object 
    var data = new FormData(form);
	$.post({
        enctype: 'multipart/form-data',

	    url: "webapi/myresource/mul",
	    async: false,

	    data:data,
	    processData: false,  // Important!
        contentType: false,
        cache: false,

	    success: function(resp , status) {
	    	alert("Answer = "+resp);
	        console.log(status);
	    },
		error : function(resp){
			alert("Error Status : "+resp.responseText);
		}
	});
}
function div() {
    // Get form
    var form = $('#form')[0];

	// Create an FormData object 
    var data = new FormData(form);
	$.post({
        enctype: 'multipart/form-data',

	    url: "webapi/myresource/div",
	    async: false,

	    data:data,
	    processData: false,  // Important!
        contentType: false,
        cache: false,

	    success: function(resp , status) {
	    	alert("Answer = "+resp);
	        console.log(status);
	    },
		error : function(resp){
			alert("Error Status : "+resp.responseText);
		}
	});
}