## Student-Management-System-Java-SQLite
A simple **Student Management System** built in Java using **JDBC (SQLite)**.  
The program allows users to **view, insert, update, and delete** student records in a local SQLite database through a console-based interface.

## Features

- Create a local SQLite database (`Mydatabase.db`)
- Create and manage a `student` table
- Insert, view, update, and delete student records
- Validate user input (check if a student exists before updating or deleting)
- Simple and clear console menu

##  Technologies Used

- **Java 17+**
- **JDBC (Java Database Connectivity)**
- **SQLite Database**

## How It Works

1. When the program runs, it connects to the SQLite database `Mydatabase.db`.
2. If the `student` table doesn’t exist, it is automatically created.
3. Some initial records are inserted into the table.
4. The program shows a console menu where the user can:
   - **View students**
   - **Insert new student**
   - **Update GPA**
   - **Delete student**
   - **Exit the program**

## Example Console Output
