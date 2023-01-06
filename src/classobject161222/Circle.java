package classobject161222;
// https://www.scaler.com/academy/mentee-dashboard/class/40886/assignment/problems/27007/hints?navref=cl_pb_nv_tb
public class Circle {
    // Define properties here
    float radius;
    
    // Define constructor here
    Circle(float radius){
        this.radius = radius;
    }

    float perimeter(){
		// Complete the function
		//return (float) (2*Math.PI*this.radius);
		return (float) (2*3.14*this.radius);
	}
	
	float area(){
		// Complete the function
		//return (float) (Math.PI*Math.pow(radius, 2));
		return (float) (3.14*Math.pow(radius, 2));
	}
	public static void main(String[] args) {
		Circle a = new Circle(3);  // Radius = 3
		System.out.println(a.perimeter()); // 18.84
		System.out.println(a.area()); // 28.26
	}
}

/*
    Circle a = new Circle(3)  // Radius = 3
	a.perimeter() // 18.84
    a.area() // 28.26
*/
/*
class Circle {
// Define properties here
int radius;

// Define constructor here
Circle(int x){
    this.radius = x;
}

float perimeter(){
	// Complete the function
	return (float)(2 * 3.14 * this.radius);
}

float area(){
	// Complete the function
	return (float)(3.14 * this.radius * this.radius);
}
}
*/