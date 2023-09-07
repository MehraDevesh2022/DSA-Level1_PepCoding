const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function main() {
  rl.question("", function (input) {
    const t = parseInt(input);
    if (isNaN(t)) {
      console.log("Please enter a  valid number");
      rl.close();
    }

    processTestCase(t, 0);
  });
}

function processTestCase(totalTest, currTestCase) {
  if(totalTest ===currTestCase){
    rl.close();
    return;
  }

  rl.question("", function (number) {
    let n = parseInt(number);
    if(isNaN(n)){
        console.log("Please enter a  valid number");
        rl.close(); 
    }
   
 else {
    let isPrime  = isPrimeNumber(n);
    if(isPrime){
        console.log("Number is Prime");
    }else {
        console.log("number is not prime");
    }
 }   

 processTestCase(totalTest , currTestCase +1);

  });
}

function isPrimeNumber(num) {
  for (let i = 2; i * i <= num; i++) {
    if (num % i == 0) {
      return false;
    }
  }
  return true;
}

main();
