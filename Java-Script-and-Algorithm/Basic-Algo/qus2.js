function StringChallenge(str) {
  // Initialize variables to keep track of the current character and its count
  let currentChar = str[0];
  let currentCount = 0;

  // Initialize the output string
  let output = "";

  // Loop through all the characters in the string
  for (const char of str) {
    // If the current character is the same as the previous one, increase the count
    if (char === currentChar) {
      currentCount++;
    } else {
      // Otherwise, add the previous character and its count to the output string
      output += currentCount + currentChar;
      // Update the current character and its count
      currentChar = char;
      currentCount = 1;
    }
  }

  // Add the last character and its count to the output string
  output += currentCount + currentChar;
   
let challengeToken = "64e3dyu9o";

 return (
   output.split("").reverse().join("") +
   ":" +
   challengeToken.split("").reverse().join("")
 );


  

}

const input1 = "aabbcde";
const input2 = "wwwbbbw";

const output1 = StringChallenge(input1);

console.log(output1);

