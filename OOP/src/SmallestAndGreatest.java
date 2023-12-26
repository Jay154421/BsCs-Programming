import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestAndGreatest {

	public static void largest(int a, int b, int c) {
		if (a >= b && a >= c) {
			System.out.println(a + " The Greatest:");
		}
		else if (b >= a && b >= c) {
			System.out.println(b + " The Greatest:");
		}
		else if (c >= a && c >= b) {
			System.out.println(c + " The Greatest:");
		}
	}

	public static void smallest(int a, int b, int c) {
		if (a <= b && a <= c) {
			System.out.println(a + " The Smallest");
		}
		else if (b <= a && b <= c) {
			System.out.println(b + " The Smallest");
		}
		else if (c <= a && c <= b) {
			System.out.println(c + " The Smallest");
		}
	}
	
	public static void SmallestAndGreatest()throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	System.out.print("Please input your 1st number: ");
	int num1 = Integer.parseInt(br.readLine());
	System.out.print("Please input your 2nd number: ");
	int num2 = Integer.parseInt(br.readLine());
	System.out.print("Please input your 3rd number: ");
	int num3 = Integer.parseInt(br.readLine());
	
	largest(num1, num2, num3);
	smallest(num1, num2, num3);
	}
}
