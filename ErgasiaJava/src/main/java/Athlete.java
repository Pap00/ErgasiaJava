public class Athlete extends User {
	private int experience;
	private boolean professional;
	
	Athlete(String name, int age, char gender, String sirname, String contactinfo, int experience, boolean professional) {
		super(name, age, gender, sirname, contactinfo);
		this.experience=experience;
		this.professional=professional;
	}

	int getExperience() {
		return experience;
	}
	boolean getProfessional() {
		return professional;
	}
	void setExperience(int Experience) {
		this.experience=experience;
	}
	void setProfessional(boolean Professional) {
		this.professional=professional;
	}
}
