package java_Strings;

public class Part2 {

	public static void main(String[] args) {
	
		//indexOf() method
		//this method is used to determine whether a given text or character is available in the string literal or not.If it is not available, it will return -1
		String S1 = "We will be finishing Automation Course with java and selenium in one month";
		System.out.println(S1.indexOf("with"));
		System.out.println(S1.indexOf('C'));
		System.out.println(S1.indexOf("in", 25));
		
		
		//homework
		
		//subsequence()
		//replace()     //returns a string .replacing all the old characters or char sequence to new characters.There are two ways to use replace method
		
		//example
		
		String S2   = "Welcome";
		System.out.println(S2.replace("e", "a"));
		
		String S3 = "Welcome to Java";
		System.out.println(S3.replace("Java", "Selenium"));
		
		//substring()    it returns substring  of a string based on starting index and ending index.  Starting index starts from 0 and ending index starts from 1
		//example
		
		String S4 = "Welcome";
		System.out.println(S4.substring(1, 3));       // 1 is starting index value and 3 is ending index value
		
		String S5 = "Welcome";
		System.out.println(S5.substring(0, 4)); 
		
		String S6 = "Welcome";
		System.out.println(S5.substring(2, 4)); 
		
		
		//replaceAll()
		//String Searching category
		//indexOf()
		//lastIndexOf()
		//contains()
		
		//charAt()    //returns char value at the given index number.The index number starts with zero
		//example
		
		
		String s = "Welcome";
		System.out.println(s.charAt(3));
		
		
		//endsWith()
		//startsWith()
		
		//Case Conversion methods
		//toLowerCase()      //returns the string in the lower case letter
		//example
		
		String S7 = "WELCOME";
		System.out.println(S7.toLowerCase());
	
		//toUpperCase()   // returns the string in the upper case
		//example
		
		String S8 = "welcome";
		System.out.println(S8.toUpperCase());
		
		
		//type Conversion methods
		//valuOf()
		//toCharArray()
				

	}

}
