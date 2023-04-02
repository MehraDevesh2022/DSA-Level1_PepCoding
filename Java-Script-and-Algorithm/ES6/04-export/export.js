/**
 * use it without having to rewrite the code. You can export multiple things by repeating the first example for each thing you want to export, or by placing them all in the export statement of the second example, like this:

export { add, subtract };
There are two string-related functions in the editor. Export both of them using the method of your choice.

Tests
Passed:You should properly export uppercaseString.
Passed:You should properly export lowercaseString.
 */

const uppercaseString = (string) => {
    return string.toUpperCase();
}

const lowercaseString = (string) => {
    return string.toLowerCase()
}

export { uppercaseString, lowercaseString }