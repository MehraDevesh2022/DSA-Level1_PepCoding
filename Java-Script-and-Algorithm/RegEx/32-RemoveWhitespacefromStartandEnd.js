/*

"One loop to rule them all!"
Remove Whitespace from Start and End
Sometimes whitespace characters around strings are not wanted but are there. Typical processing of strings is to remove the whitespace at the start and end of it.

Write a regex and use the appropriate string methods to remove whitespace at the beginning and end of strings.

Note: The String.prototype.trim() method would work here, but you'll need to complete this challenge using regular expressions.

Tests
Passed:result should be equal to the string Hello, World!
Passed:Your solution should not use the String.prototype.trim() method.
Passed:The result variable should not directly be set to a string
Passed:The value of the hello variable should not be changed.
 */
let hello = "   Hello, World!  ";
let wsRegex = /^\s+|\s+$/g; // Change this line
let result = hello.replace(wsRegex, ""); // Change this line
