package Sring;

public class StringMethods {

	  public static void main(String[] args) {
		
		  String s1 = "Automation";
		  String s2= "Manual";
		  String s3="Class";
		  
		  String s4= new String ("Automation");
		  String s5= new String ("manual");
		  String s6= new String ("class");
		  
		  
		  System.out.println(s1== s4);
		  System.out.println(s1.equals(s4));
		  System.out.println(s2.equalsIgnoreCase(s5));
		  System.out.println(s4.length());
		  System.out.println(s1.concat(s2));
		  System.out.println(s1.contains("tion"));
		  System.out.println(s2.endsWith("ual"));
		  System.out.println(s1.startsWith("Auto"));
		  System.out.println(s4.charAt(7));
		  System.out.println(s4.indexOf('m'));
		  System.out.println(s4.indexOf('3'));
		  System.out.println(s4.isBlank());
		  System.out.println(s1.isEmpty());
		  System.out.println(s1.replace('t', 'n'));
		  System.out.println(s4.replace("Auto","tion"));
		  System.out.println(s1.toLowerCase());
		  System.out.println(s1.toUpperCase());
		  
	}
}
