function summ() {
	var a = document.getElementById("field1").value;
	var b = document.getElementById("field2").value;
	
	var c = (+a) + (+b);
	
	document.getElementById("result").value = c;
}

function div(a,b) {
	var a = document.getElementById("field1").value;
	var b = document.getElementById("field2").value;
	var c =  (+a) - (+b);
	document.getElementById("result").value = c;
}

function tim(a,b) {
	var a = document.getElementById("field1").value;
	var b = document.getElementById("field2").value;
	var c =  (+a) * (+b);
	document.getElementById("result").value = c;
}

function der(a,b) {
	var a = document.getElementById("field1").value;
	var b = document.getElementById("field2").value;
	var c =  (+a) / (+b);
	document.getElementById("result").value = c;
}