package queueusinglinkedlist;

public class Queue {
	class Node
	{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
		
		Node front;
		Node rear;
	
		void enqueue(int element) 
		{
			Node newNode = new Node(element);
			if(front==null)
			{
				front=newNode;
				rear=newNode;
			}
			else
			{
				Node iterator=front;
				while(iterator.next!=null)
				{
					iterator=iterator.next;
				}
				iterator.next=newNode;
				rear=newNode;
			}
		}
		
        int denqueue()
        {
        	int key;
        	if(front==null)
        	{
        		System.out.println("Queue empty");
        		return -1;
        	}
        	else if(front == rear && front!=null)   //(front.next==null)
        	{
        		key=front.data;
        		front=rear=null;
        		return key;
        	}
        	else
        	{
        		key=front.data;
        		front=front.next;
        		return key;
        	}
		}	
	}

