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
	private Node child;

	Node(int data){
		this.data = data;
		this.child = null;
	}


	private void appendToTail(int data){

		Node newNode = new Node(data);

		if(child == null){
			child = newNode;
		}
		else{

			Node current = child; /
			Node prev;

			while(current != null){
				 
				 prev = current;
				 current = current.child;

				 if(current == null){
				 	prev.child = newNode;
				 }

			}
		}

	}

	private void display(){

		Node current = child;

		System.out.println(data);
		while(current != null){
			System.out.println(current.data);
			current = current.child;
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