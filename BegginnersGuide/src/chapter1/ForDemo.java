package chapter1;
/*
 * Demonstrate the for loop
 * 
 * Call this file ForDemo.java
 */
public class ForDemo {

	public static void main(String[] args) {
		int count;
		
		for(count = 0; count < 5; count++) // <--------------This loop iterates 5 times
		System.out.println("This is count " + count);
		
		System.out.println("Done!");
	}

}