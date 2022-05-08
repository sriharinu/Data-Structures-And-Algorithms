package linkedlistofgenerictype;

public class SinglyLinkedList <T>{
	
	class Node<T>{
		
		T data;
		Node next;
		
		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}	
	}
	
	Node head;
	
	<T> void  insert(T element)
	{
		Node newNode = new Node(element);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node iterator = head;
			while(iterator.next!=null)
			{
				iterator=iterator.next;
			}
			iterator.next=newNode;
		}
	}
	
	
	 boolean delete(T key)
	{
		Node after=null;
		Node before=null;
		if(head==null)
		{
			return false;
		}
		else if(head.data==key)
		{
			head=null;
			return true;
		}
		else
		{
			before=head;
			after=before.next.next;
			while(after.next!=null)
			{
				if(before.next.data==key)
				{
					before.next=after;
					return true;
				}
			}
		}
		return false;
	}
	
	void reverse()
	{
		Node previous=null;
		Node current = head;
		Node next=null;
		
	}
	
	void printList()
	{
		Node iterator=head;
		while(iterator!=null)
		{
		System.out.println(iterator.data);
		iterator=iterator.next;
		}
	}
}
