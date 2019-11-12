var v = 12;
function f1() {
   
    console.log(v)
    var v = 13;
}
//f1(); // f1-scope <== global-scope

//-----------------------------------------

//-----------------------------------------------------
//  Functional Programming ( FP )
//-----------------------------------------------------

/*
    

    How to create function in .js-language ?

    2 ways

    1  function-declaration / named function

            ==> Named function
            ==> function-object will create at scope-creation-phase
            ==> always will hoist with function-obj

    2. function-expression

            ==> Anonymous function 
            ==> function-object will create at scope-execution-phase
            

*/

// -------------------------------------------------
// 1  function-declaration
// -------------------------------------------------


//function add(){
  //  console.log('--- add function');
    //return 100+200;
//}

//var sum=add();

//-----------------------



/*
function doTeach(){ // -<< doTeach -<< global scope
    console.log('-- Teaching JS ');
    function doLearn(){ // -<< doLearn --< doTeach
        console.log('-- learning Java Script');
    }
   return doLearn;
}

var lean=doTeach();
lean();
lean();
lean();
lean();
lean();

*/

function doTeach(){ // -<< doTeach -<< global scope
    console.log('-- Teaching JS ');
    function doLearn(){ // -<< doLearn --< doTeach
        console.log('-- learning Java Script');
    }
    function doTask(){
        console.log('-- doing a task on js');
        
    }
   return {doLearn,doTask};
}
//var funObj=doTeach();

//funObj.doTask();
//funObj.doTask();
//-------------------------


var v = 12;
function f1() {
    
    function f2() {
        console.log(v) // f2 scope
    }
    f2();
    var v = 13; // f1 scope
}
//f1();

//----------------------------------

 function takeOrder(){  // parent-scope
     console.log('--- Order isreceived and processing');

     function confirmOrder(){ // child-scope of takeOrder
         console.log('-- Your Order  is confirmed..');
     }
     return confirmOrder;
 }

 //var foodItem=takeOrder();
 //foodItem();
 //foodItem();
 //foodItem();

 //----------------

 function getFood() {
    return "No Food"
}

function getFood(pay) {
    if (arguments.length === 0) return "No Food"
    
    return "Biryani"
}

console.log(getFood())  //? ->  No Food
//console.log(getFood(100)) -> Biryani












