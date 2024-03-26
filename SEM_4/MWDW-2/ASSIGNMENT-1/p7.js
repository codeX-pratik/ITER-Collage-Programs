let arr = [10,20,5,8,12,15];
console.log("The Array is", arr)
console.log("The sum is" , sumArray(arr));

function sumArray(arr) {
    let sum = 0;
    for (let i=0 ; i<arr.length ; i++) {
        sum += arr[i];
    }
    return sum;
}