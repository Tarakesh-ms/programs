
/**
* MergeListApp.java
*
*
* @author Tarakeshwar Sriram 
* @since 2019-08-30
*/
class MergeListApp {

	private Node l1;
	private Node l2;

	public static Node mergeTwoLists(Node l1, Node l2){

		if(l1 == null) return l2;

		if(l2 == null) return l1;

		if(l1.data < l2.data){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}
		else{
			l2.next = mergeTwoLists(l2.next, l1);
			return l2;
		}


	}

	public static void main(String[] args){

		//create list 1
		Node l1 = new Node(1);
		l1.appendToTail(2);
		l1.appendToTail(4);

		//create list 2
		Node l2 = new Node(1);
		l2.appendToTail(3);
		l2.appendToTail(4);

		Node mergedList = mergeTwoLists(l1, l2);
		mergedList.display();
	}



}