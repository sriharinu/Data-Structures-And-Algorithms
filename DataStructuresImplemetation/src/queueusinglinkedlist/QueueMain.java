package queueusinglinkedlist;

public class QueueMain {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		

		
		System.out.println(q.denqueue());
		System.out.println(q.denqueue());
		System.out.println(q.denqueue());
		
		System.out.println("==============");
		
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		
		System.out.println(q.denqueue());
		System.out.println(q.denqueue());
		System.out.println(q.denqueue());
		
	}

}
