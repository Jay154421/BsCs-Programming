import java.io.*;

public class DupName {
	
	public void dupName()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] name = new String[5];
		
		
		for(int i=0; i<name.length; i++) {
		    System.out.print("Please Input a Text: ");
		    name[i] = br.readLine();		
		    }
		
	
		for(int i=0; i<name.length; i++) {
			for(int j=i+1; j<name.length; j++) {
				if(name[i].equals(name[j])) {
					System.out.println("Duplicate Value is "+ name[j]);
				}
			}
		}
		
		
		
	
	}
		
}
