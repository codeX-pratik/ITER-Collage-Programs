const ArrayItem = [];
let item1 = {name : "Item1", model : "M1", cost : 1000, quantity : 10};
let item2 = {name : "Item2", model : "M2", cost : 2000, quantity : 20};
let item3 = {name : "Item3", model : "M3", cost : 3000, quantity : 30};
ArrayItem.push(item1, item2, item3);
console.log(ArrayItem);
console.log(ArrayItem[2].quantity);