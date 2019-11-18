//----?

var person={
    pname:'Praveen',
    sayName:function(){
        //console.log('i am '+pname);
        console.log('i am '+person.pname);  // Object level data
        console.log('i am '+emp.pname);
        console.log('i am '+this.pname); // by invocation object content
    }
}

//person.sayName();

var p1=person;
person={pname:'Ria'};
emp={pname:'James'};
//p1.sayName();

//------------------------------------

var p1={pname:'Praveen',sayName:function(){console.log('i am '+this.pname)}}
var p2={pname:'James',sayName:function(){console.log('i am '+this.pname)}}

//p1.sayName();
//p2.sayName();
//-------------------------------------------------------------



//sayNameForAll();

//  function bindings : call , apply , bind 

// Way -1  -> call
function sayNameForAll(greet,city){
    console.log(greet+ ' I am '+this.pname+' from '+city);      
}
var p1={pname:'Praveen',city:'Pune'};
var p2={pname:'James'};
//sayNameForAll.call(p1,'Hi','Bangalore');
//sayNameForAll.call(p2,'Hello','Goa');
//--------------------------------------------

// way - 2 apply

//sayNameForAll.apply(p1,['Hi','Pune']);
//sayNameForAll.apply(p2,['Good Morming!','Delhi']);

// way -3 - > bind
var f1=sayNameForAll.bind(p1);
f1('hi','Delhi');
f1('Hello','pune');
f1('Good Morming','Kolkata');















