/*
Add Methods After Inheritance
A constructor function that inherits its prototype object from a supertype constructor function can still have its own methods in addition to inherited methods.

For example, Bird is a constructor that inherits its prototype from Animal:

function Animal() { }
Animal.prototype.eat = function() {
  console.log("nom nom nom");
};
function Bird() { }
Bird.prototype = Object.create(Animal.prototype);
Bird.prototype.constructor = Bird;
In addition to what is inherited from Animal, you want to add behavior that is unique to Bird objects. Here, Bird will get a fly() function. Functions are added to Bird's prototype the same way as any constructor function:

Bird.prototype.fly = function() {
  console.log("I'm flying!");
};
Now instances of Bird will have both eat() and fly() methods:

let duck = new Bird();
duck.eat();
duck.fly();
duck.eat() would display the string nom nom nom in the console, and duck.fly() would display the string I'm flying!.

Add all necessary code so the Dog object inherits from Animal and the Dog's prototype constructor is set to Dog. Then add a bark() method to the Dog object so that beagle can both eat() and bark(). The bark() method should print Woof! to the console.

Tests
Passed:Animal should not respond to the bark() method.
Passed:Dog should inherit the eat() method from Animal.
Passed:The Dog prototype should have a bark() method.
Passed:beagle should be an instanceof Animal.
Passed:The constructor for beagle should be set to Dog.
Passed:beagle.eat() should log the string nom nom nom
Passed:beagle.bark() should log the string Woof!

*/

function Animal() {}
Animal.prototype.eat = function () {
  console.log("nom nom nom");
};

function Dog() {}

// Only change code below this line
Dog.prototype = Object.create(Animal.prototype);
Dog.prototype.constructor = Dog;

Dog.prototype.bark = function () {
  console.log("Woof!");
};

// Only change code above this line

let beagle = new Dog();