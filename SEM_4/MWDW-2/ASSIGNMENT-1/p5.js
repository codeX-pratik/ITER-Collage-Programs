primeCheck(132);

function primeCheck(n) {
    let c = true;
    for(let i=2 ; i<n ; i++) {
        if (n % i == 0) {
            c = false;
            break;
        }
    }
    if (c) {
        console.log(`${n} is prime Number`);
    } else {
        console.log(`${n} is not prime Number`);
    }
}