# Hospital Management System

## Overview
The **Hospital Management System** is a Spring Boot application designed to streamline the management of appointments, doctors, and users within a hospital setting. This project exposes RESTful APIs for handling these core functionalities, making it easy to integrate with frontend applications.

## Features
- **Appointment Management**: Schedule and manage appointments between users and doctors.
- **Doctor Management**: Add and retrieve doctor details.
- **User Management**: Add and retrieve user details.

## Technologies Used
- **Backend**: Spring Boot, Spring MVC
- **Programming Language**: Java
- **Database**: (Specify your database, e.g., MySQL, PostgreSQL, etc.)

## Project Structure
```
com.example.controller
    - AppointmentController.java
    - DoctorController.java
    - UserController.java

com.example.service
    - AppointmentService.java
    - DoctorService.java
    - UserService.java

com.example.entity
    - Appointment.java
    - Doctor.java
    - User.java
```

## API Endpoints

### Appointment Management
**Base URL**: `/api/appointment`

1. **Create Appointment**
   - **Endpoint**: `POST /addappointment`
   - **Description**: Creates a new appointment.
   - **Parameters**:
     - `userId` (Long): ID of the user booking the appointment.
     - `doctorId` (Long): ID of the doctor for the appointment.
     - `appointmentDate` (LocalDateTime): Date and time of the appointment.
   - **Response**: Returns the created appointment.

### Doctor Management
**Base URL**: `/api/doctor`

1. **Add Doctor**
   - **Endpoint**: `POST /adddoctor`
   - **Description**: Adds a new doctor.
   - **Request Body**:
     ```json
     {
       "name": "string",
       "specialization": "string",
       "experience": "int"
     }
     ```
   - **Response**: Returns the added doctor.

2. **Get Doctor by ID**
   - **Endpoint**: `GET /{id}`
   - **Description**: Retrieves the details of a specific doctor by their ID.
   - **Path Variable**:
     - `id` (Long): ID of the doctor.
   - **Response**: Returns the doctor details.

### User Management
**Base URL**: `/api/user`

1. **Add User**
   - **Endpoint**: `POST /adduser`
   - **Description**: Adds a new user.
   - **Request Body**:
     ```json
     {
       "name": "string",
       "email": "string",
       "age": "int"
     }
     ```
   - **Response**: Returns the added user.

2. **Get User by ID**
   - **Endpoint**: `GET /{id}`
   - **Description**: Retrieves the details of a specific user by their ID.
   - **Path Variable**:
     - `id` (Long): ID of the user.
   - **Response**: Returns the user details.

## How to Run the Application
1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd hospital-management-system
   ```

3. Build and run the application:
   ```bash
   mvn spring-boot:run
   ```

4. The application will be available at `http://localhost:8080`.

## Future Enhancements
- Add user authentication and authorization using Spring Security.
- Integrate with a frontend application (e.g., React.js or Angular).
- Implement more detailed logging and error handling.

## Contribution Guidelines
1. Fork the repository.
2. Create a feature branch: `git checkout -b feature-name`.
3. Commit your changes: `git commit -m 'Add feature'`.
4. Push the branch: `git push origin feature-name`.
5. Open a pull request.
