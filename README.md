# 🏨 Hostel Room Management System

A web application to manage hostel rooms, including adding, updating, deleting, and viewing room details.

---

## 📌 Features
- Add new rooms with Room Number, Capacity, Occupied, and Type (AC / Non-AC).
- Edit and delete existing room details.
- View a list of all rooms in a clean, responsive table.
- Search and filter rooms.
- Backend powered by Spring Boot and PostgreSQL.
- Frontend built using HTML, CSS, and JavaScript (Fetch API).

---

## 💻 Technologies Used

### Backend
- Java 17  
- Spring Boot 3.x  
- Spring Data JPA  
- PostgreSQL  
- Maven  

### Frontend
- HTML5  
- CSS3 (custom design)  
- JavaScript (Fetch API for backend communication)

---

## 🧾 Database Setup (PostgreSQL)

```ql
CREATE DATABASE hostel_db;

CREATE TABLE room (
    id SERIAL PRIMARY KEY,
    room_number VARCHAR(10) NOT NULL,
    capacity INT NOT NULL,
    occupied INT NOT NULL,
    type VARCHAR(10) NOT NULL
);
  ```
# 🗂Project Structure
```
HostelRoomManagementSystem/
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── HostelRoomManagement/
│   │   │   │           ├── HostelRoomManagementApplication.java
│   │   │   │           ├── Room.java
│   │   │   │           ├── RoomController.java
│   │   │   │           ├── RoomRepository.java
│   │   │   │           ├── Student.java
│   │   │   │           ├── StudentController.java
│   │   │   │           └── StudentRepository.java
│   │   │   └── resources/
│   │   │       ├── static/               
│   │   │       ├── templates/            
│   │   │       └── application.properties
│   │   └── test/
│   │       └── java/
│   └── target/
│
├── frontend/
│   ├── index.html
│   ├── style.css
│   └── script.js
│
├── pom.xml
└── README.md
```

# 👥 Contact Details
*Name:* Siddhi Patil
*Email:* siddhisudhirpatil@gmail.com

*Name:* Gayatri Yelpale
*Email:* gayatriyelpale123@gmail.com

 ## 📸sreenshort
 
<img width="1298" height="902" alt="FRONT12" src="https://github.com/user-attachments/assets/6c36dc92-df44-424b-ad20-1457f1a3117d" />



