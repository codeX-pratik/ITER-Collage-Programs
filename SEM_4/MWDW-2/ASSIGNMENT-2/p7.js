let outputOne = () => console.log("One");
let outputTwo = () => console.log("Two");

let outputThreeAndInvokeOneTwo = () => {
    console.log("Three");
    outputOne();
    outputTwo();
}

let outputFourAndInvokeOneThree = () => {
    console.log("four");
    setTimeout(outputOne, 0);
    outputThreeAndInvokeOneTwo();
}

outputFourAndInvokeOneThree();