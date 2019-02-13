package dataStructures.Stack.ReverserStack;

public class Reverser {
	
	private String input;
	private String output;
	
	public Reverser( String input) {
		this.input = input;
	}
	
	public String doRev() {
		int stackSize = input.length();
		Stack stack = new Stack(stackSize);
		
		for(int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			stack.push(ch);
		}
		
		output = "";
		while(!stack.isEmpty()) {
			char ch = stack.pop();
			output = output + ch;
		}
		return output;
	}
}
