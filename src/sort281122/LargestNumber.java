package sort281122;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//https://www.scaler.com/academy/mentee-dashboard/class/40890/assignment/problems/64/hints?navref=cl_pb_nv_tb
public class LargestNumber { // check once
	public String largestNumberScalerSol(final List < Integer > A) {
        StringBuffer strBuf = new StringBuffer();
        Node num[];
        int i = 0;
        num = new Node[A.size()];
        for (int n: A) {
            num[i] = new Node(n);
            i++;
        }
        // sorts the array lexicographically
        Arrays.sort(num);
        for (Node n: num) {
            if (n.number == 0 && strBuf.length() != 0)
                continue;
            strBuf.append(n.number);
        }
        return strBuf.toString();
    }
    class Node implements Comparable < Node > {
        int number;
        public Node(int number) {
            this.number = number;
        }
        @Override
        public int compareTo(Node o) {
            String first = String.valueOf(this.number) + String.valueOf(o.number);
            String second = String.valueOf(o.number) + String.valueOf(this.number);
            return second.compareTo(first);
        }
    }
	public String largestNumber2(final int[] A) {
		int n = A.length;
		StringBuilder sb = new StringBuilder();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = String.valueOf(A[i]);
		}
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return String.valueOf(a + b).compareTo(String.valueOf(b + a));
			}
		});
		printArray(arr);
		for (int i = A.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
		}
		if (sb.charAt(0) == '0') {
			return "0";
		}
		return sb.toString();
	}
	private void printArray(String[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] +" ");
		System.out.println();
	}
	public String largestNumber(final int[] A) { // not working
		ArrayList<Integer> ar = new ArrayList<Integer>();
 		for(int i=0; i<A.length; i++) {
 			ar.add(A[i]);
 		}
 		
 		//for(int i=0; i<A.length; i++) System.out.println(A[i] + " ");
		//System.out.println();
 		Collections.sort(ar, (a,b)->{
 			String valA = String.valueOf(a);
 			String valB = String.valueOf(b);
 			if((Long.valueOf(valB + valA)) > (Long.valueOf(valA + valB))) return 1;
 			else if ((Long.valueOf(valB + valA)) == (Long.valueOf(valA + valB))) return 0;
 			else return -1;
			/*
			 * int digitA = findMSB(a); // get tens or unit whatever here int digitB =
			 * findMSB(b); if(digitA<digitB) return 1; else if ((digitA==digitB) && (a<b))
			 * return 1; else return -1;
			 */
 		});
 		//int[] B = new int[ar.size()];
 		String s = String.valueOf(ar.get(0));
 		for(int i=1; i<ar.size(); i++) {
 			//B[i] = ar.get(i);
 			//s=s+String.valueOf(B[i]);
 			s=s+String.valueOf(ar.get(i));
 		}
 		if(ar.get(0) == 0) return "0";
 		else return s;
 		//long j = Long.valueOf(s);
 		//return String.valueOf(j);
	}

	/*
	 * public int findMSB(Integer a) { // TODO Auto-generated method stub
	 * while(a>10) { if(a/10>0) { a=a/10; } } return a; }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNumber ln = new LargestNumber();
		int[] A = {3, 30, 34, 5, 9};
		System.out.println(ln.largestNumber2(A)); // "9534330"
		int[] B = {2, 3, 9, 0};
		System.out.println(ln.largestNumber2(B)); // "9320"
		int[] C = {0, 0, 0, 0, 0};
		System.out.println(ln.largestNumber2(C)); // 0
		int[] D = { 9, 99, 999, 9999, 9998};
		System.out.println(ln.largestNumber2(D)); // 99999999999998
		int[] E = { 472, 663, 964, 722, 485, 852, 635, 4, 368, 676, 319, 412};
		System.out.println(ln.largestNumber2(E)); // 9648527226766636354854724412368319
	}

}
