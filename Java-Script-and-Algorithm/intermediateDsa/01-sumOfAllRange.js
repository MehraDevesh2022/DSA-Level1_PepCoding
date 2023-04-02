/*
Sum All Numbers in a Range
We'll pass you an array of two numbers. Return the sum of those two numbers plus the sum of all the numbers between them. The lowest number will not always come first.

For example, sumAll([4,1]) should return 10 because sum of all the numbers between 1 and 4 (both inclusive) is 10.

Tests
Passed:sumAll([1, 4]) should return a number.
Passed:sumAll([1, 4]) should return 10.
Passed:sumAll([4, 1]) should return 10.
Passed:sumAll([5, 10]) should return 45.
Passed:sumAll([10, 5]) should return 45.
*/

function sumAll(arr) {
  let sum = 0;
  arr = arr.sort((a, b) => a - b);
  for (let i = arr[0]; i <= arr[arr.length - 1]; i++) {
    sum += i;
  }
  console.log(sum);
  return sum;
}

sumAll([1, 4]);

// other way =>

function sumAll(arr) {
  let sumBetween = 0;
  for (let i = Math.min(...arr); i <= Math.max(...arr); i++) {
    sumBetween += i;
  }
  return sumBetween;
}

sumAll([1, 4]);

// 3rd way =>

function sumAll(arr) {
  let max = Math.max(arr[0], arr[1]);
  let min = Math.min(arr[0], arr[1]);
  let sumBetween = 0;
  for (let i = min; i <= max; i++) {
    sumBetween += i;
  }
  return sumBetween;
}

sumAll([1, 4]);