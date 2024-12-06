package AutoWiringDemo;

public class Chef 
{
	private String name;
	private int experience;
	private String specialty;
	private int age;
	private String nationality;
	
	public Chef(String name, int experience, String specialty, int age, String nationality) {
		super();
		this.name = name;
		this.experience = experience;
		this.specialty = specialty;
		this.age = age;
		this.nationality = nationality;
	}
	
	@Override
	public String toString() {
		return "Chef [name=" + name + ", experience=" + experience + ", specialty=" + specialty + ", age=" + age
				+ ", nationality=" + nationality + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
