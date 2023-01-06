package array161122;
// https://www.scaler.com/academy/mentee-dashboard/class/40893/homework/problems/67/hints?navref=cl_pb_nv_tb
public class MajorityElementsN3 {
	public int repeatedNumberScalerSol(int[] A) {
        int n = A.length;
        int count1 = 0, count2 = 0;
        int first =  Integer.MIN_VALUE;;
        int second = Integer.MAX_VALUE;
     
        for (int i = 0; i < n; i++) {
            if (first == A[i])
                count1++;
            else if (second == A[i])
                count2++;
            else if (count1 == 0) {
                count1++;
                first = A[i];
            }
            else if (count2 == 0) {
                count2++;
                second = A[i];
            }
            else {
                count1--;
                count2--;
            }
        }
     
        count1 = 0;
        count2 = 0;
     
        for (int i = 0; i < n; i++) {
            if (A[i] == first)
                count1++;
            else if (A[i] == second)
                count2++;
        }
     
        if (count1 > n / 3)
            return first;
     
        if (count2 > n / 3)
            return second;
     
        return -1;
    }
	public static int repeatedNumber(int[] A) { // O(N) SC (1)
		int maj1=A[0]; int count1=1;
		int maj2=-1; int count2=0;
		for(int i=1; i<A.length; i++) {
			if(count1==0 && A[i]!=maj2) {
				maj1=A[i];
				count1++;
			} else if(A[i]==maj1) {
				count1++;
			} else if(count2==0 && A[i]!=maj1) {
				maj2=A[i];
				count2++;
			} else if(A[i]==maj2) {
				count2++;
			} else {
				count1--;
				count2--;
			}
		}

		int count=0;
		for(int i=0; i<A.length; i++) {
			if(A[i]==maj1) count++;
		}
		int count3=0;
		for(int i=0; i<A.length; i++) {
			if(A[i]==maj2) count3++;
		}
		//System.out.println(count + " " + count3);
		if(count>A.length/3) return maj1;
		else if(count3>A.length/3) return maj2;
		else return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1, 2, 3, 1, 1};
		System.out.println(repeatedNumber(A));//1
		int[] C = {3,4,4,6,1,4,2,4,3,3,3};
		System.out.println(repeatedNumber(C));// 3 or 4
		int[] B = {1, 1, 1, 2, 3, 5, 7 };
		System.out.println(repeatedNumber(B));//1
		int[] D = {1000662, 1000975, 1000662, 1000306, 1000662, 1000488, 1000662, 
				1000732, 1000397, 1000769, 1000662, 1000731, 1000454 }; // 1000662
		System.out.println(repeatedNumber(D));
	}
/*
 * for(int i=1; i<A.length; i=i+2) {
			if(A[i]==maj1) count1++;
			else if (A[i]==maj2) count2++;
			else {
				if(count1 == 0) {
					maj1 = A[i];
					count1=1;
					count2--;
				} else if(count2 == 0) {
					maj2 = A[i];
					count2=1;
					count1--;
				}else {
					count1--;
					count2--;
				}
			}
			if(A[i+1]==maj1) count1++;
			else if (A[i+1]==maj2) count2++;
			else {
				if(count1 == 0) {
					maj1 = A[i+1];
					count1=1;
				} else if(count2 == 0) {
					maj2 = A[i+1];
					count2=1;
				}else {
					count1--;
					count2--;
				}
			}
		}
 */
	/*
	 * if(count1==0 && A[i]!=maj2) {
				maj1=A[i];
				count1++;
			} else if(A[i]==maj1) {
				count1++;
			} else if(count2==0 && A[i]!=maj1) {
				maj2=A[i];
				count2++;
			} else if(A[i]==maj2) {
				count2++;
			} else {
				count1--;
				count2--;
			}
	 */
	/*
	 * if(A[i]==maj1) {
				count1++;
			} else if (A[i]==maj2) {
				count2++;
			} else if (A[i]!=maj1 && count2==0) {
				maj2=A[i];
				count2=1;
			}else if (A[i]!=maj2 && count1==0) {
				maj1=A[i];
				count1=1;
			} else {
				count1--;
				count2--;
			}
	 */
}
