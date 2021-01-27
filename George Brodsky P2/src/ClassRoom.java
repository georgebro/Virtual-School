import java.util.ArrayList;

public class ClassRoom {

	public String name;
	public Teacher teacher;
	ArrayList<Student> students;

	// CTOR EMTY.
	public ClassRoom() {
		students = new ArrayList<Student>();
	}
	
	// CTOR FULL.
	public ClassRoom(String name, Teacher teacher, ArrayList<Student> students) {
		this.setName(name);
		this.setTeacher(teacher);
		this.setStudents(students);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	// Display Class Room.
	public void display() {
		System.out.println("Class name " + name);
		teacher.display();
		for (Student student : students) {
			student.display();
		}
		System.out.println();
	}

	// Calculate class average Age.
	public double calcClassAvgAge() {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < students.size(); i++) {
			sum += students.get(i).calcStudentAvgAge();
		}
		avg = (double)sum/students.size();
		return avg;
	} 

	// Calculate student age AVEARGE.
	public double calcStudentAvgAge() {
		int sum = 0;

		for (int i = 0; i < students.size(); i++) {
			sum=+students.get(i).getAge();
		}
		return (double)sum/students.size();
	}

	// Calculate Profession Average.
	public double calcProfessionAvg(String profession) {
		int sum = 0;
		int count = 0;
		for(Student student: students ) {
			for(Grade grade : student.getGrades()) {
				if(grade.getProfession().equals(profession)) {
					sum += grade.getScore();
					count ++;
				}
			}
		}
		if(count == 0) {
			return 0;
		}
		return (double)sum/count;
	}
	
	// Calculate Class Average.
	public double calcClassAvg() {
		double avg =0;
		double  count = 0;
		for(Student student : students) {
			avg += student.calcStudentAvgAge() ;
			count++;
		}
		return avg/count;
	}
	
}

