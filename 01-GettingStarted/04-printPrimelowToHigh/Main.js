const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function main() {
  rl.question("", function (low) {
    low = parseInt(low);

    if (isNaN(low)) {
      console.log("Please enter a valid number");
      rl.close();
      return;
    }
    rl.question("", function (heigh) {
      heigh = parseInt(heigh);
      if (isNaN(heigh)) {
        console.log("Please enter a valid number");
        rl.close();
        return;
      } else {
        primeRange(low, heigh);
        rl.close();
      }
    });
  });
}

function primeRange(low, heigh) {
  for (let i = low; i <= heigh; i++) {
    let isPrime = cheackPrime(i);
    if (isPrime) {
      console.log(i);
    }
  }
}

function cheackPrime(number) {
  for (let i = 2; i * i <= number; i++) {
    if (number % i == 0) {
      return false;
    }
  }
  return true;
}

main();
