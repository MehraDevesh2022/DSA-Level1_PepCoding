/*
Find One or More Criminals in a Hunt
Time to pause and test your new regex writing skills. A group of criminals escaped from jail and ran away, but you don't know how many. However, you do know that they stay close together when they are around other people. You are responsible for finding all of the criminals at once.

Here's an example to review how to do this:

The regex /z+/ matches the letter z when it appears one or more times in a row. It would find matches in all of the following strings:

"z"
"zzzzzz"
"ABCzzzz"
"zzzzABC"
"abczzzzzzzzzzzzzzzzzzzzzabc"
But it does not find matches in the following strings since there are no letter z characters:

""
"ABC"
"abcabc"
Write a greedy regex that finds one or more criminals within a group of other people. A criminal is represented by the capital letter C.

Tests
Passed:Your regex should match one criminal (C) in the string C
Passed:Your regex should match two criminals (CC) in the string CC
Passed:Your regex should match three criminals (CCC) in the string P1P5P4CCCcP2P6P3.
Passed:Your regex should match five criminals (CCCCC) in the string P6P2P7P4P5CCCCCP3P1
Passed:Your regex should not match any criminals in the empty string ""
Passed:Your regex should not match any criminals in the string P1P2P3
Passed:Your regex should match fifty criminals (CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC) in the string P2P1P5P4CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCP3.
*/
//>>>>>>>>>> solution
let reCriminals = /C+/; // Change this line