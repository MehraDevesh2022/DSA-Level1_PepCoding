/*
Match All Numbers
You've learned shortcuts for common string patterns like alphanumerics. Another common pattern is looking for just digits or numbers.

The shortcut to look for digit characters is \d, with a lowercase d. This is equal to the character class [0-9], which looks for a single character of any number between zero and nine.

Use the shorthand character class \d to count how many digits are in movie titles. Written out numbers ("six" instead of 6) do not count.

Tests
Passed:Your regex should use the shortcut character to match digit characters
Passed:Your regex should use the global flag.
Passed:Your regex should find 1 digit in the string 9.
Passed:Your regex should find 2 digits in the string Catch 22.
Passed:Your regex should find 3 digits in the string 101 Dalmatians.
Passed:Your regex should find no digits in the string One, Two, Three.
Passed:Your regex should find 2 digits in the string 21 Jump Street.
Passed:Your regex should find 4 digits in the string 2001
*/

let movieName = "2001: A Space Odyssey";
let numRegex = /\d/g; // Change this line
let result = movieName.match(numRegex).length;