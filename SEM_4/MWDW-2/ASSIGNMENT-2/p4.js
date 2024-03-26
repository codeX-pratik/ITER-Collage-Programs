const game = ["Rock", "Paper", "Scissor"];
let player = game[Math.floor((Math.random() * 3))];
let computer = game[Math.floor((Math.random() * 3))];
let message = "Player selected : " + player + ".\nComputer selected : " + computer + ".\n"
if (player === computer) {
    message += "It's a tie!";
} else {
    if (player === "Rock" && computer === "Scissor" ||
        player === "Paper" && computer === "Rock" ||
        player === "Scissor" && computer === "Paper") {
        message += "Player wins!";
    } else {
        message += "Computer wins!";
    } 
}

console.log(message);