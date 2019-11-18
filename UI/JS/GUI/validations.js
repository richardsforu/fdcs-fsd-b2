function validateForm(){
    var fname=mf.fname.value;
    var lname=mf.lname.value;
    
    if(fname.length===0 || fname==""){
        //alert('First Name is required');
        document.getElementById("firstNameError").innerHTML="First Name is required";
        return false;
    }else{
        document.getElementById("firstNameError").innerHTML=""
    }

    if(lname.length===0 || lname==""){
        //alert('First Name is required');
        document.getElementById("lastNameError").innerHTML="Last Name is required";
        return false;
    }else{
        document.getElementById("lastNameError").innerHTML=""
    }
    return true;
}
