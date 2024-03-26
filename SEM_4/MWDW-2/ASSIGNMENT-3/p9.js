let endPoint = "books.xml";
document.getElementsByTagName('button')[0].addEventListener('click', () => {
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = () => {
        if (xhr.readyState === 4 && xhr.status === 200) {
            let xmlData = xhr.responseXML;
            let inputData = document.getElementById('inputData').value;
            if (inputData == '') {
                alert("No input Data Found!");
                return;
            } else {
                let book1 = xmlData.childNodes[0].childNodes[1];
                let message = false;
                for (let i=1 ; i<book1.childNodes.length ; i+=2) {
                    if (inputData == book1.childNodes[i].nodeName) {
                        message = true;
                        document.getElementById('result').innerHTML = `${inputData} : ${book1.childNodes[i].textContent}`;
                        break;
                    }
                }
                if (!message) {
                    alert("No such Attribute Found!");
                    return;
                }
            }
        }
    }
    xhr.open('get', endPoint, true);
    xhr.send();
})