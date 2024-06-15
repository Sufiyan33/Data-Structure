package stack;

public class Main {

	public static void main(String[] args) {

		// passing size of array in constructor.
		ImplementStaticStack s = new ImplementStaticStack(5);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		s.push(5);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());


	}
}
