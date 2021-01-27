import java.util.ArrayList;

public class PrintSchool {

	// Static function that Start School.
	public static void initializeSchool( ArrayList<ClassRoom> classRooms, ArrayList<Dean> deans )  {
		Initialize.generateRandomArrayOfDeans(deans);
		Initialize.generateRandomClassRoom(classRooms);
	}

	// Static function that display All of averages from School.
	public static void displaySchoolAverages(School school) {

		System.out.println(" \n ( 1 , 2 )-----------------------------");
		System.out.println( " MATH AVERAGE IS: " + school.calcAvgProfession( "math" ));
		System.out.println( " CHEMISTRY AVERAGE IS: " + school.calcAvgProfession( "chemistry"));
		System.out.println( " GEOGRAPHY AVERAGE IS: " + school.calcAvgProfession( "geography" ));
		System.out.println( " LITERATURE AVERAGE IS: " + school.calcAvgProfession( "literature" ));
		System.out.println( " PHYSICS AVERAGE IS: " + school.calcAvgProfession( "physics" ));
		System.out.println( " SPORT AVERAGE IS " + school.calcAvgProfession( "sports" ));

		System.out.println(" \n ( 3 )-----------------------------");
		System.out.println(" SCHOOL AVERAGE IS: " + school.calcSchoolAvg());

		System.out.println(" \n ( 4 )-----------------------------");
		System.out.println(" CLASS ROOMS AVERAGE IS: ");
		for(ClassRoom classRooms: school.getClassRooms()) {
			System.out.println(" NAME IS: " + classRooms.getName() + " AVERAGE IS: " + classRooms.calcClassAvgAge());
			System.out.println( " THE AVERAGE OF STUDENT AGE IS: " + classRooms.calcClassAvgAge());

		}
		System.out.println(" \n ( 5 ) -----------------------------");
		school.displayAvgFrom20to30();

		System.out.println(" \n ( 6 ) -----------------------------");
		school.displayAvgOver31();

		System.out.println(" \n ( 7 ) -----------------------------");
		System.out.println(" THE NUMBER OF TEACHER IN REAL PROFESSIONS IS: "+ school.calcNumOfTeachInRealProf());

		System.out.println(" \n ( 8 ) -----------------------------");
		System.out.println(" THE NUMBER OF DEANS WITH REAL PROFESSIONS IS: " + school.calcNumOfDeanInRealProf());

		System.out.println(" \n ( 9 ) -----------------------------");
		System.out.println(" THE NUMBER OF TEACHER IN SPORT AND LITETATURE IS: " + school.calcNumOfTeachSPortLiterature());

		System.out.println(" \n ( 10 ) -----------------------------");
		school.displaySprotTeam();

	}
}
