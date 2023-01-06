package classobject161222;

public class Rectangle {
    // Define properties here
    float length;
    float width;
    
    // Define constructor here
    Rectangle(float len, float wid){
        this.length = len;
        this.width = wid;
    }

    int perimeter(){
		// Complete the function
		return  (int) ((int)2*(this.length+this.width));
	}
	
	int area(){
		// Complete the function
		return  (int) ((int)this.length*this.width);
	}
	public static void main(String[] args) {
		Rectangle a = new Rectangle(2, 3);  // Length = 2, Breadth = 3
		System.out.println(a.perimeter()); // Should give 10
		System.out.println(a.area()); // Should give 6
	}
}

/*
    Rectangle a = new Rectangle(2, 3)  // Length = 2, Breadth = 3
	a.perimeter() // Should give 10
    a.area() // Should give 6
*/
