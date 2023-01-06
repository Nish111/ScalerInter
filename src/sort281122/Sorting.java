package sort281122;

public class Sorting {
	
	public int[] sortedArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(count_digits(arr[i]) == count_digits(arr[i+1])) {
				comparator(arr[i], arr[i+1]);
			}
		}
		return arr;
	}
	private Object count_digits(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public int comparator(int a, int b) {
		if(a>b) return 1;
		else return 0;
		
	}
	public static void main(String[] args) {
		
	}

}
