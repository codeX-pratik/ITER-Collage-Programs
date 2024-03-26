let text1 = document.getElementsByName('textarea')[0];
let text2 = document.getElementsByName('textarea2')[0];
let Button = document.getElementsByTagName('button')[0];

Button.addEventListener('click', () => {
    let pattern = /([a-zA-Z0-9]+@[a-zA-Z0-9.-_]+\.[a-zA-Z0-9.-_]+)/gi;
    let email = text1.value.match(pattern);
    let uniqueEmail = [];
    for (let i=0 ; i<email.length ; i++) {
        if (uniqueEmail.indexOf(email[i]) == -1) {
            uniqueEmail.push(email[i]);
        }
    }
    text2.value = uniqueEmail.join('\n');
})