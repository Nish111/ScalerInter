package classobject161222;

public class ClassObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5; // memory consumed need initialization
		/*
		int y=100;
		System.out.println(x);
		System.out.println(y);
		*/
		Employee nish = new Employee(); 
		// if parameterized constructor defined , need default one too
		System.out.println(nish.name);
		System.out.println(nish.id);
		System.out.println(nish.salary);
		nish.name="Nishant";
		nish.id=5;
		nish.salary=1000000;
		System.out.println(nish.name);
		System.out.println(nish.id);
		System.out.println(nish.salary);	
		Employee isagi = nish;// shallow copy
		Employee nagi = new Employee(); // deep copy
		nagi.name = nish.name;
		nagi.id=nish.id;
		nagi.salary = nish.salary;
		System.out.println("Printing Isagi - Name "+isagi.name+" "+"ID "+isagi.id+" "+
		"Salary "+isagi.salary);
		System.out.println("Printing Nagi - Name "+nagi.name+" "+"ID "+nagi.id+" "+"Salary "
		+nagi.salary);
		nish.name="Bachira";
		System.out.println("Now we have updated nish to bachira - shallow copy is updated "
				+ "while deep not");
		System.out.println("Printing Isagi - Name "+isagi.name+" "+"ID "+isagi.id+" "+"Salary "
				+isagi.salary);
		System.out.println("Printing Nagi - Name "+nagi.name+" "+"ID "+nagi.id+" "+"Salary "
				+nagi.salary);
		
	}
}
class Employee{
	String name;
	int id;
	int salary; 
	Employee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	Employee(){
		this.name = "Zoro";
		this.id = 1;
		this.salary = 10000000;
	}
}