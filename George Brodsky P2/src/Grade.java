
public class Grade {

	public String profession ;
	public int score ;

	// CTOR EMPTY.
	public Grade() {
		
	}

	// CTOR FULL.
	public Grade(String profession, int score) {
		this.setProfession(profession);
		this.setScore(score);
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getScore() {
		return score;
	}
	
	// Check Score from 0 up to 100 ONLY.
	public void setScore(int score) {
		if( score < 0 || 100 < score ) {
			System.out.println(" SCORE_NOT_CORRECT! MAST BE BETWEEN 0 to 100 ");
		}
		else {
			this.score = score;
		}
	}

	// Display 
	public void display() {
				System.out.println(" STUDENT PROFESSION : " + getProfession());
		System.out.println(" STUDENT SCORE : " + getScore());
	}

}
