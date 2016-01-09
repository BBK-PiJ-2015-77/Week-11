public class GenStack {
	public static void main(String[] args) {
	
		GenStackElement<Integer> myNumberStack = new GenStackElement<>(45);
		myNumberStack.push(new GenStackElement<Integer>(52));
		
		if (myNumberStack.isEmpty()){
			System.out.println("The stack is empty");
		} else {
			System.out.println("The stack is not empty");
		}
		
		myNumberStack.printStack();
		System.out.println("There are " + myNumberStack.getSize() + " elements.");
		myNumberStack.pop();
		myNumberStack.pop();
		
		if (myNumberStack.isEmpty()){
			System.out.println("The stack is empty");
		} else {
			System.out.println("The stack is not empty");
		}
		
	}
}