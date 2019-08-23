package ARP;

public class Professor extends Person implements ClassRoom {
	public String title;

	public Professor(int age, String title) {
		super(age);
		this.title = title;
	}

	public void display() {
		System.out.println("Professor Title: " + title);
	}

	public void teaching() {
		System.out.println("Professor is Teaching...");
	}

	public void reading() {

	}

	public void testing() {
		System.out.println("Professor is Testing...");
	}
}
