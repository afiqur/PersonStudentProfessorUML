package ARP;

public class PersonMain {
	public static void main(String[] args) {
		Professor p = new Professor(50, "Assistant Professor");
		System.out.println("Professor Age: " + p.get_Age());
		p.display();
		p.teaching();
		p.testing();

		Student s = new Student(20, "182-15-182");
		System.out.println("Student Age: " + s.get_Age());
		s.display();
		s.reading();
		s.testing();
	}
}
