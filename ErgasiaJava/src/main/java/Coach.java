
public class Coach extends User {
	private String sport;
	private String degree;
	
	Coach(String name, int age, char gender,String surname,String contactinfo,String sport,String degree){
		super(name,age,gender,surname,contactinfo);
		this.sport=sport;
		this.degree=degree;
	}
	void setSport(String sport) {
		this.sport=sport;
	}
	void setDegree(String degree) {
		this.degree=degree;
	}
	String getSport() {
		return sport;
	}
	String getDegree() {
		return degree;
	}
}

