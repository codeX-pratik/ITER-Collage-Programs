let xhr;
let endPoint = "./example.json";
document.getElementById('updateForm').addEventListener('submit', eventForSubmit => {
    eventForSubmit.preventDefault();
    xhr = new XMLHttpRequest();
    xhr.onreadystatechange = () => {
        if (xhr.readyState === 4 && xhr.status === 200) {
            var data = JSON.parse(xhr.responseText);
            document.querySelector('#beforeUpdate').innerText = `Present Email : ${data[0].email}`;

            var inputData = document.querySelector('#updateForm #data').value;
            if (inputData == '') {
                alert("No Input Data Found !");
                return;
            } else {
                data[0].email = inputData;
                document.querySelector('#afterUpdate').innerText = `Updated Email : ${data[0].email}`;
                alert("Successfully Updated!");
            }
        }
    }
    xhr.open("get", endPoint, true);
    xhr.send();
})