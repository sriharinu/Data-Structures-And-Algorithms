package hashmapimplementationusinglist;

public class HashMap {
	
   class Node
   {
	   int key;
	   String value;
	   Node next;
	   
	  public Node(int key, String value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}
   }
	  
	  Node head[] = new Node[10];   //head array
	  
	  
	 int  hashFunction(int key)      //modulus division by 10
	 {
		  return key%10;
	 }
	 
	 
	  void insert(int key, String value)
	  {
		  int bucket = hashFunction(key);
		  
		  Node newNode = new Node(key, value);
		  if(head[bucket]==null)
		  {
			  head[bucket]=newNode;
		  }
		  else
		  {
			  Node iterator=head[bucket];
			  while(iterator.next!=null)
			  {
				  if(key==iterator.key)
					  break;
				  else
				  {
				  iterator=iterator.next;
				  }
			  }
			  if(key!=iterator.key)             //block duplicate keys
			     iterator.next=newNode;
		  }	 
	  }
	  
	  void display()
	  {
		  System.out.println("Key value");
		  for(int i=0;i<10;i++)
		  {
			  if(head[i]==null)
				  continue;
			  else
			  {
			    Node iterator= head[i];
			 
			    while(iterator!=null)
			    {
				 System.out.println(iterator.key+ "   "+iterator.value);
				 iterator=iterator.next;
			    }
			  }
		  }
	  }
	  
	  boolean search(int element) 
	  {
		  int bucket=hashFunction(element);
		  
		  if(head[bucket]==null)
			  return false;
		  else if(head[bucket].key==element)
		  {
			  return true;
		  }
		  else
		  {
			  Node iterator = head[bucket];
			  while(iterator!=null)
			  {
				  if(iterator.key==element)
					  return true;
				  else
					  iterator=iterator.next;
			  }
			  
		
		  }
		  return false;
		  
	  }
	  
	  
	  public boolean delete(int key)
		{
			int rem = key%10;
			if(head[rem]!=null) {
				if(head[rem].key==key)
					head[rem]=head[rem].next;
				else {
					Node prev=head[rem];
					while(prev.next!=null && prev.next.key!=key) {
						prev=prev.next;
					}
					if(prev.next!=null)
						prev.next=prev.next.next;
					else
						return false;
				
				}
			}
			else {
				return false;
			}
			return true;
		}
	   
	  
	  
}
