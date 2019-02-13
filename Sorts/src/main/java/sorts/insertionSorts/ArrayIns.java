package sorts.insertionSorts;

public class ArrayIns {
	
	private int[] a;
	private int nElems;
	
	public ArrayIns(int max) {
		a = new int[max];
		nElems = 0;
		
	}
	
	public void insert(int value) {
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(a[i]);
		}
		System.out.println("");
	}
	
	public void insertionSort() {
		int in, out;
		
		for(out = 1; out < nElems; out++) {
			int temp = a[out];
			in = out;
			while(in > 0 && a[in-1] >= temp) {
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}

}
