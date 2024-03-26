function count(n) {
    if (n > 10) {
        return;
    }
    console.log(n);
    count(n + 1);
}

count(12);