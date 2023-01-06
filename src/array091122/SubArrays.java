package array091122;

public class SubArrays {

	public static void printAllSub(int []arr) {
		int n = arr.length;
		for(int s=0; s<n; s++){
			for(int e=s; e<n; e++){
				for(int i=s ; i<=e; i++){
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3}; // 6 sub arrays n(n+1)/2
		printAllSub(A);
	}
/*
 * 1 
1 2 
1 2 3 
2 
2 3 
3 
 */
}
