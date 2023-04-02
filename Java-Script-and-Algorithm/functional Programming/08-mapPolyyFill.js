Array.prototype.myMap = function(callback) {
  const newArray = [];
  // Only change code below this line
   for(let i =0; i<this.length; i++){
        newArray.push(callback(this[i] , i , this))
   }
  // Only change code above this line
  return newArray;
};



let ar = [23, 65, 98, 5, 13];

const arr = ar.myMap((elm) => {
  console.log(elm);

});

