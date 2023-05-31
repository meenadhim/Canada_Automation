package Java_Concepts;

public class Child_MethodOverriding extends Parent_MethodOverriding{

	public static void main(String[] args) {
		Child_MethodOverriding child = new Child_MethodOverriding();
		child.display();
	  Parent_MethodOverriding parent = new Parent_MethodOverriding();
	    parent.display(); 
	}
		
		 public void display()   {
	    	  System.out.println("This is child class display method");
	}

}
