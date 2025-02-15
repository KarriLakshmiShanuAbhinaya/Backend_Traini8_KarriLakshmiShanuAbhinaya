Backend_Traini8_KarriLakshmiShanuAbhinaya

Overview
This project is an MVP for a registry of government-funded training centers. It is built using Spring Boot, Spring Data JPA (Hibernate), and MySQL. The application provides two main REST APIs:

A POST endpoint to create and save a new training center. The server automatically assigns a timestamp for when the record is created.
A GET endpoint to retrieve all the training centers stored in the database.
All validations are implemented using annotations, and a global exception handler is used to return clear error messages when validations fail.

Prerequisites

Java 17
Maven 3.6 or higher
MySQL Server
Setup Instructions

->Clone the Repository
->Clone the project from your GitHub repository.

Configure MySQL

->Install and run MySQL on your machine.
->Create a database named “traini8”.
->Update the application’s configuration file with your MySQL connection details (such as URL, username, and password).
->Build and Run the Application

->Use Maven to clean, compile, and install the project.
->Run the application using Maven’s Spring Boot plugin.
->Once running, the application will be available at http://localhost:8080.
API Endpoints

->Create a New Training Center (POST /api/training-centers)
This endpoint accepts JSON data to create a new training center. The JSON should include details such as center name, center code, address (which consists of detailed address, city, state, and pincode), student capacity, courses offered, contact email, and contact phone. Note that the server ignores any provided timestamp and sets the creation time automatically.

->Retrieve All Training Centers (GET /api/training-centers)
This endpoint returns a list of all training centers stored in the database. If there are no records, an empty list will be returned.

Testing the APIs
You can test these APIs using tools like Postman:

For the POST request, set the method to POST and the URL to the create endpoint, then include a valid JSON payload in the request body.
For the GET request, simply call the endpoint to retrieve the list of training centers.
Additional Information

The application logs SQL queries and other relevant details to the console.
Validation errors are captured by a global exception handler and returned as detailed JSON responses.
The project is organized into separate packages (such as controllers, models, repositories, and exception handling) to ensure a clean and maintainable codebase.
Follow the provided setup instructions to ensure your environment is correctly configured and the application runs smoothly.
