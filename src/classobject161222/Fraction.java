package classobject161222;
// https://www.scaler.com/academy/mentee-dashboard/class/40886/homework/problems/27181/submissions
public class Fraction {
/*
 * Construct a class Fraction which stores a fraction. It should contain the

-Numerator
-Denominator

Assume denominator will never be 0.

The class should support the following functionalities

add(Fraction) -> Returns the sum of two fractions

subtract(Fraction) -> Returns the difference of two fractions

multiply(Fraction) -> Returns the product of two fractions

The fraction returned needs to be in the simplest form. If the fraction is p/q then p and q must be co-prime.

You may define any properties in the class as you see appropriate
 */
    int numerator, denominator;
		
	// Define constructor here
    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
	
	int gcd(int A, int B)
	{
	    if(B==0)return A;
	    return gcd(B, A%B);
	}
	Fraction add(Fraction a){
		// Complete the function
		int num = this.numerator*a.denominator + this.denominator*a.numerator;
		int denom = this.denominator* a.denominator;
		int temp = gcd(Math.abs(num), Math.abs(denom));
		num /= temp;
		denom /= temp;
		Fraction addA = new Fraction(num, denom);
		return addA;
	}
		
	Fraction subtract(Fraction a){
		// Complete the function
		int num = this.numerator*a.denominator - this.denominator*a.numerator;
		int denom = this.denominator* a.denominator;
		int temp = gcd(Math.abs(num), Math.abs(denom));
		num /= temp;
		denom /= temp;
		Fraction subA = new Fraction(num, denom);
		return subA;
	}
		
	Fraction multiply(Fraction a){
		// Complete the function
		int num = this.numerator*a.numerator;
		int denom = this.denominator* a.denominator;
		int temp = gcd(Math.abs(num), Math.abs(denom));
		num /= temp;
		denom /= temp;
		Fraction mulA = new Fraction(num, denom);
		return mulA;
	}
	public static void main(String[] args) {
	    Fraction x = new Fraction(2, 3);  // 2/3
	    Fraction y = new Fraction(4, 5); // 4/5
	    Fraction z = x.add(y); // 22/15
	    Fraction a = x.subtract(y); // -2/15
	    Fraction b = x.multiply(y); // 8/15
	}
}

/*
    Fraction x = new Fraction(2, 3)  // 2/3
	Fraction y = new Fraction(4, 5) // 4/5
    Fraction z = x.add(y) // 22/15
    Fraction z = x.subtract(y) // -2/15
    Fraction z = x.multiply(y) // 8/15
*/
