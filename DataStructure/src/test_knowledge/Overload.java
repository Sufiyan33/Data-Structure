package test_knowledge;

public class Overload {

	int x;
	double y;

	void add(int a, int b) {
		x = a + b;
	}

	void add(double c, double d) {
		y = c + d;
	}

	Overload() {
		this.x = 0;
		this.y = 0;
	}

}
