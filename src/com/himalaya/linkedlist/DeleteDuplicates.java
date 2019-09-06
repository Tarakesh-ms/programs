import java.util.HashMap;
/**
* DeleteDupicates.java
*
*
* @author Tarakeshwar Sriram 
* @since 2019-09-1
*/
class DeleteDuplicates{


	public static void deleteDuplicates(Node head){

		if(head == null) return ;

		Node current = head;

		while(current != null){

			if(current.next != null && current.data == current.next.data){
				current.next = current.next.next;
				continue;
			}

			current = current.next;

		}
	}

	public static Node deleteDuplicatesRecursive(Node head){

		if(head == null || head.next == null) return head;

		head.next = deleteDuplicatesRecursive(head.next);

		return (head.data == head.next.data)? head.next: head;
	}


	public static void deleteDuplicatesUnsortedList(Node n){

		Node previous = null;
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		while(n != null){

			if(map.containsKey(n.data)){
				previous.next = n.next;
			}
			else{
				map.put(n.data, true);
				previous = n;
			}

			n = n.next;
		}
	}

	public static void main(String[] args) {

		Node node = new Node(1);
		node.appendToTail(1);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(3);
		node.appendToTail(4);
		node.appendToTail(5);

		System.out.println("*********** deleteDuplicateListsRecursive non-recursive*********** ");
		deleteDuplicates(node);
		node.display();

		System.out.println("*********** deleteDuplicateListsRecursive recursive*********** ");
		node = deleteDuplicatesRecursive(node);
		node.display();

		Node node2 = new Node(9);
		node2.appendToTail(6);
		node2.appendToTail(3);
		node2.appendToTail(4);
		node2.appendToTail(9);
		node2.appendToTail(8);
		node2.appendToTail(3);


		System.out.println("*********** deleteDuplicatesUnsortedList *********** ");
		deleteDuplicatesUnsortedList(node2);
		node2.display();
		
	}
}