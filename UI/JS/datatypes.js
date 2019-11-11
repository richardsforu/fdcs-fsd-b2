//console.log('-- data Types');

/*
   Data Types
   --------------
   2 Types
   1. Primitive Data Types
   2. Referenced Data Types (Objects)

    1. Primitive Data Types
    ---------------------------
        1. Number
        2. String
        3. Boolean
        4. Undefined
        5. null
*/

//  1. Number

var x=100; // Number
x=64.87;
x=-664;

var a=100;
var b=200;

// 2. String

var s1='Praveen';
var s2="James";

var trainer='Praveen';
var sub='Java Script';

var msg='Trainer '+trainer+' is teaching '+sub;

var msg1=`
     Trainer ${trainer} is Teaching 
     ${sub} in Kolkata and sum of ${a} and ${b} is ${a+b}
`

// COmparisn in js
var n1=1000;
var n2=1000;

if(n1===n2){ // === means content and type of variables must be same
    console.log('-- Equls');
}else{
    console.log('-- Not Equal');
    
}

// 3. Boolean

var isMarried=false;

 if(isMarried==true){
    console.log('Married');
    
 }else{
     console.log('Un married');
 }

 //---------------------------

 // 4. undefined
 var s3;

 // 5. null
 var k1=null;

 //-----------------------------------------------------

 // 2. Referenced Data Types

 /*
   -> Array
   -> Date
   -> Object
   -> Timer
 */



