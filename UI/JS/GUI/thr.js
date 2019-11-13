
var mydiv=document.getElementById("d1");

function showData(){
    
    document.getElementById("d1").innerHTML="Data has shown";
}

function hideData(){
    document.getElementById("d1").innerHTML="";
}
function loadImage(){
var imageUrl="<img src='images/img1.png' height='100' width='100'>";
    document.getElementById("d2").innerHTML=imageUrl;
}

function changeColors(colorName){
    var div3=document.getElementById("d3");
    div3.style.color=colorName;
}

function customColor(){
    var colorName=document.getElementById("mc").value;
   // alert(colorName);
   var div4=document.getElementById("d4");
    div4.style.color=colorName;

}

function customColor1(){
    var colorName=document.getElementById("mc1").value;
   // alert(colorName);
   var div5=document.getElementById("d5");
    div5.style.color=colorName;

}

//--------

function changeImage(imageName){
    var imagePath="<img src=./images/"+imageName+".png height='200' width='500'> ";
    document.getElementById("d6").innerHTML=imagePath;
    
}