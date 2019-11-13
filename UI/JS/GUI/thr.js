
var mydiv=document.getElementById("d1");

function showData(){
    mydiv.style.color='blue';
    mydiv.style.backgroundColor='yellow';
    mydiv.style.width='40%';
    mydiv.style.textAlign='center';
    document.getElementById("d1").innerHTML="Data has shown";
}

function hideData(){
    document.getElementById("d1").innerHTML="";
}
function loadImage(){
var imageUrl="<img src='images/img1.png' height='100' width='100'>";
    document.getElementById("d2").innerHTML=imageUrl;
}