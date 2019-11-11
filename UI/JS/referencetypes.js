

var color1='Red';
var color2=color1;

console.log('color 1 '+color1);
console.log('color 2 '+color2);

//----------------------

color1='Blue';

console.log('color 1 '+color1);
console.log('color 2 '+color2);

//-----------------------------------
// Objects - Reference types

var trainer1=new Object();
trainer1.name='Praveen';

var trainer2=trainer1;

console.log('Trainer 1: '+trainer1.name);
console.log('Trainer 2: '+trainer2.name);

trainer1.name='James';

console.log('Trainer 1: '+trainer1.name);
console.log('Trainer 2: '+trainer2.name);

var date=new Date();
console.log(date);

var menu=new Array();
menu.push('Item1');
menu.push('Item2');
menu.push('Item3');
menu.push('Item4');

//---------------------------

// How many ways Object can be Created?
// 2 ways

// Way 1 - using new keyword

var s1=new Object();
var d1=new Date();
var a1=new Array();

s1.name='Abc';
s1.rno=10;
s1.sub='Science';
s1.marks=884;

//------------------------

// way -2 - Literal style 
// JSON -> Java Script Object Notation

var e1={
    empId:1024,
    name:'James',
    salary:8364.455,
    designation:'Tester',
    address:{
        hno:'10-1091/1',
        s1:'Stree1',
        city:'City 1'
    },
    loc:'Bangalore',
    skills:['Java','JS','Angular','React JS']
}

e1.projId=1000;

//------------

var menu=['m1','m2','m3','m4','m5'];

// Iterate over loop?
for(var m of menu){ // old technique in es5
    console.log(m);
    
}
// ES 6

menu.forEach(m=>{
    console.log(m);
    
})

//-------

var v1=100;
var v1=200;
//-----
//let a1=100;

// Scopes

{
    var e5='James';
}

console.log(e5);

{
    let e6='Praveen'

}

console.log(e6);














