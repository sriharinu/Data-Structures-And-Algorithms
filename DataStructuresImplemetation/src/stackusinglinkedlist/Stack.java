package stackusinglinkedlist;

public class Stack {
	
	class Node
	{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next=null;
		}	
	}
	
	Node top;
	Node head;
	
	void push(int element)
	{
		Node newNode = new Node(element);
		if(head==null)
		{
			head=newNode;
			top=head;
		}
		else
		{
			Node iterator = head;
			while(iterator.next!=null)
			{
				iterator=iterator.next;
			}
			iterator.next=newNode;
			top=newNode;
		}
			
	}
	
	int pop(){
		if(head==null)
		{
		   	System.out.println("StackOverflow");
		     return -1;
		}
		else if(head.next==null)
		{
			  int data=head.data;
			  head=null;
			  top=null;
		      return data;	
		}
		else
		{
			Node iterator=head;
			while(iterator.next!=top)
			{
				iterator=iterator.next;
			}
			int data =  iterator.next.data;
			top=iterator;
			iterator.next=null;
			return data;	
		}
			
		
	}
	
	boolean isEmpty()
	{
		if(top==null)
			return false;
		else
			return true;
	}
	
	int getLastElement()
	{
		if(top!=null)
		  return top.data;
		else
			return -1;
	}
	
	
	

}
