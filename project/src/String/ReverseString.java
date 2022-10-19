package String;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Tarkesh";
		
		String str2 = " "; 
		 
		 for(int i=str.length()-1; i>=0; i--) {
			 
			 System.out.print(str.charAt(i)); //  index value print - 7 6 5 4 3 2 1 0
			 
			/* str2= str2 + str.charAt(i);*/
			 System.out.print(str2);
		 }
		
		     
	}
}
