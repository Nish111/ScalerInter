package classobject161222;

import java.util.Scanner;
// https://www.scaler.com/academy/mentee-dashboard/class/40886/homework/problems/27432/submissions
class Matrix {
    // Define properties here
	int rows;
	int columns;
	int[][] mat;
		
	// Define constructor here
	Matrix(int rows, int columns){
		this.rows = rows;
		this.columns = columns;
		this.mat = new int[rows][columns];
	}
	
	void input(Scanner sc){
		// Use the Scanner object passed as argument for taking input and not a new Scanner object
		// Complete the function
		//this.rows = sc.nextInt();
		//this.columns = sc.nextInt();
		//int[][] array = new int[this.rows][this.columns];
		
		for(int i=0; i<this.rows; i++) {
			sc.nextLine();
			for(int j=0; j<this.columns; j++) {
				this.mat[i][j]=sc.nextInt();
			}
		}
	}
	
	Matrix add(Matrix x){
		// Complete the function
		Matrix newMat = new Matrix(this.rows, this.columns);
		for(int i=0; i<x.rows; i++) {
			for(int j=0; j<x.columns; j++) {
				newMat.mat[i][j] = this.mat[i][j] +x.mat[i][j];
			}
		}
		return newMat;
	}
	
	Matrix subtract(Matrix x){
		// Complete the function
		Matrix newMat = new Matrix(this.rows, this.columns);
		for(int i=0; i<x.rows; i++) {
			for(int j=0; j<x.columns; j++) {
				newMat.mat[i][j] = this.mat[i][j] - x.mat[i][j];
			}
		}
		return newMat;
		
	}
		
	Matrix transpose(){
		// Complete the function
		Matrix newMat = new Matrix(this.rows, this.columns);
		for(int i=0; i<this.rows; i++) {
			for(int j=0; j<this.columns; j++) {
				newMat.mat[j][i] = this.mat[i][j];
			}
		}
		return newMat;
	}
	
	void print(){
		// Complete the function
		for(int i=0; i<this.rows; i++) {
			for(int j=0; j<this.columns; j++) {
				System.out.print(this.mat[i][j]);
			}
			System.out.println();
		}
	}
	
}

/*
    Matrix a = new Matrix(10, 5)  // 10 rows, 5 columns
	a.input() 
	Matrix b = new Matrix(10, 5)  // 10 rows, 5 columns
	b.input()
    Matrix c1 = a.add(b)
    Matrix c2 = a.subtract(b)
    Matrix c3 = a.transpose()
    a.print()
*/