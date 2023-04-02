/*
Title Case a Sentence
Return the provided string with the first letter of each word capitalized. Make sure the rest of the word is in lower case.

For the purpose of this exercise, you should also capitalize connecting words like the and of.

Tests
Passed:titleCase("I'm a little tea pot") should return a string.
Passed:titleCase("I'm a little tea pot") should return the string I'm A Little Tea Pot.
Passed:titleCase("sHoRt AnD sToUt") should return the string Short And Stout.
Passed:titleCase("HERE IS MY HANDLE HERE IS MY SPOUT") should return the string Here Is My Handle Here Is My Spout.

*/

function titleCase(str) {
    let strArr = str.split(" ");
 
  strArr=  strArr.map(item => {
     return item = item[0].replace().toUpperCase() + item.slice(1 , item.length).toLowerCase();
    
    })
    return strArr.join(" ")
}

titleCase("I'm a little tea pot");