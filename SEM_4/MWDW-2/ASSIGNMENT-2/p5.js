let multiplicationTable = [];
let value = 10;

for (let i=1 ; i<=value ; i++) {
    let row = [];
    for (let j=1 ; j<=value ; j++) {
        row.push(i * j);
    }
    multiplicationTable.push(row);
}

console.log(multiplicationTable);