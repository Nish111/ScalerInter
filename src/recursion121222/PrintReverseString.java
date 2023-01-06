package recursion121222;

import java.util.Scanner;
// https://www.scaler.com/academy/mentee-dashboard/class/40906/homework/problems/10766/submissions
public class PrintReverseString {
	// Write a recursive function that, given a string S, prints the characters of S in reverse order.
	public static void reverse(String reverse, int len){
		if(len==0) return;
		System.out.print(reverse.charAt(len-1));
		reverse(reverse, len-1);
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        reverse(s, s.length());
        System.out.println();
        String s1 = scan.next();
        reverse(s1, s1.length());
        System.out.println();
    }
    public static void solveScalerSol(String s){
        if(s.length() == 0){
            return;
        }
        solveScalerSol(s.substring(1));
        System.out.print(s.charAt(0));
    }
    public static void mainScalerSol(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        solveScalerSol(str);
    }
}
