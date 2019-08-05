 
function makeAjaxCall(){
    var form = $("#employeeForm");
    var JSONObj = serializeObject(form);
	$.ajax({
        type : "POST",
        url : "http://localhost:8080/RestfulEmployee_Lab11/api/addEmployee",
        data : JSON.stringify(JSONObj),
        contentType: "application/json",
        dataType : "json",
		success: function(employee) {
			$('#formInput').html("");
			$("#formInput").append( '<H3 align="center"> New Employee Information <H3>');                
			$('#formInput').append("<H4 align='center'>First Name:  " +  employee.firstName + "</h4>"  );
			$('#formInput').append("<H4 align='center'>Last Name: " +  employee.lastName+ "</h4>" );
			$('#formInput').append("<H4 align='center'>Email: " + employee.email  + "</h4>");
			$("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
			make_visible('formInput');
			make_hidden('errors');
		},

		error: function(response){
            make_visible('errors');
            $('#errors').html('');
            $('#errors').append('<H3 align="center"> Errors(s)!! <H3>');
            jQuery.each(response.responseJSON.errors, function() {
                // $("#" + this).text("My id is " + this + ".");
                // return (this != "four"); // will stop running to skip "five"
                $('#errors').append('<p align="left"> '+ this.message+' <p>');
                // alert(this.message)
            });

            // alert(JSON.stringify(JSON.stringify(response.responseJSON.errors)));
		}
	
	});
}

toggle_visibility = function(id) {
    var element = document.getElementById(id);
    if(element.style.display == 'block')
    	element.style.display = 'none';
    else
    	element.style.display = 'block';
 }	

make_hidden = function(id) {
    var element = document.getElementById(id);
    element.style.display = 'none';
        }	   

make_visible = function(id) {
    var element = document.getElementById(id);
    element.style.display = 'block';
 }	   

resetForm = function(id) {
    var element = document.getElementById(id);
    $(element)[0].reset();

    }	  

// Translate form to array
// Then put in JSON format
 function serializeObject (form)
{
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
         	jsonObject[this.name] = this.value;
    });
    return jsonObject;

};

