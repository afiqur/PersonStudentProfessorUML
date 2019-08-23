package ARP;

public class Student extends Person implements ClassRoom {

	public String id;

	public Student(int age, String id) {
		super(age);
		this.id = id;
	}

	public void display() {
		System.out.println("Student Id: " + id);
	}

	public void teaching() {

	}

	public void reading() {
		System.out.println("Student is Reading...");
	}

	public void testing() {
		System.out.println("Student is Testing...");
	}

}
