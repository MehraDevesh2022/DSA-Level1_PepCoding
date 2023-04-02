/*
Falsy Bouncer
Remove all falsy values from an array. Return a new array; do not mutate the original array.

Falsy values in JavaScript are false, null, 0, "", undefined, and NaN.

Hint: Try converting each value to a Boolean.

Tests
Waiting:bouncer([7, "ate", "", false, 9]) should return [7, "ate", 9].
Waiting:bouncer(["a", "b", "c"]) should return ["a", "b", "c"].
Waiting:bouncer([false, null, 0, NaN, undefined, ""]) should return [].
Waiting:bouncer([null, NaN, 1, 2, undefined]) should return [1, 2].
Waiting:You should not mutate arr.
*/


let falseyArr = [false, null, 0, "", undefined , NaN];
function bouncer(arr) {
     let ansArr =[];
     let idx= 0;
    for(let elm  of arr){
         
        if(!falseyArr.includes(elm)){

            ansArr[idx] = elm;
            idx++;
          }
   }
   return ansArr;
}


console.log(bouncer([7, "ate", "", false, 9]));



// soultuion 2  =>
/*
Boolean coercion
Many built-in operations that expect booleans first coerce their arguments to booleans. The operation can be summarized as follows:

Booleans are returned as-is.
undefined turns into false.
null turns into false.
0, -0, and NaN turn into false; other numbers turn into true.
0n turns into false; other BigInts turn into true.
Symbols turn into true.
All objects become true.
Note: A legacy behavior m

*/

function bouncer(arr) {
  return arr.filter(Boolean); // raed behave of Boolean obj avobe basic idea is it truns all falsey value like 0 , "" , NaN  , undefinde to false 
}

console.log(bouncer([7, "ate", "", false, 9]));


// souliton 3 ::::>>>>>>>


function bouncer(arr) {
  let tempArr =[]
  for(let elm of arr){
    if(elm){ // when falsy vaule come they automatically are false
       
         tempArr.push(elm)
    }
  }
    return tempArr;
}

bouncer([7, "ate", "", false, 9]);