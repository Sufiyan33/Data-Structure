package queue;

public class CircularMain {

	public static void main(String[] args) throws CustomQueueException {
		
		CircularQueue circular = new CircularQueue(5);
		
		circular.push(2);
		circular.push(4);
		circular.push(3);
		circular.push(5);
		circular.push(7);
		
		// circular.push(78); for exception.

		circular.display();

		System.out.println(circular.removeData());

		circular.display();
	}
}
