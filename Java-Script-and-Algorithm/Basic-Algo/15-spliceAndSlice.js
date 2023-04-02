/*

You are given two arrays and an index.

Copy each element of the first array into the second array, in order.

Begin inserting elements at index n of the second array.

Return the resulting array. The input arrays should remain the same after the function runs.
*/

// soultion one with sperad oprt =>
function frankenSplice(arr1, arr2, n) {
    let tempArr = [...arr2];
    tempArr.splice(n, 0, ...arr1);

  return tempArr;
}

console.log(frankenSplice([1, 2, 3], [4, 5, 6], 1));;


// >>>>>>>>>>>>>>>>>>>>>>>> soultion 2 with slice() : >>>>>>>>>>>>>>>>>>>>>>>>>>>>
function frankenSplice(arr1, arr2, n) {
    let tempArr = arr2.slice();
 
    tempArr.splice(n, 0, ...arr1);

  return tempArr;
}

console.log(frankenSplice([1, 2, 3], [4, 5, 6], 1));;



// solution3  3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

function frankenSplice(arr1, arr2, n) {
  return [...arr2.slice(0, n), ...arr1, ...arr2.slice(n)];
}