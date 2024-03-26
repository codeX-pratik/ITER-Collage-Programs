let arr = [0,1,2,3,4,5,6,8,9,10];

function missingNumber(arr) {
    var missNum = 0;
    for(var i=0 ; i<=arr.length ; i++) {
        missNum ^= i;
        missNum ^= arr[i];
    }
    console.log("The missing number is" , missNum)
}

missingNumber(arr);