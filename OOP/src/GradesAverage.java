import java.io.*;
public class GradesAverage {
	
	public void gradesAverage()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	   System.out.print("Enter the number of students: ");
	   int numStd = Integer.parseInt(br.readLine());
	   
	   int[] grade = new int[numStd];
	   int counter = 1;
	   int sum = 0;
	
	   for(int i=0; i<numStd; i++) {
		   do { 
			   
		   System.out.print("Enter the grade for student "+counter+":");
		   grade[i] = Integer.parseInt(br.readLine());
		   
		   if(grade[i]<0 || grade[i]>100) {
			   System.out.println("Invalid grade, try again...");   
		   }
	   }while(grade[i] < 0 || grade[i] > 100);
		   sum += grade[i];	  
		   counter++;
	   }
	   
	   
	   
	  
		
		
	}
}
