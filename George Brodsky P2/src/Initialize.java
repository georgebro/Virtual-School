import java.util.ArrayList;
import java.util.Random;

public class Initialize {

	private static String[] listOfProfessions = {"math","chemistry","geography","literature","physics","sport"};
	private static ArrayList<String> teacherProfessionsArray = new ArrayList<>();
	private static ArrayList<Student> ArrayOfstudents = new ArrayList<>();

	
	//1. Generate random GRADES for one STUDENT of random professions.
	public static void generateRandomArrayGrades(ArrayList<Grade> grades) {
		for (int i = 0; i < 6; i++) {
			grades.add(new Grade(listOfProfessions[i],generateRandomValue(0,100)));
		}
	}

	//2. Generate random Quality of PROFESSIONS for TEACHER.
	public static void generateRandomArrayOfTeacherProfessions(ArrayList<String> professions) {
		int qtyOfProfessions = generateRandomValue(1,6);
		while(professions.size() < qtyOfProfessions) {
			String prof = listOfProfessions[generateRandomValue(0,5)];
			if (! professions.contains(prof)) {
				professions.add(prof);
			}
		}
	}

	//3. Generate The ARRAY of STUDENTS , names, ages and list of grades.
	public static void generateRandomArrayStudent(ArrayList<Student> students) {
		int qtyOfStudents = generateRandomValue(5,10);
		for (int i = 0; i < qtyOfStudents; i++) {
			ArrayList<Grade>grades=new ArrayList<Grade>();
			generateRandomArrayGrades(grades);
			students.add(new Student(generateRandomName(),generateRandomValue(16,120),grades));
		}
	}

	//4. Generate random ARRAY of DEANS.
	public static void generateRandomArrayOfDeans(ArrayList<Dean> deans) {
		ArrayList<String> deanProfessions = new ArrayList<>();
		//	int qtyOfDeans = generateRandomValue(1,10);
		String profOfDean = listOfProfessions[generateRandomValue(0,5)];
		for (int i = 0; i < profOfDean.length(); i++) {
			generateRandomArrayOfTeacherProfessions(deanProfessions);
			deans.add( new Dean (generateRandomName(),generateRandomValue(25,120),
					deanProfessions,profOfDean));
		}
	}

	//5. Generate random CLASS ROOM
	public static void generateRandomClassRoom(ArrayList<ClassRoom> classRooms) {
		int qtyOfClassRoom = generateRandomValue(1,6);
		for (int i = 0; i < qtyOfClassRoom; i++) {
			generateRandomArrayOfTeacherProfessions(teacherProfessionsArray);
			generateRandomArrayStudent(ArrayOfstudents);
			classRooms.add(new ClassRoom(" CLASS IS: "+(i+1),
					new Teacher(generateRandomName()+i,
							generateRandomValue(25,120),
							teacherProfessionsArray), 
					ArrayOfstudents));
		}
	}

	// The Function is HELPER, that return random VALUE from MIN to MAX.
	public static int generateRandomValue(int min , int max) {
		return (int)(min+Math.random()*(max-min+1));
	}

	// The Function, that Generate RANDOM NAMES.
	public static String generateRandomName() {
		String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random random = new Random();
		StringBuilder builder = new StringBuilder(5);
		for(int i = 0; i < 3; i++) {
			builder.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
		}
		return builder.toString();
	}
}	

