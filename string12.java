package programtestfiles;

public class string12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        String str1 = "A";
		        String str2 = "B";
		        String str3 = "C";
		        int result;

		        // comparing 
		        result = str1.compareToIgnoreCase(str2);
		        System.out.println(result); // 0

		        
		        result = str1.compareToIgnoreCase(str3);
		        System.out.println(result); // -1

		        result = str3.compareToIgnoreCase(str1);
		        System.out.println(result); // 1
		    }
	

}
