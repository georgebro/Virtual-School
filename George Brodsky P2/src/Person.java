
public abstract class  Person {

	private String name;
	private int age;

	// CTOR EMPTY.
	public Person() {

	}

	// CTOR FULL.
	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	// Correct age ONLY.
	public void setAge(int age) {
		if(age < 16 && age > 100) {
			System.out.println( " AGE NOT CORRECT! ");
		}
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	// Display Person.
	public void display() {
		System.out.println(" NAME IS: "+name);
		System.out.println(" AGE IS: "+age);

	}
}
