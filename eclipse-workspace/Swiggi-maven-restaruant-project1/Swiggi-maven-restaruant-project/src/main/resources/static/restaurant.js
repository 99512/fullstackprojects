function myFunction() {

	var switchOneValue = document.getElementById("switch1").checked;
	var switchTwoValue = document.getElementById("switch2").checked;

	if ((switchOneValue == true && switchTwoValue == true) || (switchOneValue == false && switchTwoValue == false)) {
		document.getElementById("myDIV").style.display = "block";
		document.getElementById("myDIV2").style.display = "block";
	} else if (switchOneValue == true && switchTwoValue == false) {
		document.getElementById("myDIV").style.display = "none";
		document.getElementById("myDIV2").style.display = "block";
	} else if (switchOneValue == false && switchTwoValue == true) {
		document.getElementById("myDIV").style.display = "block";
		document.getElementById("myDIV2").style.display = "none";
	}

}

