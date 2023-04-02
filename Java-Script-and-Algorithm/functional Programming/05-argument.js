/*
Pass Arguments to Avoid External Dependence in a Function
The last challenge was a step closer to functional programming principles, but there is still something missing.

We didn't alter the global variable value, but the function incrementer would not work without the global variable fixedValue being there.

Another principle of functional programming is to always declare your dependencies explicitly. This means if a function depends on a variable or object being present, then pass that variable or object directly into the function as an argument.

There are several good consequences from this principle. The function is easier to test, you know exactly what input it takes, and it won't depend on anything else in your program.

This can give you more confidence when you alter, remove, or add new code. You would know what you can or cannot change and you can see where the potential traps are.

Finally, the function would always produce the same output for the same set of inputs, no matter what part of the code executes it.

Let's update the incrementer function to clearly declare its dependencies.

Write the incrementer function so it takes an argument, and then returns a result after increasing the value by one.

Tests
Waiting:Your function incrementer should not change the value of fixedValue (which is 4).
Waiting:Your incrementer function should take an argument.
Waiting:Your incrementer function should return a value that is one larger than the fixedValue value.
*/

// The global variable
let fixedValue = 4;

// Only change code below this line
function incrementer(args) {

return args+1
  // Only change code above this line
}