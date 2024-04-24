let currentSong = 0;
let music = document.getElementById("mySong");
let musicName = document.getElementById("musicName");
let progressed = document.getElementById("progressed");
let progressBar = document.getElementById("progressBar");
document.getElementById("musicName").innerText = `${musicList[currentSong]}`;
window.onload = time;

// Getting the time in proper format
function getTime(time) {
    let min = Math.floor(time / 60);
    if (min < 10) {
        min = '0' + String(min);
    }
    let sec = Math.floor(time % 60);
    if (sec < 10) {
        sec = '0' + String(sec);
    }
    return min + ":" + sec;
}

// Setting the time and the progress bar
function time() {
    music.ontimeupdate = (e) => {
        document.getElementById("currentTime").innerHTML = getTime(music.currentTime);
        progressed.style.width = Math.floor(music.currentTime * 100 / music.duration) + "%";
        if (music.currentTime == music.duration) {
            nextSong();
        }
    };

    progressBar.onclick = (e) => {
        music.currentTime = ((e.offsetX / progressBar.offsetWidth) * music.duration);
    }
    
    setTimeout(() => {
        document.getElementById("duration").innerHTML = getTime(music.duration);
        
    },200);
}

// Play and Pause button function
function playAndPause() {
    if (music.paused) {
        pauseButton();
        time();
        music.play();

    } else {
        playButton();
        time();
        music.pause();
    }
}

// Play Button
function playButton() {
    let playPause = document.getElementById("play_pause").classList;
    playPause.remove("fa-pause");
    playPause.add("fa-play");
}

// Pause Button
function pauseButton() {
    let playPause = document.getElementById("play_pause").classList;
    playPause.remove("fa-play");
    playPause.add("fa-pause");
}

// Previous Song Button function
function nextSong() {
    currentSong++;
    if (currentSong >= musicList.length) {
        currentSong = 0;
    }
    music.src = `../Audio/${musicList[currentSong]}.mp3`;
    musicName.innerText = `${musicList[currentSong]}`;
    pauseButton();
    time();
    music.play();
}

// Next song Button function
function previousSong() {
    currentSong--;
    if (currentSong < 0) {
        currentSong = musicList.length - 1;
    }
    music.src = `../Audio/${musicList[currentSong]}.mp3`;
    musicName.innerText = `${musicList[currentSong]}`;
    pauseButton();
    time();
    music.play();
}

// Events
document.getElementById("play_pause").addEventListener("click", playAndPause);
document.getElementById("playNext").addEventListener("click", nextSong);
document.getElementById("playPrevious").addEventListener("click", previousSong);