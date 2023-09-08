const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function main() {
  rl.question("", function (n) {
    n = parseInt(n);
    if (isNaN(n)) {
      console.log("Please enter a valid number");
      rl.close();
      return;
    } else {
      fibonacciNumbers(n);
      rl.close();
    }
  });
}

function fibonacciNumbers(n) {
  let a = 0;
  let b = 1;
  let c = 0;
  for (let i = 1; i <= n; i++) {
    console.log(a);
    c = b;
    b = a;
    a = b + c;
  }
}


main();