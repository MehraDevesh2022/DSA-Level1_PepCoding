/*
Where do I Belong
Return the lowest index at which a value (second argument) should be inserted into an array (first argument) once it has been sorted. The returned value should be a number.

For example, getIndexToIns([1,2,3,4], 1.5) should return 1 because it is greater than 1 (index 0), but less than 2 (index 1).

Likewise, getIndexToIns([20,3,5], 19) should return 2 because once the array has been sorted it will look like [3,5,20] and 19 is less than 20 (index 2) and greater than 5 (index 1).

Tests
Waiting:getIndexToIns([10, 20, 30, 40, 50], 35) should return 3.
Waiting:getIndexToIns([10, 20, 30, 40, 50], 35) should return a number.
Waiting:getIndexToIns([10, 20, 30, 40, 50], 30) should return 2.
Waiting:getIndexToIns([10, 20, 30, 40, 50], 30) should return a number.
Waiting:getIndexToIns([40, 60], 50) should return 1.
Waiting:getIndexToIns([40, 60], 50) should return a number.
Waiting:getIndexToIns([3, 10, 5], 3) should return 0.
Waiting:getIndexToIns([3, 10, 5], 3) should return a number.
Waiting:getIndexToIns([5, 3, 20, 3], 5) should return 2.
Waiting:getIndexToIns([5, 3, 20, 3], 5) should return a number.
Waiting:getIndexToIns([2, 20, 10], 19) should return 2.
Waiting:getIndexToIns([2, 20, 10], 19) should return a number.
Waiting:getIndexToIns([2, 5, 10], 15) should return 3.
Waiting:getIndexToIns([2, 5, 10], 15) should return a number.
Waiting:getIndexToIns([], 1) should return 0.
Waiting:getIndexToIns([], 1) should return a number.
*/

function getIndexToIns(arr, num) {
  if (arr.length == 0) {
    return 0;
  }

   return arr.sort(function (a, b) {
        return a - b;
      }).indexOf(num);
   
 

  return i;
}
console.log(getIndexToIns([5, 3, 20, 3], 5));



// solution 2 :  => only works on sorted array

function getIndexToIns(arr, num) {
  return arr.sort((a, b) => a - b).indexOf(num); // indexoF method will find postion for given number as per value in sorted arr
}

getIndexToIns([6, 33, 4], 2);