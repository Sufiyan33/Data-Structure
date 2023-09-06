package stack;

public class DynamicStack extends CustomStack {

	/*
	 * All the operation we have list down in custom stack. So don't need to add
	 * again here. Hence I extends that class.
	 * 
	 * Only new thing is : if stack is full then dynamically increase the size.
	 * Let's code it.
	 * 
	 * Push() method already written Parent class just override here and write logic
	 * to dynamically increase size.
	 */

	public DynamicStack() {
		super();
	}

	public DynamicStack(int size) {
		super(size);
	}

	@Override
	public boolean push(int item) throws StackException {
		// Check is stack full? if yes, then resize array.
		if (isFull()) {
			int[] temp = new int[data.length * 2];

			// Copies data into temp;
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			data = temp;
		}

		// Now size has been increase, You can push your data.
		return super.push(item);
	}

}
