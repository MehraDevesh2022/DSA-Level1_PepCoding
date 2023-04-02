/*
Repeat a String Repeat a String
Repeat a given string str (first argument) for num times (second argument). Return an empty string if num is not a positive number. For the purpose of this challenge, do not use the built-in .repeat() method.

Tests
Passed:repeatStringNumTimes("*", 3) should return the string ***.
Passed:repeatStringNumTimes("abc", 3) should return the string abcabcabc.
Passed:repeatStringNumTimes("abc", 4) should return the string abcabcabcabc.
Passed:repeatStringNumTimes("abc", 1) should return the string abc.
Passed:repeatStringNumTimes("*", 8) should return the string ********.
Passed:repeatStringNumTimes("abc", -2) should return an empty string ("").
Passed:The built-in repeat() method should not be used.
Passed:repeatStringNumTimes("abc", 0) should return "".
*/

function repeatStringNumTimes(str, num) {
    if (num < 1) {
        return "";
    } else {
           let str2 =str;
        for (let i = 0; i < num; i++) {
             str +=str2;
        }
        return str;
    }

}

console.log(repeatStringNumTimes("abc", 3));

//>>>>>>>>>>>>>>>>>>>>>>>>>>>second-approch >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
function repeatStringNumTimes(str, num) {
    if (num < 1) {
        return "";
    } else {
        return str + repeatStringNumTimes(str, num - 1);
    }
}