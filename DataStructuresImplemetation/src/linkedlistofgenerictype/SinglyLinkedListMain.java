package linkedlistofgenerictype;

public class SinglyLinkedListMain {

	public static void main(String[] args) {
		
		SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
		
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
	    
	    
	    System.out.println("======================");
	    SinglyLinkedList<String> listString = new SinglyLinkedList<>();
	    
	    
	    listString.insert("aaa");
		listString.insert("bbb");
		listString.insert("ccc");
		listString.insert("ddd");
		listString.insert("eee");
		
		listString.printList();
		
		String str = "bbb";
		
		if(listString.delete(str))
             System.out.println("Deleted successfully");
		else
			System.out.println("Not found");
		
	    listString.printList();

}
}
