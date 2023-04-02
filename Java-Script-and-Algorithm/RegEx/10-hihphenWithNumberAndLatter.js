/*
Match Numbers and Letters of the Alphabet
Using the hyphen (-) to match a range of characters is not limited to letters. It also works to match a range of numbers.

For example, /[0-5]/ matches any number between 0 and 5, including the 0 and 5.

Also, it is possible to combine a range of letters and numbers in a single character set.

let jennyStr = "Jenny8675309";
let myRegex = /[a-z0-9]/ig;
jennyStr.match(myRegex);
Create a single regex that matches a range of letters between h and s, and a range of numbers between 2 and 6. Remember to include the appropriate flags in the regex.

Tests
Passed:Your regex myRegex should match 17 items.
Passed:Your regex myRegex should use the global flag.
Passed:Your regex myRegex should use the case insensitive flag.
 */

let quoteSample = "Blueberry 3.141592653s are delicious.";
let myRegex = /[2-6h-s]/ig; // Change this line
let result = quoteSample.match(myRegex); // Change this line