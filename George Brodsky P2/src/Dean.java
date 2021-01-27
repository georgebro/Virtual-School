import java.util.ArrayList;

public class Dean extends Teacher{

	public String expertProfession;

	// CTOR EMPTY.
	public Dean() {
		this.expertProfession = null;
	}

	// CTOR FULL.
	public Dean(String name,int age,ArrayList<String> professions,String expertProfession) {
		super(name,age,professions);
		this.setExpertProfession(expertProfession);

	}

	public String getExpertProfession() {
		return expertProfession;
	}

	public void setExpertProfession(String expertProfession) {
		this.expertProfession = expertProfession;
	}

	// Display Deans.
	public void display() {
		System.out.println(" DEAN DATA IS: ");
		super.display();
		super.getProfessions();
		System.out.println(" DEAN PROFESSION IS :");
		for (int i = 0; i < professions.size(); i++) {
			System.out.println(professions.get(i)+", ");
		}
		System.out.println();
	}
	
	
}
