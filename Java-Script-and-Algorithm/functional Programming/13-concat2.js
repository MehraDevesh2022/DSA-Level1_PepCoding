/*
JavaScript Algorithms and Data Structures
Functional Programming
Add Elements to the End of an Array Using concat Instead of push
Functional programming is all about creating and using non-mutating functions.

The last challenge introduced the concat method as a way to merge arrays into a new array without mutating the original arrays. Compare concat to the push method. push adds items to the end of the same array it is called on, which mutates that array. Here's an example:

const arr = [1, 2, 3];
arr.push(4, 5, 6);
arr would have a modified value of [1, 2, 3, 4, 5, 6], which is not the functional programming way.

concat offers a way to merge new items to the end of an array without any mutating side effects.

Change the nonMutatingPush function so it uses concat to merge newItem to the end of original without mutating original or newItem arrays. The function should return an array.

Tests
Passed:Your code should use the concat method.
Passed:Your code should not use the push method.
Passed:The first array should not change.
Passed:The second array should not change.
Passed:nonMutatingPush([1, 2, 3], [4, 5]) should return [1, 2, 3, 4, 5].
*/
function nonMutatingPush(original, newItem) {
  // Only change code below this line
  return original.concat(newItem);

  // Only change code above this line
}

const first = [1, 2, 3];
const second = [4, 5];
console.log(nonMutatingPush(first, second));;

