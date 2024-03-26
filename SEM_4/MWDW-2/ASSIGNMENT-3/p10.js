document.getElementsByTagName('button')[0].addEventListener('click', () => {
    let city = document.getElementById('cityName').value;
    if (city == '') {alert("No Input Data Found!"); return;}
    let endPoint = `http://api.weatherapi.com/v1/current.json?q=${city}&key=1fde707a75ef49ed8a5102531242103`;
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = () => {
        if (xhr.readyState === 4) {
            if (xhr.status != 200) {
                console.log(`Error : ${xhr.status}  ${xhr.statusText}`);
                return;
            }
            
            let data = JSON.parse(xhr.responseText);
            document.querySelector('.location').innerHTML = `${data.location.country}, ${data.location.region}, ${data.location.name}`;
            document.querySelector('.temp').innerHTML = `Temperature : ${data.current.temp_c} °C`;
            document.querySelector('.humidity').innerHTML = `Humidity : ${data.current.humidity} %`;
            document.querySelector('.pressure').innerHTML = `Pressure : ${data.current.pressure_in}`;
            document.querySelector('.wind').innerHTML = `Wind : ${data.current.wind_kph} kph / ${data.current.wind_mph} mph, (${data.current.wind_degree}°, ${data.current.wind_dir} direction)`;
        }
    }
    xhr.open('get',endPoint, true);
    xhr.send();
})