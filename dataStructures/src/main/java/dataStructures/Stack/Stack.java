package dataStructures.Stack;

public class Stack {

	private int maxSize;
	private int[] stackArray;
	private int top;

	// конструктор
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new int[maxSize];
		top = -1;
	}

	// вставка элемента
	public void push(int value) {
		if (isFull() == false) {
			stackArray[++top] = value;
		} else {
			System.out.println("Stack is full!");
		}
	}

	// извлечение элемента
	public int pop() { 
		return stackArray[top--];
	}

	// отображение элемнета без извлечения
	public int peek() {
		return stackArray[top];
	}

	// true если пуст
	public boolean isEmpty() {
		return top == -1;
	}

	// true если полон
	public boolean isFull() {
		return top == maxSize - 1;
	}

}

class StackApp {
	public static void main(String[] args) {

		Stack stack = new Stack(5);

		stack.push(44);
		stack.push(11);
		stack.push(68);
		stack.push(34);
		stack.push(11);
		stack.push(47);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	

	}
}
