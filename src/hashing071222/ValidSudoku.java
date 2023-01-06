package hashing071222;

import java.util.HashSet;
import java.util.List;
// https://www.scaler.com/academy/mentee-dashboard/class/40888/homework/problems/158/?navref=cl_pb_nv_tb
public class ValidSudoku {// check again
	// DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isValidSudoku(final String[] A) {
    	int[] row = new int[9];
    	int[] col = new int[9];
    	for(int i=0; i<9; i++) {
    		for(int j=0; j<9; j++) {
    			if(A[i].charAt(j) == '.') continue;
    			int digit = A[i].charAt(j) - '0';
    			if((row[i] & (1<<digit)) >0) return 0;
    			if((col[j] & (1<<digit)) >0) return 0;
    			
    			row[i] = row[i]|(1<<digit);
    			col[j] = col[j]|(1<<digit);
    		}
    	}
		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j += 3) {
				int mask = 0;
				for (int x = i; x<(i+3); x++) {
					for (int y = j; y<(j+3); y++) {
						if (A[x].charAt(y) == '.') continue;
						int digit = A[x].charAt(y) - '0';
						if ((mask & (1 << digit)) > 0) return 0;
						mask = mask |(1 << digit);
					}
				}
			}
		}
    	return 1;
    }

	public int isValidSudokuScalerSol(final List<String> A) {
		if (A == null)
			return 0;
		int n = A.size();
		if (n != 9 || A.get(0).length() != 9)
			return 0;
		HashSet<Character> hashSet = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			hashSet.clear();
			for (int j = 0; j < 9; j++) {
				char c = A.get(i).charAt(j);
				if (c == '.')
					continue;
				if (hashSet.contains(c))
					return 0;
				hashSet.add(c);
			}
		}
		for (int i = 0; i < 9; i++) {
			hashSet.clear();
			for (int j = 0; j < 9; j++) {
				char c = A.get(j).charAt(i);
				if (c == '.')
					continue;
				if (hashSet.contains(c))
					return 0;
				hashSet.add(c);
			}
		}
		for (int k = 0; k < 9; k++) {
			int x = k / 3;
			int y = k % 3;
			hashSet.clear();
			for (int i = 3 * x; i < 3 * x + 3; i++) {
				for (int j = y * 3; j < y * 3 + 3; j++) {
					char c = A.get(j).charAt(i);
					if (c == '.')
						continue;
					if (hashSet.contains(c))
						return 0;
					hashSet.add(c);
				}
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidSudoku vs = new ValidSudoku();
		String[] A = {"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
		System.out.println(vs.isValidSudoku(A));// 1
		String[] B = {"53..7....", "6..195...", ".95....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
		System.out.println(vs.isValidSudoku(B));// 0 - broke 3x3
		String[] C = {"53..7...3", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
		System.out.println(vs.isValidSudoku(C));// 0 - broke row
		String[] D = {"53..7....", "63.195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"};
		System.out.println(vs.isValidSudoku(D));// 0 - broke col
		
	}

}
