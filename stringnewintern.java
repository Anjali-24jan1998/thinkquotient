package programtestfiles;

public class stringnewintern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			    String str1 = new String("xyz");
			    String str2 = new String("xyz");
			    System.out.println(str1 == str2);
			    str1 = str1.intern();
			    str2 = str2.intern();

			    System.out.println(str1 == str2);
			  }
}
