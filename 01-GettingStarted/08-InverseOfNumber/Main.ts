function inverseOfNumber(n : number) : number {
   let inverse =0;
   let idx =0;

   while(n !=0){
    console.log(0);
    idx++;
    let digit  = n%10;
    n = Math.floor(n/10);
    let pow = Math.pow(10 , digit-1);
    let num = idx * pow;
    inverse = num + inverse;
   }
   return inverse;
}

console.log(inverseOfNumber(28346751));