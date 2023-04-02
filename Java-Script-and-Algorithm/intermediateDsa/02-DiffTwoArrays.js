/*
Diff Two Arrays
Compare two arrays and return a new array with any items only found in one of the two given arrays, but not both. In other words, return the symmetric difference of the two arrays.

Note: You can return the array with its elements in any order.

Tests
Waiting:diffArray([1, 2, 3, 5], [1, 2, 3, 4, 5]) should return an array.
Waiting:["diorite", "andesite", "grass", "dirt", "pink wool", "dead shrub"], ["diorite", "andesite", "grass", "dirt", "dead shrub"] should return ["pink wool"].
Waiting:["diorite", "andesite", "grass", "dirt", "pink wool", "dead shrub"], ["diorite", "andesite", "grass", "dirt", "dead shrub"] should return an array with one item.
Waiting:["andesite", "grass", "dirt", "pink wool", "dead shrub"], ["diorite", "andesite", "grass", "dirt", "dead shrub"] should return ["diorite", "pink wool"].
Waiting:["andesite", "grass", "dirt", "pink wool", "dead shrub"], ["diorite", "andesite", "grass", "dirt", "dead shrub"] should return an array with two items.
Waiting:["andesite", "grass", "dirt", "dead shrub"], ["andesite", "grass", "dirt", "dead shrub"] should return [].
Waiting:["andesite", "grass", "dirt", "dead shrub"], ["andesite", "grass", "dirt", "dead shrub"] should return an empty array.
Waiting:[1, 2, 3, 5], [1, 2, 3, 4, 5] should return [4].
Waiting:[1, 2, 3, 5], [1, 2, 3, 4, 5] should return an array with one item.
Waiting:[1, "calf", 3, "piglet"], [1, "calf", 3, 4] should return ["piglet", 4].
Waiting:[1, "calf", 3, "piglet"], [1, "calf", 3, 4] should return an array with two items.
Waiting:[], ["snuffleupagus", "cookie monster", "elmo"] should return ["snuffleupagus", "cookie monster", "elmo"].
Waiting:[], ["snuffleupagus", "cookie monster", "elmo"] should return an array with three items.
Waiting:[1, "calf", 3, "piglet"], [7, "filly"] should return [1, "calf", 3, "piglet", 7, "filly"].
Waiting:[1, "calf", 3, "piglet"], [7, "filly"] should return an array with six items.

*/

function diffArray(arr1, arr2) {
  let newArr = []
  if(arr1.length>0){
    newArr = arr1.filter((item) => !arr2.includes(item));
  }
  if(arr2.length>0){
      newArr = [...newArr, arr2.filter((item) => !arr1.includes(item))];
  }
  
  return newArr.flat(1);
}

console.log(diffArray([1, 2, 3, 5], [1, 2, 3, 5]));

// ! Solution 2 =>


function diffArray2(arr1, arr2) {
  return [...diff(arr1, arr2), ...diff(arr2, arr1)];

  function diff(a, b) {
    return a.filter(item => b.indexOf(item) === -1);
  }
}

console.log(diffArray2([1, 2, 3, 5], [1, 2, 3, 5]));

// ! Solution 3 => using Set and its property =>

function diffArray3(arr1, arr2) {
  const difference = new Set(arr1);
  arr2.forEach((ele) =>
    difference.has(ele) ? difference.delete(ele) : difference.add(ele)
  );
  return Array.from(difference);
}

console.log(diffArray3([1, 2, 3, 5], [1, 2, 3, 5]));

// ! solution 4  using conact  => easy or best one

function diffArray4(arr1, arr2) {
  return arr1
    .concat(arr2)
    .filter((item) => !arr1.includes(item) || !arr2.includes(item));
}

diffArray4([1, 2, 3, 5], [1, 2, 3, 4, 5]);


