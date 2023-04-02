/*
Use Higher-Order Functions map, filter, or reduce to Solve a Complex Problem
Now that you have worked through a few challenges using higher-order functions like map(), filter(), and reduce(), you now get to apply them to solve a more complex challenge.

Complete the code for the squareList function using any combination of map(), filter(), and reduce(). The function should return a new array containing the squares of only the positive integers (decimal numbers are not integers) when an array of real numbers is passed to it. An example of an array of real numbers is [-3, 4.8, 5, 3, -3.2].

Note: Your function should not use any kind of for or while loops or the forEach() function.

Tests
Passed:squareList should be a function.
Passed:for, while, and forEach should not be used.
Passed:map, filter, or reduce should be used.
Passed:The function should return an array.
Passed:squareList([4, 5.6, -9.8, 3.14, 42, 6, 8.34, -2]) should return [16, 1764, 36].
Passed:squareList([-3.7, -5, 3, 10, 12.5, 7, -4.5, -17, 0.3]) should return [9, 100, 49].
*/

const squareList = (arr) => {
  // Only change code below this line
  const square = arr
    .filter((item) => item % 1 === 0 && item >= 0)
    .map((item) => item * item); //Number.isInteger(item) also used for cheak is number integer or not
  return square;
  // Only change code above this line
};

const squaredIntegers = squareList([-3, 4.8, 5, 3, -3.2]);
console.log(squaredIntegers);