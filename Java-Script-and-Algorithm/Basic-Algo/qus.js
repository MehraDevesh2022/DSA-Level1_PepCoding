function StringChallenge(sen) {
  // Remove all non-alphanumeric characters and split the string into an array of words
  const words = sen.replace(/[^0-9a-zA-Z\s]/g, "").split(/\s+/);

  // Initialize variables to keep track of the longest word and its length
  let longestWord = "";
  let longestLength = 0;

  // Loop through all the words and update the longest word and its length if necessary
  for (const word of words) {
    const length = word.length;
    if (length > longestLength) {
      longestWord = word;
      longestLength = length;
    }
  }
const challengeToken = "64e3dyu9o"

    
  return longestWord.split("").reverse().join("") + ":" + challengeToken.split("").reverse().join("")

      
 
  // Return the longest word




//   
}


const challengeToken = "64e3dyu9o";
const input1 = "fun&!! time";
const input2 = "I Love dogs.";

const output1 = StringChallenge(input1);
// const output2 = StringChallenge(input2);

// console.log(`${output1}:${challengeToken}`.split("").reverse().join(":"));
// console.log(`${output2}:${challengeToken}`.split("").reverse().join(":"));
console.log(output1);