function multipy() {
    var n1 = document.getElementById('n1').value;
    var n2 = document.getElementById('n2').value;
    let ans = n1 * n2;
    document.getElementById('result').innerHTML = ans;
}

function divide() {
    var n1 = document.getElementById('n1').value;
    var n2 = document.getElementById('n2').value;
    let ans = n1 / n2;
    document.getElementById('result').innerHTML = ans;
}