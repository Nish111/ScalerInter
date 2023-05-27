package classobject161222;
// https://www.scaler.com/academy/mentee-dashboard/class/40886/assignment/problems/27410/submissions
public class ComplexNumber {
    
	 float real, imaginary;
		
		// Define constructor here
		ComplexNumber(float real, float imaginary){
	        this.real = real;
	        this.imaginary = imaginary;
	    }
			
		ComplexNumber add(ComplexNumber x){
			// Complete the function
			ComplexNumber cn = new ComplexNumber(this.real, this.imaginary);
			cn.real = this.real+x.real;
			cn.imaginary = this.imaginary+x.imaginary;
			System.out.println(cn.real+" "+cn.imaginary);
	        return cn;
		}
		
		ComplexNumber subtract(ComplexNumber x){
			// Complete the function
			ComplexNumber cn = new ComplexNumber(this.real, this.imaginary);
			cn.real = this.real-x.real;
			cn.imaginary = this.imaginary-x.imaginary;
			System.out.println(cn.real+" "+cn.imaginary);
	        return cn;
		}
			
		ComplexNumber multiply(ComplexNumber x){
			// Complete the function
			ComplexNumber cn = new ComplexNumber(this.real, this.imaginary);
			cn.real = this.real*x.real -(this.imaginary*x.imaginary);
			cn.imaginary = this.imaginary*x.real + this.real*x.imaginary;
			System.out.println(cn.real+" "+cn.imaginary);
	        return cn;
		}
		// (a+ib)/(c+id) = (ac + bd)/(c2+d2) + (bc — ad)/(c2+d2)i 
		ComplexNumber divide(ComplexNumber x){
			// Complete the function
			ComplexNumber cn = new ComplexNumber(this.real, this.imaginary);
			float denom = (x.real*x.real + x.imaginary*x.imaginary);
			//System.out.println(this.real*x.real+this.imaginary*x.imaginary);
			System.out.println("denom is "+denom);
			cn.real = ((this.real*x.real+this.imaginary*x.imaginary)/denom);
			cn.imaginary = ((this.imaginary*x.real - this.real*x.imaginary)/denom);
			System.out.println(cn.real+" "+cn.imaginary);
	        return cn;
		}
		int gcd(int A, int B)
		{
		    if(B==0)return A;
		    return gcd(B, A%B);
		}
	public static void main(String[] args) {
		ComplexNumber a = new ComplexNumber(9, 6); // 10, 5
		ComplexNumber b = new ComplexNumber(3, 3); // 2, 3
		ComplexNumber c1 = a.add(b); // 12 9
		ComplexNumber c2 = a.subtract(b);// 6 6
		ComplexNumber c3 = a.multiply(b); // 9 45
		ComplexNumber c4 = a.divide(b); // 2.5 -0.5
		System.out.println(c4.real);
		System.out.println(c4.imaginary);
	}
}
/*
 * class ComplexNumber {
    // Define properties here
	float real, imaginary;
	
	// Define constructor here
	ComplexNumber(float x, float y){
		this.real = x;
		this.imaginary = y;
	}
	
	ComplexNumber add(ComplexNumber x){
		// Complete the function
		return new ComplexNumber(this.real + x.real , this.imaginary + x.imaginary);
	}
	
	ComplexNumber subtract(ComplexNumber x){
		// Complete the function
		return new ComplexNumber(this.real - x.real , this.imaginary - x.imaginary);
	}
	
	ComplexNumber multiply(ComplexNumber x){
		// Complete the function
		float r =  x.real * this.real - x.imaginary * this.imaginary;
		float i = this.imaginary * x.real + this.real * x.imaginary;
		return new ComplexNumber(r, i);
	}
	
	ComplexNumber divide(ComplexNumber x){
		// Complete the function
		float r = (this.real * x.real + this.imaginary * x.imaginary) / (x.real * x.real + x.imaginary * x.imaginary);
		float i = (this.imaginary * x.real - this.real * x.imaginary) / (x.real * x.real + x.imaginary * x.imaginary);
		return new ComplexNumber(r, i);
	}
}
Still una
 */
/*
    ComplexNumber a = new ComplexNumber(10, 5)
	ComplexNumber b = new ComplexNumber(2, 3)
	ComplexNumber c1 = a.add(b) 
	ComplexNumber c2 = a.subtract(b)
	ComplexNumber c3 = a.multiply(b)
	ComplexNumber c4 = a.divide(b)

*/
