import java.io.*;
public class Students {
    public static void main (String []args)throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

// Problem # 1 ------------------------------------------------------>
        int highest = 0;
        int secondHighest = 0;
        boolean  tf = false;
        
        System.out.print("Enter length of array : ");
            int length = Integer.parseInt(br.readLine());
                int array [] = new int[length]; 
        //loop statement entering inputs
        for (int i = 0; i < array.length; i++) {
          try { 
            System.out.print("Enter Number Input " + (i+1) + " : " );
              array[i] = Integer.parseInt(br.readLine());
            System.out.println("Successfully enter in array");
          }
          catch (Exception e) {
            System.out.println("The input is not in array");
            i--;
          }
        }
        
        //Nested Loop
        for (int i = 0; i < array.length; i++) {
          for (int j = 0; j < array.length; j++) {
            if (array[i] < array[j]) {
               secondHighest =  array[i]; 
            }  
          }
        }

        System.out.println("The second highest value is : " + secondHighest);
        
 // Problem # 2 ---------------------------------------------------->         

        System.out.println("================================================");

        System.out.print("Enter length of array : ");
          int length2 = Integer.parseInt(br.readLine());
              int array2 [] = new int[length2]; 
        //loop statement entering inputs
        for (int i = 0; i < array2.length; i++) {
          try { 
            do {
              System.out.print("Enter Number Input " + (i+1) + " : " );
                array2[i] = Integer.parseInt(br.readLine());
                  if (array2[i] < 6 ) {
                      System.out.println("Successfully enter in array2");
                          tf = false;
                  }
                  else {
                      System.out.println("The number is not in the array");
                          tf = true;
                  }
            }while (tf == true );
          }
          catch (Exception e) {
            System.out.println("The input is not in array");
            i--;
          }
        }}}
