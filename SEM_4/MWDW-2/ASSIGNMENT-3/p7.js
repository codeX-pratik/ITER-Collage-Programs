let endPoint = "books.xml";
let fetchData = () => {
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = () => {
        if (xhr.readyState === 4 && xhr.status === 200) {
            let xmlData = xhr.responseXML;
            console.log(xmlData)
            let value = xmlData.getElementById('bk101').getElementsByTagName('description')[0].textContent;
            document.getElementsByTagName('p')[0].innerHTML = `Data from the xml : ${value}`;
            
        }
    }
    xhr.open("get", endPoint, true);
    xhr.send();
};