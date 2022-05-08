package sinlglylinkedlist;

public class SinglyLinkedListMain {

	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		
		list.printList();
		
		int key = 20;
		
		if(list.delete(key))
             System.out.println("Deleted successfully");
		else
			System.out.println("Not found");
		
	    list.printList();

}
}
