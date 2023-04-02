/*
Confirm the Ending
Check if a string (first argument, str) ends with the given target string (second argument, target).

This challenge can be solved with the .endsWith() method, which was introduced in ES2015. But for the purpose of this challenge, we would like you to use one of the JavaScript substring methods instead.

Tests
Waiting:confirmEnding("Bastian", "n") should return true.
Waiting:confirmEnding("Congratulation", "on") should return true.
Waiting:confirmEnding("Connor", "n") should return false.
Waiting:confirmEnding("Walking on water and developing software from a specification are easy if both are frozen", "specification") should return false.
Waiting:confirmEnding("He has to give me a new name", "name") should return true.
Waiting:confirmEnding("Open sesame", "same") should return true.
Waiting:confirmEnding("Open sesame", "sage") should return false.
Waiting:confirmEnding("Open sesame", "game") should return false.
Waiting:confirmEnding("If you want to save our world, you must hurry. We dont know how much longer we can withstand the nothing", "mountain") should return false.
Waiting:confirmEnding("Abstraction", "action") should return true.
Waiting:Your code should not use the built-in method .endsWith() to solve the challenge.
*/



// solutin one =>
function confirmEnding(str, target) {
    let idx = (str.length) - target.length

    if (str.substring(idx) === target)
        return true
    else {
        return false
    }
}

confirmEnding("Bastian", "n");


// solution two =>
function confirmEnding(str, target) {
    // "Never give up and good luck will find you."
    // -- Falcor

    return str.slice(str.length - target.length) === target;
}

confirmEnding("He has to give me a new name", "name");


// solution 3  =>
function confirmEnding(str, target) {
    return str.slice(-target.length) === target
}

confirmEnding("Bastian", "n");
function confirmEnding(str, target) {
    return str.slice(-target.length) === target
}

confirmEnding("Bastian", "n");

// Code Explanation
// If a negative number is provided as the first parameter to slice(), the offset is taken backwards from the end of the string.