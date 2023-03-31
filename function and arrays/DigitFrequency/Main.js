function digitFrequency(digit ,d){
    let arr = String(digit).split("")
    let count =0;
    for(let x of arr){
         if(Number(x)===d){
            count++;
         }
     }
     return count;
}
console.log(digitFrequency([994543234],
 4));