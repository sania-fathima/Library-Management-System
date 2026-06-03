# task3---library-management-system

## Overview

Library Management System is a Java-based Command Line Interface (CLI) application developed using Object-Oriented Programming (OOP) principles. The system allows librarians to manage books and users, issue and return books, and view library statistics through a menu-driven interface.

This project demonstrates the use of abstraction, inheritance, polymorphism, encapsulation, and Java Collections Framework while implementing a real-world library management scenario.

---

## Features

### Book Management

* Add new books
* View all books
* Search books by ID

### User Management

* Register users
* View registered users

### Library Operations

* Issue books
* Return books
* Track book availability

### Statistics

* Display total books
* Display issued books
* Display available books
* Display total registered users

---

## OOP Concepts Implemented

### Abstraction

* Implemented using the abstract `User` class.

### Inheritance

* `StudentUser` and `FacultyUser` inherit from `User`.

### Polymorphism

* Different implementations of `getBorrowLimit()` for students and faculty members.

### Encapsulation

* Class fields are declared private/protected and accessed through methods.

---

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections (`ArrayList`)
* CLI (Command Line Interface)

---

## Project Structure

```text
LibraryManagementSystem/
│
├── Book.java
├── User.java
├── Library.java
└── Main.java
```

---

## How to Run

### Using IntelliJ IDEA

1. Create a new Java project.
2. Create the following files:

   * Book.java
   * User.java
   * Library.java
   * Main.java
3. Copy the source code into the respective files.
4. Run `Main.java`.

### Using Terminal

Compile:

```bash
javac *.java
```

Run:

```bash
java Main
```

---

## Sample Menu

```text
=========================
 LIBRARY MANAGEMENT
=========================

1. Add Book
2. Register User
3. View Books
4. View Users
5. Issue Book
6. Return Book
7. Statistics
8. Exit
```

---

## Learning Outcomes

Through this project, the following concepts were practiced:

* Object-Oriented Programming
* Class Design
* Inheritance and Polymorphism
* Collections Framework
* Menu-Driven Applications
* Real-World Problem Solving in Java

---

## Future Enhancements

* File Handling for Persistent Storage
* Due Date Tracking
* Fine Calculation
* Search by Author and Title
* Book Reservation System
* GUI using Java Swing or JavaFX
* Database Integration (MySQL)

---
