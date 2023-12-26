import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelOrConsonant {
	public static void vowelOrConsonant(char a) {
		if(a=='a' || a == 'i'|| a== 'e' || a == 'o' || a == 'u' ){
			System.out.println(a + " is a vowels");			
		}
		else {
			System.out.println(a + " is a consonant");
		}
	
		}
	
	public static void VowelOrConsonant()throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter your first Alphabet letter: ");
	char input = br.readLine().charAt(0);
	vowelOrConsonant(input);
	}
}
