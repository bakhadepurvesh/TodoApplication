🚀 To-Do List Application
A simple, fast, and professional web application to manage your daily tasks. Built using Spring Boot for the backend framework and Thymeleaf for a dynamic user interface.

✨ Features
Create Tasks: Quickly add new tasks with titles and details.

Track Status: Change task status between "Pending" and "Completed".

Delete Tasks: Easily remove old or finished tasks.

Responsive Layout: Works great on desktop computers, tablets, and mobile phones.

🛠️ Tech Stack
Backend: Java, Spring Boot (Spring Web, Spring Data JPA)

Frontend: Thymeleaf, HTML5, CSS3, Bootstrap

Database: MySQL

🚀 How to Run the Project
Prerequisites
Before running the app, make sure you have these installed:

Java 17 (or higher)

Maven

Installation Steps
Clone this repository:

Bash
git clone https://github.com/bakhadepurvesh/TodoApplication.git
cd TodoApplication
Run the application:
Execute this command in your terminal:

Bash
mvn spring-boot:run
Note: You can also open this project folder inside IntelliJ IDEA or Eclipse and press the Run button.

View the application:
Open your preferred web browser and go to:
http://localhost:8080

src/
├── main/
│   ├── java/com/example/todo/       # Java classes (Controllers, Models, Services)
│   └── resources/
│       ├── templates/               # Thymeleaf HTML files for the UI
│       ├── static/                  # CSS styles and JavaScript files
│       └── application.properties   # App configuration settings

