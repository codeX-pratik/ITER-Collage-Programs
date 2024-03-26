let xhr;
let endPoint = "./example.json";
let Buttom = document.getElementById('btn');

const connect = () => {
    xhr = new XMLHttpRequest();
    xhr.onreadystatechange = () => {
        if (xhr.readyState === 4 && xhr.status === 200) {
            let obj = JSON.parse(xhr.responseText);
            displayData(obj);
        }
    };
    xhr.open("get", endPoint, true);
    xhr.send();
}

function displayData(dataArr) {
    let data = dataArr[0];
    let store = `Name : ${data.first_name} ${data.last_name} \nEmail : ${data.email}`;
    let paraData = document.getElementById('data');
    paraData.innerHTML = store;
}

Buttom.addEventListener('click', connect);