package tc281022;

public class TC104 {

	public static int func(int n) { //O(infinite) i is 0
		int s=0;
		for(int i=0; i<n; i=i*2) {
			s=s+i;
			//System.out.println(s);
		}
		return s;
	}
	public static int func2(int n) {
		int s=0;
		for(int i=1; i<n; i=i*2) {
			s=s+i;
			//System.out.println(s);
		}
		return s;
	}
	public static int func3(int n) { // O(nlogn)
		int s=0;
		for(int i=1; i<n; i=i*2) {
			for(int j=1; j<=n; j++) {
				s++;
				//System.out.println(i+j);
			}
		}
		return s;
	}
	public static int func4(int n) { // O(nlogn)
		int j=0; int s=0;
		for(int i=0; i<n; i++) {
			while(j<=i){
				j++;
				s++;
				//System.out.println(i+j);
			}
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(func2(5));// 7
		System.out.println(func2(25)); // 31
		System.out.println(func2(100)); // 127
		System.out.println(func3(5));// 7
		System.out.println(func3(25)); // 31
		System.out.println(func3(100)); // 127
		System.out.println(func4(5));// 7
		System.out.println(func4(25)); // 31
		System.out.println(func4(100)); // 127
	}

}
