package stack;

public class DynamicStacks extends ImplementStaticStack {

	/*
	 * Here, I am going to implement custom Dynamic stack.
	 * 
	 * I am adding constructor for calling super class constructor.
	 * 
	 * Everything will be same except push method. Hence let's override & make
	 * changes.
	 */

	public DynamicStacks() {
		super();
	}

	public DynamicStacks(int size) {
		super(size);
	}

	public boolean push(int items) throws StackExceptions {
		if (isFull()) {

			// resize the array.

			int[] temp = new int[data.length * 2];

			for (int index = 0; index < data.length; index++) {
				temp[index] = data[index];
			}

			data = temp;
		}
		return super.push(items);
	}

}
