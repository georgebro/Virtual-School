import java.util.ArrayList;

public class Student extends Person{

	ArrayList<Grade> grades;

	//CTOR EMTY.
	public Student() {
		grades = new ArrayList<Grade>();
	}

	//CTOR FULL.
	public Student(String name, int age, ArrayList<Grade> grades) {
		super(name, age);
		this.setGrades(grades);
	}
	
	public ArrayList<Grade> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<Grade> grades) {
		this.grades = grades;
	}

	// Display DATA about student.
	public void display(){
		super.display();
		for (Grade grade : grades) {
			grade.display();
		}
		System.out.println();
	}
	// Calculate Student Average.
	public double calcStudentAvgAge() {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < grades.size(); i++) {
			sum = sum + grades.get(i).getScore();
		}
		avg = (double)sum/grades.size();
		return avg;	
	}
}
