//Q1
const m = '1';
console.log("m");
// m = '4' we are not able to change value of n because while using const we can't change the value

//Q2 : 
var str = "Pulkit Chauhan";
question2(str);
function question2 (str:any){
    if(str.length > 0){
        let strres = str.split(" ");
        console.log(strres);
    }
    else{
        console.log("String is less than 0");
    }
    //return strres;  -   //returning the value of strres
    // but it will not be returned as the scope of let is only within the function .
}

//Q3

var order = {
    id:10,
    title:'order',
    price:100,
    printOrder(){
        console.log(this.id+" "+this.title+" "+this.price)
    },
    getPrice(){
        return this.price;
    }
}

var CopyObject = Object.assign(order);
console.log(CopyObject)

//Q4
let StringArray = ['Tom', 'Ivan', 'Jerry']

var arrowFunction = (StringArray)=>{
   let resArray=[];
    StringArray.map((ele)=>{
       let object={
           name:"",
           length:0
       };
       object.name=ele;
       object.length= ele.length;
       resArray.push(object);
    })
    return resArray;
}
console.log(arrowFunction(StringArray));

//Q5

// // ans A. Defaul values

function add(a,b=10){
   console.log(a+b);
}

add(10,40);
add(5);

// // ans B. 

function userFriends(username,...arg){
   console.log("Name: "+username);
   console.log("Friends: ")
   for(var i in arg){
   console.log(arg[i])
   }
}
userFriends("pulkit","shriya","shantanu","sansakr","aniket");


//  //ans C.
function printCapitalNames(name1,name2,name3,name4,name5){
    console.log("Names after")
    console.log(name1.toUpperCase()+" "+name2.toUpperCase()+" "+name3.toUpperCase()+" "+name4.toUpperCase()+" "+name5.toUpperCase());
} 

var nameList=["pulkit","shriya","shantanu","sansakr","aniket"];
console.log("Names Before: ",nameList)
printCapitalNames(...nameList);

//Q6

let laptop_model="ASUS TUF505DV";
let deskNo=10;
let name="Pulkit";

console.log(`TICKET:
Problem: laptop screen is flickering
laptop Model: ${laptop_model}
deskNo: ${deskNo}
Name: ${name}`);

//Q7

var names = ["PULKI", "SHRIYA","KHAN", "TOM"];
var [firstele,secondele,thirdele,fourthele]= names;
console.log(thirdele);


// //Ans b.

var organization ={
   name:"SRM",
   address:{
       city:"Noida",
       state:"Delhi",
       pincode:110053 
   }
}

const {address:{city:city1,state:state1,pincode:pincode1}}=organization;

console.log(pincode1);

//Q8

class Account{
    constructor(id,name,balance){
        this.id=id;
        this.name= name;
        this.balance = balance;
    }
}
class SavingAccount extends Account{
   constructor(id,name,balance,interest){
          super(id,name,balance);
          this.interest  = interest;
   }
   getBalance(){
       this.totalBalance=0;
       this.totalBalance = this.balance + (this.balance*this.interest);
       return this.totalBalance;
   }
}

class CurrentAccount extends Account{
   constructor(id,name,balance,cash_credit){
          super(id,name,balance);
          this.cash_credit  = cash_credit;
   }
   getBalance(){
       this.totalBalance=0;
       this.totalBalance = this.balance -this.cash_credit;
       return this.totalBalance;
   }
}

var SavingAccountObj = new SavingAccount(11,"Pulkit",8000,10);
console.log(SavingAccountObj.getBalance());

var CurrentAccountObj = new CurrentAccount(11,"Shriya",80000,100);
console.log(CurrentAccountObj.getBalance());





