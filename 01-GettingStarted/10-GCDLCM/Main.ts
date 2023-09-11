import * as readline from 'readline';

const valFromRuntime = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


valFromRuntime.question("Enter first number : ", (answer1: string) => {
    valFromRuntime.question("Enter second number : ", (answer2: string) => {
        const n1 = parseInt(answer1);
        const n2 = parseInt(answer2);
        console.log(findGCD(n1, n2));
        valFromRuntime.close();
    });
});

function findGCD(n1: number, n2: number): void {
    let gcd = 1;
    let n1Copy = n1;
    let n2Copy = n2;

    while (n2%n1 !== 0) {
        const rem = Math.floor(n2 % n1); // assume that n1 always less than n2
        n2 = n1;
        n1 = rem;
    }
 
    gcd = n1;
    const lcm = Math.floor((n1Copy * n2Copy) / gcd);
    console.log(`GCD : ${gcd}`);
    console.log(`LCM : ${lcm}`);
}
