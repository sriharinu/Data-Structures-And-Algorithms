package doublylinkedlist;

public class DoublyLinkedList {
	
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		
	}
		
		Node head;
		
		void insert(int element)
		{
			Node newNode = new Node(element);
			if(head==null)
			{
				head=newNode;
			}
			else
			{
				Node iterator=head;
				while(iterator.next!=null)
				{
					iterator=iterator.next;
				}
				newNode.prev=iterator;
				iterator.next=newNode;
			}
			
		}
		
		boolean delete(int key)
		{
			if(head==null)
				return false;
			else if(head.data==key)
			{
				head=null;
				return true;
			}
			else
			{
				Node before=head;
				Node after=before.next.next;
				while(after.next!=null)
				{
					if(before.next.data==key)
					{
						before.next=after;
						after.prev=before;
						return true;
					}
					before=before.next;
					after=after.next;
				}
			}
			return false;
			
		}
		
		
		
		void display()
		{
			Node iterator = head;
			while(iterator!=null)
			{
				System.out.println(iterator.data);
				iterator=iterator.next;
			}
		}
		
		void traverseReverse()
		{
			Node forward = head;
			while(forward.next!=null)
			{
				forward=forward.next;
			}
			Node backward=forward;
			while(backward!=head)
			{
				System.out.println(backward.data);
				backward=backward.prev;
			}
			System.out.println(head.data);
			
		}
	
	

}
