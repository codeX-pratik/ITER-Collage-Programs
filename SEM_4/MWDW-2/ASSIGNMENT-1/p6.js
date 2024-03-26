let arr = [1,2,3,4,5,6,7,8,9,10];
console.log("The Array is", arr)
console.log(evenSelete(arr));

function evenSelete(arr) {
    let newArr = [];
    let idx = 0;
    for (let i=0 ; i<arr.length ; i++) {
        if (arr[i] % 2 == 0) {
            newArr[idx++] = arr[i];
        }
    }
    return newArr;
}