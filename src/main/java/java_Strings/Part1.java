package java_Strings;

public class Part1 {

	public static void main(String[] args) {
		//length of an array and string literal
		int[] a = {1,2,3,4,5,6};
		System.out.println("The size of the array is: " + a.length);
		String S1 = "We are learning Java and Selenuim";
		System.out.println("The size of the string is:  " + S1.length());
		
		
		
		// use if isEmpty method
		String S2 = "";
		System.out.println(S2.isEmpty());
		
		
		//Use of trim method
		String S3 = "          Good Morning      ";
		System.out.println(S3.length());
		String S4 = S3.trim();
		System.out.println(S4.length());
		
		//Use of trim and length together
		String S5 = "     Hello World    ";
		System.out.println(S5.length());
		int val = S5.trim().length();
		System.out.println(val);
		
		//compare two strings using two equals,equalsIgnoreCase, compareTo(), comapreToIgnore
		String S6 = "Python";
		String S7 = "Java";
		System.out.println(S6.equals(S7));
		String S8 = "JAVA";
		System.out.println(S7.equals(S8));
		System.out.println(S7.equalsIgnoreCase(S8));
		
		
		String S9 = "I am learning Java and Selenium";
		String S10 = "I am learning Python and Selenium";
		System.out.println(S9.compareTo(S10));            //The answer is based on the unicode value of the strings
		
		String S11 = "a";     //unicode value if a is 97
		String S12 = "A";     //unicode value if a is 65               //https://unicodelookup.com
		System.out.println(S11.compareTo(S12));
		System.out.println(S11.compareToIgnoreCase(S12));
		
		String S13 = "Q";
		String S14 = "q";
		System.out.println(S13.compareTo(S14));
		System.out.println(S13.compareToIgnoreCase(S14));
		
		//use of concat method
		String S15 = "Monkey";
		String S16 = "Donkey";
		String S17 = S15 + S16;
		String S18 = "Bully";
		System.out.println(S17.concat(S18));
		
		//use of join method
		String S19 = "BMW";
		String S20 = "Audi";
		String S21 = "Volvo";
		System.out.println(String.join(":", S19, S20, S21));
		
		//substring
		String S22 = "ToyotaHondaNissan";
		System.out.println(S22.substring(4));
		System.out.println(S22.substring(2, 10));
		
		
	}

}
