/*
Finders Keepers
Create a function that looks through an array arr and returns the first element in it that passes a 'truth test'. This means that given an element x, the 'truth test' is passed if func(x) is true. If no element passes the test, return undefined.

Tests
Passed:findElement([1, 3, 5, 8, 9, 10], function(num) { return num % 2 === 0; }) should return 8.
Passed:findElement([1, 3, 5, 9], function(num) { return num % 2 === 0; }) should return undefined.
*/

function findElement(arr, func) {
    let num = 0;
    for (let i = 0; i < arr.length; i++) {
        num = arr[i];
        let ans = func(num);
        if (ans) {
            return num;
        }
    }
    return undefined;
}

findElement([1, 2, 3, 4], num => num % 2 === 0);

// 2nd approch :
function findElement(arr, func) {
    return arr.find(func);
}