package linkedlist191222;

import java.util.ArrayList;

public class PrintReverseLinkedList {
	
	public void solve(ListNode A) {
		ListNode temp = A;
		ArrayList<Integer> al = new ArrayList<>();
		while(temp != null) {
			al.add(temp.val);
			temp = temp.next;
		}
		for(int i=al.size()-1; i>=0; i--) {
			System.out.print(al.get(i) + " ");
		}
		System.out.println();
	}
	 public void printLLScalerSol(ListNode A){ // using recurssion
	        if(A == null){
	            return;
	        }
	        printLLScalerSol(A.next);
	        System.out.print(A.val + " ");
	    }
	    public void solveScalerSol(ListNode A) {
	    	printLLScalerSol(A);
	        System.out.print("\n");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
