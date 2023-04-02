// This is a free code camp challenge. 

// Return an array consisting of the largest number from each provided sub - array.

//     example:
// largestOfFour([[13, 27, 18, 26], [4, 5, 1, 3], [32, 35, 37, 39], [1000, 1001, 857, 1]]) should return [27, 5, 39, 1001].

// let ans =   largestOfFour([[4, 5, 1, 3], [13, 27, 18, 26], [32, 35, 37, 39], [1000, 1001, 857, 1]]); 
// console.log(ans);
// function largestOfFour(arr) {
//     const results = [];
//     // console.log(arr);
//     for (let i = 0; i < arr.length; i++) {
//         let largestNumber = arr[i][0];
//         for (let j = 1; j < arr[i].length; j++) {
//             if (arr[i][j] > largestNumber) {
//                 largestNumber = arr[i][j];
//             }
//         }
//         results[i] = largestNumber;

//     }

//     return results;
// }


function largestOfFour(arr) {
    let ans = [];
    function findMax(arr) {
        return Math.max(...arr);
    }
    arr.map((oneD, idx) => {
        ans[idx] = findMax(oneD);
    })

    return ans;
}

let ans =largestOfFour([[4, 5, 1, 3], [13, 27, 18, 26], [32, 35, 37, 39], [1000, 1001, 857, 1]]);
console.log(ans);