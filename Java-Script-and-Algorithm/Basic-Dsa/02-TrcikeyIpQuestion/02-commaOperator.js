// use comma opretaor for manuplating value of variable :
let x =20
let y =null;
// solution :
     // x++ is opertion , after comma value used to asign to y variable
y = (x++ , x);
console.log(y); // output : 21;

y = (x+=40 , x); 
console.log(y);  // output : 41;

y = (x +=20 , 2);
console.log(y); // output : 2;