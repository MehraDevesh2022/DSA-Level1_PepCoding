"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var readline = require("readline");
var valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
valFromRuntime.question("Enter first number : ", function (answer1) {
    valFromRuntime.question("Enter second number : ", function (answer2) {
        var n1 = parseInt(answer1);
        var n2 = parseInt(answer2);
        findGCD(n1, n2);
        valFromRuntime.close();
    });
});
function findGCD(n1, n2) {
    var gcd = 1;
    var n1Copy = n1;
    var n2Copy = n2;
    while (n2 % n1 !== 0) {
        var rem = Math.floor(n2 % n1); // assume that n1 always less than n2
        n2 = n1;
        n1 = rem;
    }
    gcd = n1;
    var lcm = Math.floor((n1Copy * n2Copy) / gcd);
    console.log("GCD : ".concat(gcd));
    console.log("LCM : ".concat(lcm));
}
