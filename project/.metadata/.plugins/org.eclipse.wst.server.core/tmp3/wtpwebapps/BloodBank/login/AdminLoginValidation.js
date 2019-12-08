function validate() {
	var flag = false;
	var a = document.getElementById("username");
	var b = document.getElementById("password");
	if (a.value == "admin" && b.value == "admin") {
		flag = true;
	} else
		alert("Wrong Username or Password");
	return flag;

}