import java.util.ArrayList;

public class Teacher extends Person{

	ArrayList<String> professions;

	//CTOR.
	public Teacher() {
		professions = new ArrayList<String>();
	}

	// CTOR FULL.
	public Teacher(String name, int age, ArrayList<String> professions) {
		super(name , age);
		this.setProfessions(professions);
	}

	public ArrayList<String> getProfessions() {
		return professions;
	}

	public void setProfessions(ArrayList<String> professions) {
		this.professions = professions;
	}

	//Print DATA about teacher.
	public void displayTeacher() {
		super.display();
		for (int i = 0; i < professions.size(); i++) {
			System.out.println(" TEACHER PROFESSIONS IS : "+getProfessions().get(i));
		}
		System.out.println();
	}					
}



