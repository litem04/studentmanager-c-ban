# Student Management - Java Spring Boot

Một ứng dụng quản lý sinh viên cơ bản với các chức năng: thêm, xóa, tìm kiếm sinh viên.  
Dự án được xây dựng bằng Java và Spring Boot.

##  Công nghệ sử dụng
- Java 17
- Spring Boot
- Maven
- (Tùy chọn) H2 Database hoặc MySQL
- HTML/CSS/JS (giao diện cơ bản)

## 📁 Cấu trúc dự án
student-management/
├── src/
│ ├── main/
│ │ ├── java/com/studentmanagement/
│ │ │ ├── controller/ # Lớp điều khiển API
│ │ │ ├── repository/ # Lớp truy xuất dữ liệu
│ │ │ ├── service/ # Lớp xử lý logic
│ │ │ └── StudentManagementApplication.java
│ │ └── resources/
│ │ ├── static/
│ │ │ ├── js/ # JavaScript frontend
│ │ │ └── index.html # Giao diện chính
│ │ └── application.properties
├── pom.xml
