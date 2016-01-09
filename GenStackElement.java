public class GenStackElement<T extends Number> {

	private T value;
	private GenStackElement nextElement;
	private int index = 0;
	
	public GenStackElement (T value) {
		this.value = value;
		this.nextElement = null;
	}
	
	public T getValue() {
		return value;
	}
	
	public GenStackElement getNext() {
		return nextElement;
	}
	
	public void push(GenStackElement newElement) {
		if (this.nextElement == null) {
			this.nextElement = newElement;
			index++;
		} else {
			this.nextElement.push(newElement);
		}
	}
	
	public void pop() {
		if (this.nextElement.nextElement == null) {
			this.nextElement = null;
			index--;
		} else {
			this.nextElement.pop();
		}
	}
	
	public boolean isEmpty() {
		if (index == 0) {
			return true;
		} else {
			return false;
		}
	}

}