function myFunction() {

	var switchOneValue = document.getElementById("switch1").checked;
	var switchTwoValue = document.getElementById("switch2").checked;

	if ((switchOneValue == true && switchTwoValue == true) || (switchOneValue == false && switchTwoValue == false)) {
		
		document.getElementById("myDIV").style.display = "block";
		document.getElementById("myDIV2").style.display = "block";
	} else if (switchOneValue == true && switchTwoValue == false) {
		window.location.href ="http://localhost:8080/ForVegRestaurants";
		document.getElementById("myDIV").style.display = "none";
		document.getElementById("myDIV2").style.display = "block";
	} else if (switchOneValue == false && switchTwoValue == true) {
		window.location.href ="http://localhost:8080/ForNonVegrestaurants";
		document.getElementById("myDIV").style.display = "block";
		document.getElementById("myDIV2").style.display = "none";
	}

}



 const name = document.getElementById("name");
	
	 const form = document.getElementById("form");
	 const errorElement=document.getElementById('error')
	 form.addEventListener('submit',(e)=>{
		let messages=[]
		if(name.value==""||name.value==null)
		messages.push('Decreption is requered other wise it will show error')
		if(messages.length>0){
		 e.preventDefault()
		 errorElement.innerText=messages.join(", ")
		 }
	 })
