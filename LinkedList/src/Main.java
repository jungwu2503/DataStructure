
public class Main {

	public static void main(String[] args) {
		
		LinkedList numbers = new LinkedList();

		numbers.addLast(10);
		numbers.add(1, 20);
		numbers.addLast(30);
		numbers.addFirst(100);
		
//		System.out.println(numbers.removeFirst());
//		System.out.println(numbers.remove(2));
//		System.out.println(numbers.size());
//		System.out.println(numbers.get(3));
//		System.out.println(numbers.indexOf(100));
		
		LinkedList.ListIterator li = numbers.listIterator();
		
//		System.out.println(li.next());

		while (li.hasNext()) {
//			System.out.println(li.next());
			
//			if ((int)li.next() == 10)
//				li.add(90);

			if ((int)li.next() == 30)
				li.remove();
			
		}
		
		
		
		System.out.println(numbers);
		
	}

}
