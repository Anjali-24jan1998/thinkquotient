<<<<<<< HEAD
package javaProject;
import java.util.Scanner;
public class StringProgram {

	public static void main(String[] args) {
	    
		 Scanner scanner = new Scanner(System.in);
		    System.out.print("Original string : ");
	 
		    String originalStr = scanner.nextLine();
		    scanner.close();
		 
		    String words[] = originalStr.split("\\s");
		    String reversedString = "";
	        
		    for (int i = 0; i < words.length; i++) 
		    {
		        String word = words[i];
		        String reverseWord = "";
		      for (int j = word.length() - 1; j >= 0; j--) {
		        reverseWord = reverseWord + word.charAt(j);
		      }
		      reversedString = reversedString + reverseWord + " ";
		    }
		 
		  
		    System.out.print("Reversed string : " + reversedString);
		  }
		}
       	

=======
package javaProject;
import java.util.Scanner;
public class StringProgram {

	public static void main(String[] args) {
	    
		 Scanner scanner = new Scanner(System.in);
		    System.out.print("Original string : ");
	 
		    String originalStr = scanner.nextLine();
		    scanner.close();
		 
		    String words[] = originalStr.split("\\s");
		    String reversedString = "";
	        
		    for (int i = 0; i < words.length; i++) 
		    {
		        String word = words[i];
		        String reverseWord = "";
		      for (int j = word.length() - 1; j >= 0; j--) {
		        reverseWord = reverseWord + word.charAt(j);
		      }
		      reversedString = reversedString + reverseWord + " ";
		    }
		 
		  
		    System.out.print("Reversed string : " + reversedString);
		  }
		}
       	

>>>>>>> 8014313ea4b6ce7dcd75411a05d9709920b9b9a2
