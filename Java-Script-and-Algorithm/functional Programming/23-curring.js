/*
Introduction to Currying and Partial Application
The arity of a function is the number of arguments it requires. Currying a function means to convert a function of N arity into N functions of arity 1.

In other words, it restructures a function so it takes one argument, then returns another function that takes the next argument, and so on.

Here's an example:

function unCurried(x, y) {
  return x + y;
}

function curried(x) {
  return function(y) {
    return x + y;
  }
}

const curried = x => y => x + y

curried(1)(2)
curried(1)(2) would return 3.

This is useful in your program if you can't supply all the arguments to a function at one time. You can save each function call into a variable, which will hold the returned function reference that takes the next argument when it's available. Here's an example using the curried function in the example above:

const funcForY = curried(1);
console.log(funcForY(2)); // 3
Similarly, partial application can be described as applying a few arguments to a function at a time and returning another function that is applied to more arguments. Here's an example:

function impartial(x, y, z) {
  return x + y + z;
}

const partialFn = impartial.bind(this, 1, 2);
partialFn(10); // 13
Fill in the body of the add function so it uses currying to add parameters x, y, and z.

Tests
Passed:add(10)(20)(30) should return 60.
Passed:add(1)(2)(3) should return 6.
Passed:add(11)(22)(33) should return 66.
Passed:Your code should include a final statement that returns x + y 
*/

function add(x) {
  // Only change code below this line
  return function (y) {
    return function (z) {
      return x + y + z;
    };
  };

  // Only change code above this line
}

add(10)(20)(30);