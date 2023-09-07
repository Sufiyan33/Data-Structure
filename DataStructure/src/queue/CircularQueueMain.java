package queue;

public class CircularQueueMain {

	public static void main(String[] args) throws QueueException {
		CustomCircularQueue queue = new CustomCircularQueue(10);

		queue.insert(6);
		queue.insert(8);
		queue.insert(9);
		queue.insert(10);
		queue.insert(12);
		queue.insert(15);

		queue.display();

		System.out.println(queue.remove());
		System.out.println(queue.front());

		queue.display();

		System.err.println("Operation with Dynamic Queue 👌👌👌");

		DynamicQueue dqueue = new DynamicQueue();

		dqueue.insert(21);
		dqueue.insert(1);
		dqueue.insert(9);
		dqueue.insert(22);
		dqueue.insert(23);
		dqueue.insert(24);
		dqueue.insert(26);
		dqueue.insert(19);
		dqueue.insert(26);
		dqueue.insert(25);
		dqueue.insert(24);
		dqueue.insert(28);
		dqueue.insert(26);
		dqueue.insert(29);
		dqueue.insert(21);
		dqueue.insert(222);
		dqueue.insert(22);
		dqueue.insert(243);

		dqueue.display();

		System.out.println(dqueue.remove());
		System.out.println(dqueue.front());

		dqueue.display();
	}
}
