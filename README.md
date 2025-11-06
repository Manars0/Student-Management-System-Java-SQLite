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
`````
Connection Established !
Table created successfully.
[SQLITE_CONSTRAINT_PRIMARYKEY] A PRIMARY KEY constraint failed (UNIQUE constraint failed: student.ID)
------------------------------
what do you want to do? 
1- View student
2- Insert student
3- Update GPA
4- Delete student
5- stop
`````
**viewing students (option 1)**
`````
1
Student ID: 1  Student Name: sarah  Student Age: 20  Student GPA: 2.3
Student ID: 2  Student Name: maha  Student Age: 30  Student GPA: 5.6
Student ID: 3  Student Name: farah  Student Age: 19  Student GPA: 4.0
Student ID: 4  Student Name: jana  Student Age: 21  Student GPA: 4.6
------------------------------
what do you want to do? 
1- View student
2- Insert student
3- Update GPA
4- Delete student
5- stop
`````
**insering student (option 2)**
`````
2
Enter Student ID: 5
Enter Student Name: Manar
Enter Student Age: 25
Enter Student GPA: 5.0
Student added successfully!
------------------------------
what do you want to do? 
1- View student
2- Insert student
3- Update GPA
4- Delete student
5- stop
1
Student ID: 1  Student Name: sarah  Student Age: 20  Student GPA: 2.3
Student ID: 2  Student Name: maha  Student Age: 30  Student GPA: 5.6
Student ID: 3  Student Name: farah  Student Age: 19  Student GPA: 4.0
Student ID: 4  Student Name: jana  Student Age: 21  Student GPA: 4.6
Student ID: 5  Student Name: Manar  Student Age: 25  Student GPA: 5.0
------------------------------
what do you want to do? 
1- View student
2- Insert student
3- Update GPA
4- Delete student
5- stop
`````
**updating student (option 3)**
`````
3
Enter ID: 4
Enter new GPA: 4.4
Student GPA updated.
------------------------------
what do you want to do? 
1- View student
2- Insert student
3- Update GPA
4- Delete student
5- stop
1
Student ID: 1  Student Name: sarah  Student Age: 20  Student GPA: 2.3
Student ID: 2  Student Name: maha  Student Age: 30  Student GPA: 5.6
Student ID: 3  Student Name: farah  Student Age: 19  Student GPA: 4.0
Student ID: 4  Student Name: jana  Student Age: 21  Student GPA: 4.4
Student ID: 5  Student Name: Manar  Student Age: 25  Student GPA: 5.0
------------------------------
what do you want to do? 
1- View student
2- Insert student
3- Update GPA
4- Delete student
5- stop
`````
**deleting student (option 4)**
`````
4
Enter ID: 5
Student deleted successfully.
------------------------------
what do you want to do? 
1- View student
2- Insert student
3- Update GPA
4- Delete student
5- stop
1
Student ID: 1  Student Name: sarah  Student Age: 20  Student GPA: 2.3
Student ID: 2  Student Name: maha  Student Age: 30  Student GPA: 5.6
Student ID: 3  Student Name: farah  Student Age: 19  Student GPA: 4.0
Student ID: 4  Student Name: jana  Student Age: 21  Student GPA: 4.4
------------------------------
what do you want to do? 
1- View student
2- Insert student
3- Update GPA
4- Delete student
5- stop
`````
**Exiting the Program (option 5)**
`````
what do you want to do? 
1- View student
2- Insert student
3- Update GPA
4- Delete student
5- stop
5
SYSTEM STOPPED
`````

## Author
**Manar Salem**  
Programming and Database Student  
[https://github.com/Manars](https://github.com/Manars)
