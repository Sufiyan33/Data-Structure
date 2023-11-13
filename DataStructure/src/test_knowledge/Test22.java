package test_knowledge;

public class Test22 {
	String str = "a";

	public static void main(String[] args) {
		Test22 t = new Test22();
		t.A();
		t.display();
	}

	void A() {
		try {
			str += "b";
			B();
		} catch (Exception e) {
			str += "c";
		}
	}

	void B() throws Exception {
		try {
			str += "d";
			C();
		} catch (Exception e) {
			throw new Exception();
		} finally {
			str += "e";
		}
		str += "f";
	}

	void C() throws Exception {
		throw new Exception();
	}

	void display() {
		System.out.println(str);
	}
}
