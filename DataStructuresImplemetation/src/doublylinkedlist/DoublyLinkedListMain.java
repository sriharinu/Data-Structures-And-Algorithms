package doublylinkedlist;

public class DoublyLinkedListMain {

	public static void main(String[] args) {
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		
		list.display();
		
		System.out.println("Backward: ");
		list.traverseReverse();
		
		int key = 90;
		
		if(list.delete(key))
             System.out.println("Deleted successfully");
		else
			System.out.println("Not found");
		
	    list.display();

	}

}
