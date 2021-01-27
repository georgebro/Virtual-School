import java.util.ArrayList;

/**
 * 
 * @author George Brodsky.
 *
 */

public class program {

	public static void main(String[] args) {


		ArrayList<Dean> deans = new ArrayList<Dean>();
		Initialize.generateRandomArrayOfDeans(deans);

		ArrayList<ClassRoom> classRooms = new ArrayList<ClassRoom>();
		Initialize.generateRandomClassRoom(classRooms);

		School school = new School(classRooms,deans);
		school.display();

		// Object s1 is shool #1.
		PrintSchool.initializeSchool(classRooms,deans);
		School s1  = new School(classRooms,deans);
		PrintSchool.displaySchoolAverages(s1);

	}
}
