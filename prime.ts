var checkNum = 1;
var flag = 0;

for(var i =2;i< checkNum;i++){
if(checkNum % i==0){
flag = 1;
}
}
if(flag == 0)
{
console.log("It is prime number");
}

else
{
console.log("It is not prime number");
}
