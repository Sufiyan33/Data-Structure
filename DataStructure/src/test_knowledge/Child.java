package test_knowledge;

public class Child extends Parent {

	@Override
	void print(int number) {
		System.out.println("I am a child: " + number);
	}

	void print(float number) {
		System.out.println("floart: " + number);
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		p.print(5);
		p = new Child();
		// Below code will show you compile time error "Parent is not applicable for the
		// arguments (float)".
		// p.print(2.3f);
	}
}
