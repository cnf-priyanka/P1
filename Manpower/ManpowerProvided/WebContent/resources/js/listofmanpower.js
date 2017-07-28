function validate(){
	var name= document.getElementById("name");
	var state=document.getElementById("state");
	var district=document.getElementById("district");
	var designation=document.getElementById("designation");
	var email=document.getElementById("email");
	var poorder=document.getElementById("poorder");
	var phone=document.getElementById("phone");
	var dtofJoining=document.getElementById("dtofJoining");
	
	if(document.myForm.name.value==""){
		
		alert("Please provide your name!");
		document.myForm.name.focus();
		return false;
	}
if(document.myForm.state.value==""){
		
		alert("Please provide State!");
		document.myForm.state.focus();
		return false;
	}
if(document.myForm.district.value==""){
	
	alert("Please provide District!");
	document.myForm.district.focus();
	return false;
}
if(document.myForm.email.value==""){
	
	alert("Please provide Email!");
	document.myForm.email.focus();
	return false;
}
if(document.myForm.poorder.value==""){
	
	alert("Please provide PO Order!");
	document.myForm.poorder.focus();
	return false;
}
if(document.myForm.dtofJoining.value==""){
	
	alert("Please provide Date of Joining!");
	document.myForm.dtofJoining.focus();
	return false;
}
}