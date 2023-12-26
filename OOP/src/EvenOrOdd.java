import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOrOdd {

	public static void evenOrOdd(int a) {
		if(a % 2 == 0) {
			System.out.println(a +" is even");
		}
		else
			System.out.println(a + " is odd");
	}
	
	public static void EvenOrOdd()throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Number: ");
		int input = Integer.parseInt(br.readLine());
		evenOrOdd(input);
		}
	
	
	
}
