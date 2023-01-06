package array051122;
// https://www.scaler.com/academy/mentee-dashboard/class/40896/homework/problems/14/submissions
public class TimeStocks {
/*
 * Say you have an array, A, for which the ith element is the price of a given stock 
 * on day i.
If you were only permitted to complete at most one transaction (ie, buy one and sell 
one share of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.
 */
	// find max and then min before max - that will be max profit
	public int maxProfit(final int[] A) {
		if(A.length ==0 || A.length ==1) {
			return 0;
		}
		int min = A[0];
		int profit = 0;
		
		for(int i=1; i<A.length; i++) {
			if(A[i]>A[i-1]) {// only checking if number is more than previous
				if(A[i]-min > profit) {
					profit = A[i]-min;
				}
			}
			if(A[i]<min) {
				min=A[i];
			}
		}
		return profit;
    }
	public int maxProfitScalerSol(final int[] A) {
        if(A.length == 0 || A.length == 1) return 0;
        
        int max = A[A.length - 1];
        
        int profit = 0;
        for(int i = A.length - 2; i >= 0; i--){
            if(A[i] > max){
                max = A[i];
            }
            // max stores the maximum value to the right of A[i]
            profit = Math.max(profit, max - A[i]);
        }
        
        return profit;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeStocks ts = new TimeStocks();
		int[] A = {1, 2};
		System.out.println(ts.maxProfit(A)); // 1
		int[] B = {1, 4, 5, 2, 4};
		System.out.println(ts.maxProfit(B)); // 4
		int[] C = {};
		System.out.println(ts.maxProfit(C)); // 0
		int []D = {2, 1};
		System.out.println(ts.maxProfit(D));// 0
	}

}
