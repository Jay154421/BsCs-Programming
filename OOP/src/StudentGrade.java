import java.io.*;

public class StudentGrade {
	
	public void studentGrade()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the Number of Students: ");
		int numStd = Integer.parseInt(br.readLine());
		
		String[] name = new String[numStd];
		double[] pre = new double[numStd];
		double[] mid = new double[numStd];
		double[] sem = new double[numStd];
		double[] fin = new double[numStd];
		int counter = 1;
		
		for(int i=0; i<numStd; i++) {
			System.out.print("Enter Full Name for Student "+ counter+" :");
			name[i] = br.readLine();
			System.out.print("Enter Prelim Grade: ");
			pre[i] = Double.parseDouble(br.readLine());
			System.out.print("Enter Midterm Grade: ");
			mid[i] = Double.parseDouble(br.readLine());
			System.out.print("Enter Semi-final Grade: ");
			sem[i] = Double.parseDouble(br.readLine());
			System.out.print("Enter final Grade: ");
			fin[i] = Double.parseDouble(br.readLine());
			
			counter++;
			System.out.println();
			
		}
		
		//output
		System.out.println("Name\t\t\t\t\tPrelim\t\t\tMidterm\t\t\tSemi-final\t\t\tfinal");
		for(int i=0; i<numStd; i++) {
			System.out.print(name[i]+"\t\t\t");
			System.out.print(pre[i]+"\t\t\t");
			System.out.print(mid[i]+"\t\t\t");
			System.out.print(sem[i]+"\t\t\t");
			System.out.print(fin[i]+"\t\t\t");
			System.out.println();
			
		}
		
		
	}
            
}
