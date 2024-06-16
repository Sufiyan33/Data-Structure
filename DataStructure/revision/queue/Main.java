package queue;

public class Main {

	public static void main(String[] args) throws Exception {
		StaticQueueImpl queue = new StaticQueueImpl(5);

		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);

		queue.display();

		System.out.println(queue.removeData());

		queue.display();
	}
}
