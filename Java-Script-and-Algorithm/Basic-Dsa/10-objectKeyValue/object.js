/*
Add Key-Value Pairs to JavaScript Objects
At their most basic, objects are just collections of key-value pairs. In other words, they are pieces of data (values) mapped to unique identifiers called properties (keys). Take a look at an example:

const tekkenCharacter = {
  player: 'Hwoarang',
  fightingStyle: 'Tae Kwon Doe',
  human: true
};
The above code defines a Tekken video game character object called tekkenCharacter. It has three properties, each of which map to a specific value. If you want to add an additional property, such as "origin", it can be done by assigning origin to the object:

tekkenCharacter.origin = 'South Korea';
This uses dot notation. If you were to observe the tekkenCharacter object, it will now include the origin property. Hwoarang also had distinct orange hair. You can add this property with bracket notation by doing:

tekkenCharacter['hair color'] = 'dyed orange';
Bracket notation is required if your property has a space in it or if you want to use a variable to name the property. In the above case, the property is enclosed in quotes to denote it as a string and will be added exactly as shown. Without quotes, it will be evaluated as a variable and the name of the property will be whatever value the variable is. Here's an example with a variable:

const eyes = 'eye color';

tekkenCharacter[eyes] = 'brown';
After adding all the examples, the object will look like this:

{
  player: 'Hwoarang',
  fightingStyle: 'Tae Kwon Doe',
  human: true,
  origin: 'South Korea',
  'hair color': 'dyed orange',
  'eye color': 'brown'
};
A foods object has been created with three entries. Using the syntax of your choice, add three more entries to it: bananas with a value of 13, grapes with a value of 35, and strawberries with a value of 27.

Tests
Passed:foods should be an object.
Passed:The foods object should have a key bananas with a value of 13.
Passed:The foods object should have a key grapes with a value of 35.
Passed:The foods object should have a key strawberries with a value of 27.
Passed:The key-value pairs should be set using dot or bracket notation.

*/


let foods = {
    apples: 25,
    oranges: 32,
    plums: 28
};

// Only change code below this line

// Only change code above this line
foods.bananas = 13;

foods.grapes = 35;
foods['strawberries'] = 27
console.log(foods);