  var i = 0;

    function incNumber1() {
        if (i < 10) {
            i++;
        } else if (i = 10) {
            i = 0;
        }
        document.getElementById("display1").innerHTML = i;
          document.getElementById("displayA").innerHTML = i*250;
          document.getElementById("displayD").innerHTML = i*250+j*270+k*200;
    }

    function decNumber1() {
        if (i > 0) {
            --i;
        } else if (i = 0) {
            i = 10;
        }
        document.getElementById("display1").innerHTML = i;
          document.getElementById("displayA").innerHTML = i*250;
          document.getElementById("displayD").innerHTML = i*250+j*270+k*200;
    }

var j=0;
    function incNumber2() {
        if (j < 10) {
            j++;
        } else if (j = 10) {
            j = 0;
        }
        document.getElementById("display2").innerHTML = j;
        document.getElementById("displayB").innerHTML = j*270;
        document.getElementById("displayD").innerHTML = i*250+j*270+k*200;
        
    }

    function decNumber2() {
        if (j > 0) {
            --j;
        } else if (j = 0) {
            j = 10;
        }
        document.getElementById("display2").innerHTML = j;
        document.getElementById("displayB").innerHTML = j*270;
        document.getElementById("displayD").innerHTML = i*250+j*270+k*200;
    }

var k=0;
    function incNumber3() {
        if (k < 10) {
            k++;
        } else if (k = 10) {
            k = 0;
        }
        document.getElementById("display3").innerHTML = k;
        document.getElementById("displayC").innerHTML = k*200;
         document.getElementById("displayD").innerHTML = i*250+j*270+k*200;
    }

    function decNumber3() {
        if (k > 0) {
            --k;
        } else if (k = 0) {
            k = 10;
        }
        document.getElementById("display3").innerHTML = k;
         document.getElementById("displayC").innerHTML = k*200;
          document.getElementById("displayD").innerHTML = i*250+j*270+k*200;
    }


function add(){
	 a=i*250+j*270+k*200;
	document.getElementById("loki").innerHTML=a;
}

	function thisFunction() {
			alert("Your order successfully registered")		
	}

var k=0;
function show(){
	k="Meet you there"
	i="Meet you there"
	j="Meet you there"
	document.getElementById("some").innerHTML=k;
	document.getElementById("some1").innerHTML=i;
	document.getElementById("some2").innerHTML=j;
}


var k=0;
function show1(){
	k="The Burning Brownie."
	i="The Burning Brownie."
	j="The Burning Brownie."
	document.getElementById("some").innerHTML=k;
	document.getElementById("some1").innerHTML=i;
	document.getElementById("some2").innerHTML=j;
}

function show2(){
	k="Signature Cuisine."
	i="Signature Cuisine."
	j="Signature Cuisine."
	document.getElementById("some").innerHTML=k;
	document.getElementById("some1").innerHTML=i;
	document.getElementById("some2").innerHTML=j;
}

function show3(){
	k="The Golden Era."
	i="The Golden Era."
	j="The Golden Era."
	document.getElementById("some").innerHTML=k;
	document.getElementById("some1").innerHTML=i;
	document.getElementById("some2").innerHTML=j;
}
function show4(){
	k="Oh My Grill."
	i="Oh My Grill."
	j="Oh My Grill."
	document.getElementById("some").innerHTML=k;
	document.getElementById("some1").innerHTML=i;
	document.getElementById("some2").innerHTML=j;
}
function show5(){
	k="Emerald Grill."
	i="Emerald Grill."
	j="Emerald Grill."
	document.getElementById("some").innerHTML=k;
	document.getElementById("some1").innerHTML=i;
	document.getElementById("some2").innerHTML=j;
}


	







