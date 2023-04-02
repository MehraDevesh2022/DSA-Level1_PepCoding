/*
Set the Child's Prototype to an Instance of the Parent
In the previous challenge you saw the first step for inheriting behavior from the supertype (or parent) Animal: making a new instance of Animal.

This challenge covers the next step: set the prototype of the subtype (or child)—in this case, Bird—to be an instance of Animal.

Bird.prototype = Object.create(Animal.prototype);
Remember that the prototype is like the "recipe" for creating an object. In a way, the recipe for Bird now includes all the key "ingredients" from Animal.

let duck = new Bird("Donald");
duck.eat();
duck inherits all of Animal's properties, including the eat method.

Modify the code so that instances of Dog inherit from Animal.

Tests
Passed:Dog.prototype should be an instance of Animal.

*/

function Animal() {}

Animal.prototype = {
  constructor: Animal,
  eat: function () {
    console.log("nom nom nom");
  },
};

function Dog() {}

Dog.prototype = Object.create(Animal.prototype);
// Only change code below this line

let beagle = new Dog();