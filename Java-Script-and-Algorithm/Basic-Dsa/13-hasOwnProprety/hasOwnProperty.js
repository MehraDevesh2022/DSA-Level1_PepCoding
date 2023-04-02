/*
Check if an Object has a Property
Now we can add, modify, and remove keys from objects. But what if we just wanted to know if an object has a specific property? JavaScript provides us with two different ways to do this. One uses the hasOwnProperty() method and the other uses the in keyword. If we have an object users with a property of Alan, we could check for its presence in either of the following ways:

users.hasOwnProperty('Alan');
'Alan' in users;
Both of these would return true.

Finish writing the function so that it returns true if the object passed to it contains all four names, Alan, Jeff, Sarah and Ryan and returns false otherwise.

Tests
Passed:The users object should not be accessed directly
Passed:The users object should only contain the keys Alan, Jeff, Sarah, and Ryan
Passed:The function isEveryoneHere should return true if Alan, Jeff, Sarah, and Ryan are properties on the object passed to it.
Passed:The function isEveryoneHere should return false if Alan is not a property on the object passed to it.
Passed:The function isEveryoneHere should return false if Jeff is not a property on the object passed to it.
Passed:The function isEveryoneHere should return false if Sarah is not a property on the object passed to it.
Passed:The function isEveryoneHere should return false if Ryan is not a property on the object passed to it.
*/

let users = {
    Alan: {
        age: 27,
        online: true
    },
    Jeff: {
        age: 32,
        online: true
    },
    Sarah: {
        age: 48,
        online: true
    },
    Ryan: {
        age: 19,
        online: true
    }
};

function isEveryoneHere(userObj) {
    // Only change code below this line
    if (userObj.hasOwnProperty('Alan') && userObj.hasOwnProperty('Jeff') && userObj.hasOwnProperty('Sarah') && userObj.hasOwnProperty('Ryan')) {
        return true;
    } else {
        return false;
    }
    // Only change code above this line
}

console.log(isEveryoneHere(users));