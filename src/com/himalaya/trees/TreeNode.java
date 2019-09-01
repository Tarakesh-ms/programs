import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;
/**
* TreeNode.java
*
*
* @author Tarakeshwar Sriram 
* @since 2019-08-31
*/
class TreeNode{
	
	TreeNode left, right;
	int data;

	public TreeNode(int data){
		this.data = data;
	}


	public void insert(int value){
		if(value < data){

			if(left == null){
				left = new TreeNode(value);
			}
			else{
				left.insert(value);
			}
		}
		else{
			if(right == null){
				right = new TreeNode(value);
			}
			else{
				right.insert(value);
			}
		}

	}

	public boolean contains(int value){

		if(data == value){
			return true;
		}
		else if (value < data){
			if(left == null){
				return false;
			}
			else{
				return left.contains(value);
			}
		}
		else{
			if(right == null){
				return false;
			}
			else{
				return right.contains(value);
			}
		}
	}

	public void printPreOrder(){

		System.out.println(data);

		if(left != null){
			left.printPreOrder();
		}

		if(right != null){
			right.printPreOrder();
		}
	}

	public void printInOrder(){

		if(left != null){
			left.printInOrder();
		}
		System.out.println(data);

		if(right != null){
			right.printInOrder();
		}
	}

	public void printPostOrder(){

		if(left != null){
			left.printPostOrder();
		}

		if(right != null){
			right.printPostOrder();
		}

		System.out.println(data);
	}

	public void inOrderNonRecursive(){

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = this; 

		while(current != null || !stack.isEmpty()){
	
			if(current != null){
				stack.push(current);
				current = current.left;
			}
			else {
				TreeNode node = stack.pop();
				System.out.println(node.data);
				current = node.right;				
			}
		}
	}

	public void postOrderNonRecursive(){

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = this;

		while(current != null || !stack.isEmpty()){


			if(current != null){
				stack.push(current);
				current = current.left;
			}
			else{

				TreeNode temp = stack.peek().right;

				if(temp == null){
				
					temp = stack.pop();
					System.out.println(temp.data);
				
				
					while(!stack.isEmpty() && temp == stack.peek().right){
						temp = stack.pop();
						System.out.println(temp.data);
					}
				}
				else {
					current = temp;
				}
		

			}

		}

	}

	public void preOrderNonRecursive(){

		Deque<TreeNode> queue = new LinkedList();
		TreeNode current = this;
		queue.addFirst(current);

		while(!queue.isEmpty()){

			current = queue.pollFirst();
			System.out.println(current.data);

			if(current.right != null){
				queue.addFirst(current.right);
			}
			if(current.left != null){
				queue.addFirst(current.left);
			}

		}
	}


	public static void main(String[] args) {

		TreeNode node = new TreeNode(2);

		node.insert(10);
		node.insert(9);
		node.insert(5);
		node.insert(29);
		node.insert(4);
		node.insert(100);


		System.out.println("*********** preorder recursive*********** ");
		node.printPreOrder();
		System.out.println("*********** preorder non-recursive*********** ");
		node.preOrderNonRecursive();

		System.out.println("*********** inorder recursive*********** ");
		node.printInOrder();
		System.out.println("*********** inorder non-recursive*********** ");
		node.inOrderNonRecursive();

		System.out.println("*********** postorder recursive*********** ");
		node.printPostOrder();
		System.out.println("*********** postorder non-recursive*********** ");
		node.postOrderNonRecursive();
		
	}
}