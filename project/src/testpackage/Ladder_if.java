package testpackage;

public class Ladder_if {
	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		
		if(a<b) 
		{
			System.out.println("1st if");//execute if condition 1=true.
		}
		else if(a<b)
		{
			System.out.println("2nd if");//execute if condition1= false & condition 2=true.
		}
		else if(a>b)
		{
			System.out.println("3rd if");//execute if condition1=false, condition 2=false, condition 3=true.
		}
		else {
			System.out.println("else");//execute if condition 1,2,3 are false.
		}
	}

}
