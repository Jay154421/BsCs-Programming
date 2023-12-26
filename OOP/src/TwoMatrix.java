import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoMatrix {
	
	public void twoMatrix()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input the size of the square matrix (less than 5): ");
		int num = Integer.parseInt(br.readLine());
		
		int[][] FirstMatrix = new int[num][num];
		int[][] SecondMatrix = new int[num][num];
		
		//First Matrix
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print("element - ["+i+"],["+j+"] : ");
				FirstMatrix[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		//Second Matrix
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print("element - ["+i+"],["+j+"] : ");
				SecondMatrix[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		//Output First Matrix
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print(FirstMatrix[i][j]+"|");
				
			}
			System.out.println();
		}
		
		
		
	}

}
