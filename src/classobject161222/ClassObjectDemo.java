package classobject161222;

public class ClassObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EmployeeD nish = new EmployeeD(); 
		//System.out.println(nish); // classobject161222.EmployeeD@4c203ea1
		EmployeeD bachira = new EmployeeD("Bachira", 5, 10000);
		//System.out.println(bachira.salary);// compile error as visibility needs to be public to access
		System.out.println(bachira.getSalary());
		EmployeeD nagi = new EmployeeD("Nagi", 6, 20000);
		System.out.println(nagi.name);
		System.out.println(nagi.getHealth());
		
		Node a = new Node(4);
		System.out.println(a.value); // 4
		System.out.println(a.temp); // null as not initialized so not pointing to any memory location
		a.temp = new Node(5);
		System.out.println(a.temp);//classobject161222.Node@7c30a502
		// will give memory address as this is Node object
		System.out.println(a.temp.value);// 5 as we set the value for 11 of temp Node
		a.temp.temp = new Node(6);
		System.out.println(a.temp.temp);
		System.out.println(a.temp.temp.value);
		
		
	}
}
class Node{
	int value;
	Node temp;
	
	Node(int value){
		this.value = value;
		this.temp=null;
	}
}
class EmployeeD{
	String name;
	int id;
	private int salary; 
	EmployeeD(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	int getSalary() {
		return this.salary;
	}
	String getHealth() {
		return "Healthy";
	}
}