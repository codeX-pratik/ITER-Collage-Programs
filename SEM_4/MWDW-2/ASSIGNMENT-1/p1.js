function displayClock() {
    let clockId = document.getElementById('clock');
    let clock = new Date();
    let hour = clock.getHours();
    let min = clock.getMinutes();
    let sec = clock.getSeconds();

    let time = `${hour}:${min}:${sec}`;
    clockId.textContent = time;
}

setInterval(displayClock,100);