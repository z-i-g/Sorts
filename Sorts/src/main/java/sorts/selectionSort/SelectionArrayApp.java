package sorts.selectionSort;

public class SelectionArrayApp {

	public static void main(String[] args) {
		
		int maxSize = 10;
		SelectionArray arr = new SelectionArray(maxSize);
		
		arr.insert(12);
		arr.insert(56);
		arr.insert(23);
		arr.insert(4);
		arr.insert(1);
		arr.insert(88);
		arr.insert(67);
		
		arr.display();
		
		arr.selectionSort();
		
		arr.display();
		
	}

}
