package recursion121222;

public class FindFibonacci {

	public int findAthFibonacci(int A) {
		if(A==0) return 0;
		if(A==1) return 1;
		//int f0=0; int f1=1;
		
		return findAthFibonacci(A-1) + findAthFibonacci(A-2);
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindFibonacci ff = new FindFibonacci();
		System.out.println(ff.findAthFibonacci(2));
		System.out.println(ff.findAthFibonacci(9));
		
	}

}
