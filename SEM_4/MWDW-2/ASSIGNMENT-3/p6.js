let endPoint = "./example.json";
document.getElementById('btn').addEventListener('click', () => {
    try {
        let xhr = new XMLHttpRequest();
        xhr.onreadystatechange = () => {
            if (xhr.readyState === 4 && xhr.status === 200) {
                let data = JSON.parse(xhr.responseText);
                let toFilter = document.getElementById('filterInput').value;
                var arrData = [];
                for (let x in data) {
                    let values = Object.values(data[x]);
                    if (values.find((ele) => ele == toFilter)) {
                        arrData.push(data[x]);
                    }
                }
                displayResult(arrData);
            }
        }
        xhr.open("get", endPoint, true);
        xhr.send();
    } catch(err) {
        console.log("Error :", err.message);
    }
}); 

function displayResult(data) {
    const container = document.getElementById('result');
    container.innerHTML = '';
    if (data.length === 0) {
        container.innerHTML = 'No result found';
        return;
    }
    data.forEach(ele => {
        const element = document.createElement('div');
        element.textContent = `Name : ${ele.first_name} ${ele.last_name}, Email : ${ele.email}`;
        container.appendChild(element);
    });
}