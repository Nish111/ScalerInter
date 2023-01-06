package problemsolving191022;

public class FindIterations {

	public static int findIter(int N) { // runs sqrt(N) times
		for(int i=1; i<=N; i++) {
			if(i*i==N) {
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findIter(25));
	}

}
