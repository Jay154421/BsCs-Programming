import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	private static List<String> student_info = new ArrayList();

    private static void addStudent(BufferedReader reader) throws IOException {
        System.out.print("Enter the ID number: ");
        String number = reader.readLine();
    	System.out.print("Enter the full name: ");
        String fullname = reader.readLine();

        student_info.add("ID: "+ number + ", Name: " + fullname);
        Collections.sort(student_info);
        System.out.println("Student added successfully.\n");
    }

    private static void searchStudent(BufferedReader reader) throws IOException {
        System.out.println("Enter the name of the student or ID number you want to search for:");
        String query = reader.readLine().toLowerCase();
        boolean found = false;

        for (String student : student_info) {
            if (student.toLowerCase().contains(query)) {
                System.out.println(student);
                found = true;
            }
        }
        System.out.println();

        if (!found) {
            System.out.println(query +" not found.\n");
        }
    }
    
    private static void showAllStudents() {
        if (student_info.isEmpty()) {
            System.out.println("No students have been added yet.\n");
        } else {
            System.out.println("Here are all the students:");
            for (String student : student_info) {
                System.out.println(student);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (true) {
        	System.out.println("---------------STUDENT MANAGEMENT SYSTEM---------------");
            System.out.println(" [Add] a student. \n "
            				  + "[Search] for a student. "
            				  + "\n [Show] all students. "
            				  + "\n [Quit] the program.");
            System.out.println("-------------------------------------------------------");
            input = reader.readLine();

            if (input.equalsIgnoreCase("Add")) {
            	System.out.println("-------------------------------------------------------");
                addStudent(reader);
            } else if (input.equalsIgnoreCase("Search")) {
            	System.out.println("-------------------------------------------------------");
                searchStudent(reader); 
            } 
            else if(input.equalsIgnoreCase("Show")){
            	System.out.println("-------------------------------------------------------");
          	  	showAllStudents();
            } 
            else if (input.equalsIgnoreCase("Quit")) {
                break;
            }
            else {
            	System.out.println("-------------------------------------------------------");
                System.out.println("Invalid input. Please try again.\n");
            }
        }
    }
}