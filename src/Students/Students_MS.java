/* Group NO/4 members:
Manar Bahumayed - 445926161
Fay Balhamir - 444925631
Haya AlDossery - 443926850
 * we devided the project to 2 Tasks:
Task 1: Database setup: 
	create table.
	insert students info.
	(by:Manar)
Task 2: Functions: 
	- viewStudent()
	- insertStudents()
	(by:Haya)
	- updateGPA()
	- deleteStudent()
	(by: Fay)
	- find()
	- while loop to call Functions
	(by: Manar)*/
package Students;
import java.sql.*;
import java.util.Scanner;

public class Students_MS {
	public static String url = "jdbc:sqlite:Mydatabase.db";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students_MS obj = new Students_MS();
		try (Connection conn = DriverManager.getConnection(url)){

			if (conn != null) {
			System.out.println("Connection Established !");

			String sql_table = "CREATE TABLE IF NOT EXISTS student (\n"
						+ " ID INTEGER PRIMARY KEY,\n"
						+ " name TEXT NOT NULL,\n"
						+ " age INTEGER,\n"
						+ " GPA DOUBLE\n)";

			Statement stmt = conn.createStatement();
			stmt.execute(sql_table);
			System.out.println("Table created successfully.");
			
			String sql_insert = "INSERT INTO student (ID, name, age, GPA) VALUES " +
                    "(1,'sarah',20,2.3)," +
                    "(2,'maha',30,5.6)," +
                    "(3,'farah',19,4.0),"+
                    "(4,'jana',21,4.6)";
            stmt.executeUpdate(sql_insert);
            System.out.println("Students inserted successfully.");
			}//end if
		}//end try

		catch (SQLException e) {
			System.out.println(e.getMessage());
		}//end catch
		
		 Scanner s = new Scanner(System.in);
		    int choice;
		    boolean x = true;

		    while (x) {
		        System.out.println("------------------------------");
		        System.out.println("what do you want to do? ");
		        System.out.println("1- View student");
		        System.out.println("2- Insert student");
		        System.out.println("3- Update GPA");
		        System.out.println("4- Delete student");
		        System.out.println("5- stop");
		        
		        choice = s.nextInt();

		        if (choice == 1){
		                obj.viewStudent();}
		        else if (choice == 2){
		        		System.out.print("Enter Student ID: ");	
		        		int id = s.nextInt();
		        		System.out.print("Enter Student Name: ");
		        		String name = s.next();
		        		System.out.print("Enter Student Age: ");
		        		int age = s.nextInt();
		        		System.out.print("Enter Student GPA: ");
		        		double gpa = s.nextDouble();
		                obj.insertStudents(id,name,age,gpa);}
		        else if (choice == 3) {
		        		System.out.print("Enter ID: ");
		        		int id = s.nextInt();
		        		if (obj.find(id)) {
		                    System.out.print("Enter new GPA: ");
		                    double gpa = s.nextDouble();
		                    obj.updateGPA(id,gpa);} 
		        		 else {
		                    System.out.println("Student not found ");}
		        		}
		        else if (choice == 4) {
		        		System.out.print("Enter ID: ");
		        		int id = s.nextInt();
		        		if (obj.find(id)) {
		                     obj.deleteStudent(id);} 
		        		else {System.out.println("Student not found ");}
		        		}
		        else if (choice == 5) {
		                System.out.println("SYSTEM STOPPED");
		                x = false;}
		        else {System.out.println("Invalid choice. Try again.");}		       
		    }//end while
	}//end main
	
	public void viewStudent() {
        String sql = "SELECT * FROM student";

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);){

            while (rs.next()) {
                System.out.print("Student ID: " + rs.getInt("ID"));
                System.out.print("  Student Name: " + rs.getString("name"));
                System.out.print("  Student Age: " + rs.getInt("age"));
                System.out.println("  Student GPA: " + rs.getDouble("GPA"));
            }//end while
        } //end try
        catch (SQLException e) {
            System.out.println(e.getMessage());}//end catch
    }//end viewStudent
	
	public void insertStudents(int id, String name, int age, double gpa) {
	        String sql = "INSERT INTO student (ID, name, age, GPA) VALUES (?, ?, ?, ?)";

	        try (Connection conn = DriverManager.getConnection(url);
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
               
	            pstmt.setInt(1, id);
	            pstmt.setString(2, name);
	            pstmt.setInt(3, age);
	            pstmt.setDouble(4, gpa);
	            pstmt.executeUpdate();
	            System.out.println("Student added successfully!");

	        }//end try
	        catch (SQLException e) {
	            System.out.println(e.getMessage());}//end catch
	    }//end insertStudents
	
	public void updateGPA(int id, double gpa) {
	        String sql = "UPDATE student SET GPA = ? WHERE ID = ?";
	        try (Connection conn = DriverManager.getConnection(url);
	             PreparedStatement pstmt = conn.prepareStatement(sql)){

	        	 pstmt.setDouble(1, gpa); 
	             pstmt.setInt(2, id);
	             pstmt.executeUpdate();
	             System.out.println("Student GPA updated.");}//end try
	        catch (SQLException e) {
	             System.out.println(e.getMessage());}//end catch
	    }//end updateGPA
 
	public void deleteStudent(int id){
        String sql = "DELETE FROM student WHERE ID = ?";
        try (Connection conn = DriverManager.getConnection(url);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Student deleted successfully.");
        }//end try
        catch (SQLException e) {
            System.out.println(e.getMessage());}//end catch
    }//end deleteStudent
	
	public boolean find(int id) {
        String sql = "SELECT ID FROM student WHERE ID = ?";

        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sql)){

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return true;}
            }//end try
        catch (SQLException e) {
            System.out.println(e.getMessage());}// end catch

        return false;
    }//end find	
}//end class