package session5;//created package as session5

import java.util.Stack;//import scanner class is in util folder inside the java folder
//util contains utility classes

/**
 *  here we are creating an application 
 *  for Stack operations push, pop, peek without using collections.
 */
//here we are Creating class Stack Test
public class StackTest { //created class as StackTest
	public static void main(String args[]) {
		// here we are creating a stack 
		Stack<String> st = new Stack<String>();
		// Stack follows Last-In-First out approach
		// here we are applying Push operation 
		
		st.push("Vikram");  // Inserting element in the stack at the bottom 
		st.push("Krishna"); // Inserting element in the stack at second position
		st.push("Aleti"); // Inserting element in the stack at third position
		st.push("Vamshi");  // Inserting element at the top 
		System.out.println("Stack after PUSH operation: " + st);
		//Peek operation which returns  
        // the value of the top  
		// here we are checking the top element and prints it
        System.out.println("\nElement at the top is: " + st.peek()); 
                                                                      
		                                                            
        //here we are applying Pop operation
		st.pop(); //Deleting element from the top 
		st.pop(); //Deleting element from second position
		st.pop(); //Deleting element from third position
		st.pop(); //Deleting element from the bottom
		//Printing empty stack after deleting all elements
		System.out.println("\nStack is empty" + st);
		                                                
		                                            
		

	}



}

