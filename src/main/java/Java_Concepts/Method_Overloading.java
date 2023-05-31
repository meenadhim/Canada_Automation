package Java_Concepts;

public class Method_Overloading {

	public static void main(String[] args) {
		display();
		display(10);
		display(20, 30);
		display("world");
		display("hello", "world");
		display("hello", 10);
		display(new StringBuffer("Join"));
		display(new StringBuilder("Join"));
		display(new StringBuilder("Join"), new StringBuffer("Join"), "hello");
	}

	public static void display() {
		System.out.println("This is a non parameterized display method");
	}

	public static void display(int i) {
		System.out.println("This is an int parameter display method");
	}

	public static void display(int i, int j) {
		System.out.println("This is multiple int parameter display method");
	}

	public static void display(String S) {
		System.out.println("This is a string display method");
	}

	public static void display(String S1, String S2) {
		System.out.println("This is multiple string parameter display method");
	}

	public static void display(String S1, int i) {
		System.out.println("This is String and int parameter display method");
	}

	public static void display(StringBuffer S) {
		System.out.println("This is StringBuffer display method");
	}

	public static void display(StringBuilder S) {
		System.out.println("This is String Builder display method");
	}

	public static void display(StringBuilder S1, StringBuffer S2, String S3) {
		System.out.println("This is String Builder string Buffer and String display method");
	}
}
