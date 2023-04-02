// cut the length of given array make the lenght of five only.
let data = [20, 3, 40, 17, 22, 30, 20];

// solution : 
data = new Set(data);
// console.log(data); // Set(6) { 20, 3, 40, 17, 22, 30 } set retruns unique elm object

//  now convert to the array
console.log([...data]); // output :: [ 20, 3, 40, 17, 22, 30 ]