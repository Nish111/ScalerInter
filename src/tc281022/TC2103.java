package tc281022;

public class TC2103 {

	public static int tcbreak(int n) {
		int count=0;
		for(int i=0; i<n; i++) {
			for(int j=i; j<n;j++) { // for any i this loop only executes once
				count++;
				break;
			}
		}
		return count;
	}
	public static int tcfor(int n) { //O(N^2 + N)/2
		int count=0; int a=0;
		for(int i=0; i<n; i++) {
			for(int j=n; j>i;j--) { // for any i this loop executes till N-i times
				a = a + i +j;
				count++;
				System.out.println(count +" " + i);
			}
		}
		return count;
	}
	public static int tcwhile(int n) { //O(N)
		int count=0;
		while(n>0) {
			count++;
			n++;
			n -=2;
		}
		return count;
	}
	public static int tcindefinite(int n) { //O(infinite)
		int count=0; int ans=0;
		for(int i=0; i<n; i++) {
			for(int j=i-1; j>=0; j++) {
				count++;
				ans += i+j;
				//System.out.println(count);
			}
		}
		return count;
	}
	public static int tcQ5(int n) { //O(N^2 + N)/2
		int count=0; int sum=0;
		for(int i=0; i<=n; i++) {
			for(int j=i; j<=n && j>i; j++) {
				count++;
				sum += i;
				//System.out.println(count);
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(tcbreak(5)); // 5
		//System.out.println(tcbreak(25)); // 25
		//System.out.println(tcbreak(100)); // 100
		System.out.println(tcfor(5)); // 15
		System.out.println(tcfor(25)); // 325
		//System.out.println(tcfor(100)); // 5050
		System.out.println(tcwhile(5)); // 5
		System.out.println(tcwhile(25)); // 25
		System.out.println(tcwhile(100)); // 100
		//System.out.println(tcindefinite(5)); // 15
		System.out.println(tcQ5(5)); 
		System.out.println(tcQ5(25)); // 325
		System.out.println(tcQ5(100)); // 5050
	}

}
