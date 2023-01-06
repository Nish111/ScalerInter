package subsequence231222;

import java.util.ArrayList;
import java.util.Collections;

// https://www.scaler.com/academy/mentee-dashboard/class/48348/assignment/problems/148/?navref=cl_pb_nv_tb
public class SubSetDistinct { // try this again
/*
 * Given a set of distinct integers A, return all possible subsets.
NOTE:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Also, the subsets should be sorted in ascending ( lexicographic ) order.
The list is not necessarily sorted.
 */
	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        Collections.sort(a);
        finalList.add(new ArrayList());
        generateSubset(a, 0, temp, finalList);
        return finalList;
    }

    private void generateSubset(ArrayList<Integer> a, int i, 
    		ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> finalList){
        if(i == a.size()) return;
        //include in element
        temp.add(a.get(i));
        //System.out.println(temp.get(0));
        finalList.add(new ArrayList(temp));
        generateSubset(a, i+1, temp, finalList);
        temp.remove(temp.size()-1);
        generateSubset(a, i+1, temp, finalList);
    }	
    ArrayList < ArrayList < Integer >> ans;
    void solveScalerSol(int idx, ArrayList < Integer > cur, ArrayList < Integer > A) {
        if (idx == A.size()) {
            ans.add(new ArrayList < > (cur));
            return;
        }
        solveScalerSol(idx + 1, cur, A); // not take
        int element = A.get(idx);
        cur.add(element); // DO
        solveScalerSol(idx + 1, cur, A); // take
        cur.remove(cur.size() - 1); // UNDO
    }
    public ArrayList < ArrayList < Integer >> subsetsScalerSol(ArrayList < Integer > A) {
        Collections.sort(A);
        ans = new ArrayList < > ();
        ArrayList < Integer > cur = new ArrayList < > ();
        solveScalerSol(0, cur, A);
        // sort the list of list
        Collections.sort(ans, (ArrayList < Integer > first, ArrayList < Integer > second) -> {
            for (int i = 0; i < first.size() && i < second.size(); i++) {
                if (first.get(i) < second.get(i))
                    return -1;
                if (first.get(i) > second.get(i))
                    return 1;
            }
            if (first.size() > second.size())
                return 1;
            return -1;
        });
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSetDistinct s = new SubSetDistinct();
		ArrayList<Integer> ab = new ArrayList<>();
		ab.add(1);
		ArrayList<ArrayList<Integer>> A = s.subsets(ab);
		for(int i=0; i<A.size(); i++) System.out.println(A.get(i));
		ab.add(2);
		ab.add(3);
		ArrayList<ArrayList<Integer>> B = s.subsets(ab);
		for(int i=0; i<B.size(); i++) System.out.println(B.get(i));
		
		
	}

}
