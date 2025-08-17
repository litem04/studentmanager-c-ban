const API_URL = "http://localhost:8080/api/students";

// load danh sách sinh viên
async function loadStudents() {
    const response = await fetch(API_URL);
    const students = await response.json();
    const table = document.getElementById("studentTable");
    table.innerHTML = "";

    students.forEach(s => {
        let row = `<tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.age}</td>
            <td><button onclick="deleteStudent(${s.id})">Delete</button></td>
        </tr>`;
        table.innerHTML += row;
    });
}

// xử lý thêm sinh viên
document.getElementById("studentForm").addEventListener("submit", async (e) => {
    e.preventDefault();

    const student = {
        name: document.getElementById("name").value,
        age: document.getElementById("age").value
    };

    await fetch(API_URL, {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(student)
    });

    document.getElementById("studentForm").reset();
    loadStudents();
});

// xoá sinh viên
async function deleteStudent(id) {
    if (confirm("Are you sure you want to delete this student?")) {
        await fetch(`${API_URL}/${id}`, { method: "DELETE" });
        loadStudents();
    }
}

// tải danh sách khi mở trang
loadStudents();
