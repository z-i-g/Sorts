package dataStructures.Stack.ReverserStack;

public class Stack {
	
	private int maxSize;
	private char[] stackArray;
	private int top;

	// конструктор
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new char[maxSize];
		top = -1;
	}

	// вставка элемента
	public void push(char value) {
		if (isFull() == false) {
			stackArray[++top] = value;
		} else {
			System.out.println("Stack is full!");
		}
	}

	// извлечение элемента
	public char pop() { 
		return stackArray[top--];
	}

	// отображение элемнета без извлечения
	public char peek() {
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
