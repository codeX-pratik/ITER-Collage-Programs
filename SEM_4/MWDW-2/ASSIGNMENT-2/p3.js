let names = prompt("What is your name ? ");
switch(names) {
    case "alice" : 
    case "lena" :
    case "charlie" :
    case "joe" :
        console.log(`${names} is your friend!`);
        break;
    default : console.log(`The person named "${names}" is unknown to me.`);
}