/*
Specify Exact Number of Matches
You can specify the lower and upper number of patterns with quantity specifiers using curly brackets. Sometimes you only want a specific number of matches.

To specify a certain number of patterns, just have that one number between the curly brackets.

For example, to match only the word hah with the letter a 3 times, your regex would be /ha{3}h/.

let A4 = "haaaah";
let A3 = "haaah";
let A100 = "h" + "a".repeat(100) + "h";
let multipleHA = /ha{3}h/;
multipleHA.test(A4);
multipleHA.test(A3);
multipleHA.test(A100);
In order, the three test calls would return false, true, and false.

Change the regex timRegex to match the word Timber only when it has four letter m's.

Tests
Passed:Your regex should use curly brackets.
Passed:Your regex should not match the string Timber
Passed:Your regex should not match the string Timmber
Passed:Your regex should not match the string Timmmber
Passed:Your regex should match the string Timmmmber
Passed:Your regex should not match the string Timber with 30 m's in it.
*/

let timStr = "Timmmmber";
let timRegex = /Tim{4}ber/; // Change this line
let result = timRegex.test(timStr);