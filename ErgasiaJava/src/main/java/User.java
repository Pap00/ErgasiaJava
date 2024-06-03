public class User {
	
	private String name;
	private int age;
	private char gender;
	private String sirname;
	private String contactinfo;
	
	User(String name, int age, char gender,String sirname,String contactinfo){
		this.name=name;
		this.age=age;
		this.gender=gender;	
		this.sirname=sirname;
		this.contactinfo=contactinfo;
	}
	

	
	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	char getGender() {
		return gender;
	}
	
	String getSirName() {
		return sirname;
	}
	
	String getcontactinfo() {
		return contactinfo;
	}
	
	void setName(String name) {
		this.name=name;
	}

	void setAge(int age) {
		this.age=age;
	}

	void setGender(char gender) {
		this.gender=gender;
	}
	
	void setSirName(String sirname) {
		this.sirname=sirname;
	}
	
	void setContactInfo(String contactinfo) {
		this.contactinfo=contactinfo;
	}
	
	public String getClassDescription() {
		String description=new String("This class describes Users of this applicaion");
		return description;
	}
	
	
	public String toString() {
		return new String("Name: "+name+"\nSirname: "+sirname+"\nAge: "+age+"\nGender: "+gender+"\nContact Info: "+contactinfo);
	}

}
