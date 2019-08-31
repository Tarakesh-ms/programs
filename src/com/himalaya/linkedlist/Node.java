import java.io.*;
import java.util.*;

/**
* Node.java
*
*
* @author Tarakeshwar Sriram 
* @since 2019-08-30
*/
public class Node{

	private int data;
	private Node next = null;

	Node(int data){
		this.data = data;
	}


	private void appendToTail(int data){

		Node newNode = new Node(data);
		Node current = this; 

		while(current.next != null){
			current = current.next;
		}
	 	current.next = newNode;
	}

	private void display(){

		Node current = this;
		
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {

		Node node = new Node(40);

		node.appendToTail(80);
		node.appendToTail(100);
		node.appendToTail(800);

		node.display();
		
	}

	
}