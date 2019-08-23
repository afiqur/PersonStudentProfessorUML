package ARP;

public class PersonMain {
	Professor professor;
	Student student;

	public PersonMain(Professor professor, Student student) {
		this.professor = professor;
		this.student = student;
	}

	public static void main(String[] args) {

		Professor professor = new Professor(50, "Assistant Professor");

		Student student = new Student(20, "182-15-182");

		PersonMain personMain = new PersonMain(professor, student);

		System.out.println("Professor Age: " + personMain.professor.get_Age());
		personMain.professor.display();
		personMain.professor.teaching();
		personMain.professor.testing();

		System.out.println("Student Age: " + personMain.student.get_Age());
		personMain.student.display();
		personMain.student.reading();
		personMain.student.testing();
	}
}
