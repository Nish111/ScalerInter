package modular251122;

public class ModularDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(-40%7); // -5 
		// should get 2 as per Euclidean division
		// to get correct Euclidean just add divisor to remainder
		System.out.println(-40%7 + 7); // 2 which is correct and expected as per Euclidean
		
		long[] A = {1345667, 983884405656565656L, 994939393858787979L, 9133945955699695787L};
		// needs L else it will consider as int
		// getting overflow for this now
		long sum=0; // not correct as overflow not considered
		int mod = 1000000007; // 1<A[i]<10^9, 1<N<10^5
		for(int i=0; i<A.length; i++) {
			sum = sum+A[i];
			System.out.print(sum + " ");
		}
		System.out.println();
		sum = sum%mod;
		System.out.println(sum); // -155336658
		
		long sum1=0; // using too many mods
		for(int i=0; i<A.length; i++) {
			sum1 = ((sum1%mod)+(A[i]%mod))%mod;
			System.out.print(sum1 + " ");
		}
		System.out.println();
		//sum1 = sum1%mod;
		System.out.println(sum1); // 427007350
		
		long sum2=0; // correct
		for(int i=0; i<A.length; i++) {
			sum2 = (sum2+A[i])%mod;    
			// sum2 is 10^9 and A[i] is 10^15 so sum2 will be 10^15 within long range so no overflow here
			// use mod as less as possible and this is clean so
			System.out.print(sum2 + " ");
		}
		System.out.println();
		//sum2 = sum2%mod;
		System.out.println(sum2); // 427007350
		
		long sum3=0; /// correct as per our range and all
		for(int i=0; i<A.length; i++) {
			sum3 = (sum3+(A[i]%mod));
			System.out.print(sum3 + " ");
		}
		System.out.println();
		sum3 = sum3%mod;
		System.out.println(sum3); // 427007350
	}

}
