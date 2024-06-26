package stack;

public class Main {

	public static void main(String[] args) throws StackExceptions {

		// passing size of array in constructor.
		// DynamicStacks s = new DynamicStacks();

		ImplementStaticStack s = new DynamicStacks();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		s.push(5);
		s.push(6);
		s.push(6);
		s.push(6);
		
		// System.out.println(s.peek());

		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());




	}
}
