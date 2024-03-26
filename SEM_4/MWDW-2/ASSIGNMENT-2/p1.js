const theList = ['Laurence', 'Svekis', true, 35, null, undefined, {test: 'one', score: 55}, ['one', 'two']];
console.log(theList);

theList.shift();
theList.pop();
theList.pop();
theList.pop();
theList.pop();
theList.unshift("FIRST");
theList[3] = "hello world";
theList[2] = "MIDDLE";
theList.push("LAST");

console.log(theList);