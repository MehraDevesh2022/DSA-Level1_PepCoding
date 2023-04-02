/*
Return a Sorted Array Without Changing the Original Array
A side effect of the sort method is that it changes the order of the elements in the original array. In other words, it mutates the array in place. One way to avoid this is to first concatenate an empty array to the one being sorted (remember that slice and concat return a new array), then run the sort method.

Use the sort method in the nonMutatingSort function to sort the elements of an array in ascending order. The function should return a new array, and not mutate the globalArray variable.

Tests
Passed:Your code should use the sort method.
Passed:The globalArray variable should not change.
Passed:nonMutatingSort(globalArray) should return [2, 3, 5, 6, 9].
Passed:nonMutatingSort(globalArray) should not be hard coded.
Passed:The function should return a new array, not the array passed to it.
Passed:nonMutatingSort([1, 30, 4, 21, 100000]) should return [1, 4, 21, 30, 100000].
Passed:nonMutatingSort([140000, 104, 99]) should return [99, 104, 140000].

*/

const globalArray = [5, 6, 3, 2, 9];

function nonMutatingSort(arr) {
  // Only change code below this line
  let arr1 = [];
  // way 1
  //  arr1 = arr1.concat(arr)
  //way 2
  // arr1 = arr.slice(0)
  // way 3
  arr1 = [...arr];
  return arr1.sort((a, b) => a - b);

  // Only change code above this line
}

nonMutatingSort(globalArray);


// or => 

var globalArray2 = [5, 6, 3, 2, 9];
function nonMutatingSort2(arr) {
  // Add your code below this line
  return [].concat(arr).sort(function (a, b) {
    return a - b;
  });
  // Add your code above this line
}
nonMutatingSort2(globalArray2);