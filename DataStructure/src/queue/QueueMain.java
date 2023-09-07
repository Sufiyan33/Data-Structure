package queue;

public class QueueMain {

	public static void main(String[] args) throws Exception {
		CustomQueue queue = new CustomQueue();

		queue.insert(6);
		queue.insert(8);
		queue.insert(9);
		queue.insert(10);
		queue.insert(12);
		queue.insert(15);
		queue.insert(14);
		/*
		 * queue.insert(19); queue.insert(20); queue.insert(20);
		 */
		queue.display();

		System.out.println(queue.remove());
		System.out.println(queue.front());

		queue.display();
	}
}
