
public class SLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedList ml= new MyLinkedList();
		Node n=new Node(10);
		ml.addElement(n);
		ml.addElement(new Node(20));
		ml.addElement(new Node(30));
		ml.addElement(new Node(40));
		ml.addElement(new Node(50));
		ml.addElement(new Node(60));
		ml.addElement(new Node(70));
		
	
		System.out.println(" Print Single Linked List");
		ml.printList();
		System.out.println(" Print in Reverse order");
		ml.printReverse(ml.getHeader());
		System.out.println(" Print Alternative Nodes");
		ml.printAlternative(ml.getHeader());
		
		//ml.setHeader(ml.reverseList(ml.getHeader()));
		System.out.println(" Print Single Linked List if they changed actually");
		ml.printList();
		System.out.println(" Print Kth Element from Last");
		ml.kthElementFromLast(2);
		System.out.println(" Swap nodes in linked list");
		ml.swapAlternate(ml.getHeader());
		
		ml.printList();

	}

}
