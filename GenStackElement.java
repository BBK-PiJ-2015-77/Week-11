public class GenStackElement<T extends Number> {

	private T value;
	private GenStackElement nextElement;
	
	public GenStackElement (T value) {
		this.value = value;
		this.nextElement = null;
	}

}