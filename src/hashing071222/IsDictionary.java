package hashing071222;

import java.util.ArrayList;
import java.util.HashMap;

public class IsDictionary {
	/*
	 * Problem Description
Surprisingly, in an alien language, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given an array of words A of size N written in the alien language, and the order of the alphabet denoted by string B of size 26, return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.
	 */
	public int solve(String[] A, String B) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i=0; i<B.length(); i++) {
			hm.put(B.charAt(i), i);
		}
		
		for(int i=1; i<A.length; i++) {
			String a1=A[i];
			String a2=A[i-1];
			if(hm.get(A[i-1].charAt(0))>hm.get(A[i].charAt(0))) return 0;
			
			if(hm.get(A[i-1].charAt(0))==hm.get(A[i].charAt(0))) {
				//boolean flag = compareString(hm, A[i-1], A[i]);
				if(!(compareString(hm, A[i-1], A[i]))) return 0;
			}
			
		}
		return 1;
    }
	 public boolean compareString(HashMap<Character, Integer> hm, String A, String B) {
		// TODO Auto-generated method stub
		 for(int i=0; (i<A.length() && i<B.length());i++)
		 {
			 if(hm.get(A.charAt(i))<hm.get(B.charAt(i))) return true;
			 else if(hm.get(A.charAt(i))>hm.get(B.charAt(i))) return false;
		 }
		 if(A.length()>B.length()) return false;
		 else return true;
	}
	 public int solveScalerSol(ArrayList<String> A, String B) {
	        int id[] = new int[26];
	        for(int i = 0; i < B.length(); ++i){
	            id[B.charAt(i)-'a'] = i;
	        }
	        for(int i = 0; i+1 < A.size(); ++i){
	            String x = A.get(i);
	            String y = A.get(i+1);
	            int n = Math.min(x.length(), y.length());
	            int fl = 0;
	            for(int j = 0; j < n; ++j){
	                int c1 = x.charAt(j)-'a';
	                int c2 = y.charAt(j)-'a';
	                if(c1 == c2){
	                    continue;
	                }
	                if(id[c1] < id[c2]){
	                    fl = 1;
	                    break;
	                }
	                return 0;
	            }
	            if(fl == 0 && x.length() > y.length()){
	                return 0;
	            }
	        }
	        return 1;
	    }
	public int solve1(String[] A, String B) {
	        int n = A.length;
	        //index map of characters of String B
	        HashMap<Character, Integer> map = new HashMap<>();
	        for(int i = 0 ; i < B.length();i++){
	            char c = B.charAt(i);
	            map.put(c,i);
	        }
	       
	        //traversing all the string of array and check its sorted or not
	        for(int i = 1 ; i < n ; i++){
	            String curr = A[i];
	            String prev = A[i-1];
	            if(!isSorted(curr, prev, map)){
	                return 0;
	            }
	        }
	        return 1;
	    }
	public boolean isSorted(String curr, String prev, HashMap<Character, Integer> map){
	        int i = 0, j = 0; //currIndex , prevIndex
	        while(i < curr.length() && j < prev.length()){
	            char currChar = curr.charAt(i);
	            char prevChar = prev.charAt(j);
	            if(map.get(currChar) == map.get(prevChar)){ // if both character index are equal need to check next char
	                i++;
	                j++;
	            }else if(map.get(currChar) > map.get(prevChar)) // if curr string char is greater than prev string char
	                return true;
	            else return false;
	        }
	        if(curr.length() < prev.length()) return false;
	        return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsDictionary id = new IsDictionary();
		String[] A = {"hello", "scaler", "interviewbit"};
		String  B = "adhbcfegskjlponmirqtxwuvzy";
		String[] C = {"fine", "none", "no"};
		String D = "qwertyuiopasdfghjklzxcvbnm";
		System.out.println(id.solve(A, B)); // 1
		System.out.println(id.solve(C, D)); // 0
				
	}

}
