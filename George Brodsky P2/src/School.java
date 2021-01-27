import java.util.ArrayList;

public class School {

	ArrayList<ClassRoom> classRooms;
	ArrayList<Dean> deans;

	//CTOR empty 
	public School() {
		deans = new ArrayList<Dean>();
		classRooms = new ArrayList<ClassRoom>();
	}

	// FULL CTOR
	public School(ArrayList<ClassRoom> classRooms, ArrayList<Dean> deans) {
		setClassRooms(classRooms);
		setDeans(deans);
	}

	public ArrayList<ClassRoom> getClassRooms() {
		return classRooms;
	}
	public void setClassRooms(ArrayList<ClassRoom> classRooms) {
		this.classRooms = classRooms;
	}
	public ArrayList<Dean> getDeans() {
		return deans;
	}
	public void setDeans(ArrayList<Dean> deans) {
		this.deans = deans;
	}

	// Display class room and Deans
	public void display() {
		System.out.println("CLASS ROOM IS:");
		for (ClassRoom classRoom : classRooms) {
			classRoom.display();
		}
		System.out.println("-----------------------");
		System.out.println("DEANS IS:");
		for (ClassRoom classRoom : classRooms) {
			classRoom.display();
		}
		System.out.println();
	}

	// Calculate average profession.
	public double calcAvgProfession(String profession) {
		int count = 0;
		double avg = 0;
		for(ClassRoom classRoom : classRooms) {
			avg  += classRoom.calcProfessionAvg(profession);
			count ++;
		}
		if(count == 0) {
			return 0;
		}
		return (double)avg/count;
	}

	// Calculate number of TEACHERS in REAL professions.
	public int calcNumOfTeachInRealProf() {
		int count = 0;
		for(ClassRoom classRoom : classRooms) {
			for(String pro : classRoom.getTeacher().getProfessions()) {
				if(pro.equals("math"))
					count ++;
				if(pro.equals("physics"))
					count ++;
			}
		}
		return count;
	}

	// Calculate number of DEANS in REAL professions.
	public int calcNumOfDeanInRealProf() {
		int count = 0;
		for(Dean dean : deans) {
			if(dean.getExpertProfession().equals("math"))
				count++;
			if(dean.getExpertProfession().equals("physics"))
				count++;
		}
		return count;
	}

	// Calculate number of Teacher to Sport and Literature.
	public int calcNumOfTeachSPortLiterature() {
		int count = 0;
		for(ClassRoom classRoom : classRooms) {
			for(String pro : classRoom.getTeacher().getProfessions()) {
				if(pro.equals("literature"))
					count++;
				if(pro.equals("sports"))
					count++;
			}
		}
		return count;
	}

	//Function that DISPLAY Sport team .
	public void displaySprotTeam() {
		System.out.println("SPORT TEAM IS :");
		for(ClassRoom classRoom : classRooms) {
			for(Student student : classRoom.getStudents()) {
				for(Grade grade : student.getGrades()) {
					if(grade.getProfession().equals("sport") && grade.getScore() > 90 ) {
						System.out.print(student.getName() + ", " );
					}
				}
			}
		}
	}

	// Calculate and display average from 20 to 30.
	public void displayAvgFrom20to30() {
		int count = 0;
		double avg = 0;
		for(ClassRoom classRoom : classRooms) {
			for(Student student : classRoom.getStudents()) {
				if(student.getAge() >=20 || student.getAge() <=30) {
					count++;
					avg+=student.calcStudentAvgAge();
				}
			}
		}
		System.out.println( " THE STUDENTS FROM 20 to 30 IS :  "+ count);
		System.out.println( " THE AVERAGE OF STUDENT FROM 20 to 30 IS : " + avg/count);
	}


	// Calculate and display average over 31.
	public void displayAvgOver31() {
		int count = 0;
		double avg = 0;
		for(ClassRoom classRoom : classRooms) {
			for(Student student : classRoom.getStudents()) {
				if(student.getAge() >= 31) {
					count ++;
					avg+=student.calcStudentAvgAge();
				}
			}
		}
		System.out.println( " THE NUMBER OF STUDENTS OVER 31 AGE IS : " + count);
		System.out.println( " THE AVERAGE OF STUDENTS OVER 31 AGE IS : " + avg/count);
	}

	// Calculate School Average.
	public double calcSchoolAvg() {
		double avg = 0;
		for(ClassRoom classRoom : classRooms) {
			avg += classRoom.calcClassAvg();
		}
		return avg;
	}
}

