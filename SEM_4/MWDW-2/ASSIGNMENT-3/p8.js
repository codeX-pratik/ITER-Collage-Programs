let endPoint = "books.xml";
document.getElementById('updateForm').addEventListener('submit', eventForSubmit => {
    eventForSubmit.preventDefault();
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = () => {
        if (xhr.readyState === 4 && xhr.status === 200) {
            let xmlData = xhr.responseXML;
            let inputData = document.querySelector('#updateForm #data').value
            if (inputData == '') {
                alert("No input data found!");
                return;
            } else {
                let data = xmlData.getElementById('bk101').getElementsByTagName('author')[0];
                document.getElementsByTagName('p')[0].innerHTML = `Before update : ${data.textContent}`;
                data.textContent = inputData;
                document.getElementsByTagName('p')[1].innerHTML = `After update : ${data.textContent}`;
                alert("Successfully Updated!");
            }
        }
    }
    xhr.open("get", endPoint,true);
    xhr.send();
});