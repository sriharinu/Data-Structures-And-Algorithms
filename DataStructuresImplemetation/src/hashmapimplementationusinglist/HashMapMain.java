package hashmapimplementationusinglist;

public class HashMapMain {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.insert(10,"A");
		map.insert(12,"B");
		map.insert(22,"C");
		map.insert(45,"D");
		map.insert(56,"E");
		map.insert(10, "F");
		map.insert(50, "F");
		
		map.display();
		
		if(map.search(50))
			System.out.println("Found ");
		else
			System.out.println("Not found");
		

		if(map.delete(50))
			System.out.println("Deleted ");
		else
			System.out.println("Doesn't exists ");
		
		if(map.search(50))
			System.out.println("Found ");
		else
			System.out.println("Not found");

	}

}
