//javascript file for the test
function checkName(e){
	if (!((e.which >= 65 && e.which <= 90) || (e.which>=97 && e.which <=122))){
		e.preventDefault();
	}
}

function courseLoad(){
	var courses = ['Higher Secondary','Graduation','Post Graduation'];
	var handler = document.getElementById('course');
	for(i=0;i<courses.length;i++){
		var ele = document.createElement('option');
		ele.text = courses[i];
		handler.add(ele,i);
	
	}

}
function passShow(){
  var x = document.getElementById("pass");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}

function branchLoad(){
	branchArr=[['Economics','Science','Arts'],['CS','ETC','EE','EEE','IT','Mech. Engg.','Civil Engg.'],['Literature','Modern Arts','VLSI','Advanced Networking','Advanced Construction']];
	var dd= document.getElementById("course");
	var ddOpts= document.getElementById("branch");
	ddOpts.innerHTML=null;
	idx= dd.selectedIndex;
	console.log(idx);


		for(i=0;i<branchArr[idx].length;i++)
        {

        var ele1=document.createElement('option');
                ele1.text=branchArr[idx][i];
				ddOpts.add(ele1,i);     
        }



	}
function checkPass(){
	var mainPass = document.getElementById("pass").value;
	var confirmPass = document.getElementById("duplicate").value;
	if(mainPass != confirmPass){
		alert('the entered passwords must match')
		return false;
	}
}
	
function yearsAgo(){
		var d = new Date();
		var year = d.getFullYear();
		var month = d.getMonth()+1;
		var d = d.getDate();
		if(d<10)
			d='0'+d;
		if(month<10)
			month='0'+month;
		var birth = document.getElementById('dob');	
		var longAgo = year - 18;
		birth.max = longAgo + '-' + month + '-' + d;
		
	}
