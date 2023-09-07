const readline = require("readline");

const rl = readline.createInterface({
  // rl = readline and createInterface is a function its work is to take input from user and give output
  input: process.stdin,
  output: process.stdout,
});

function gradingSystem(marks) {
  if (isNaN(marks)) {
    console.log("Please enter a valid number");
  } else if (marks > 90) {
    console.log("excellent");
  } else if (marks > 80) {
    console.log("good");
  } else if (marks > 70) {
    console.log("fair");
  } else if (marks > 60) {
    console.log("meets expectations");
  } else {
    console.log("below par");
  }
}

function main() {
  rl.question("", function (marks) {
    const number = parseInt(marks);
    gradingSystem(number);
    rl.close(); // to close the readline interface after taking input from user
  });
}

main();
