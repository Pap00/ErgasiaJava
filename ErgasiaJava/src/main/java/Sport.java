
public class Sport {

	private String sportName; 
	private String levelRef; //variable to determine if 
                            //the sport refers to professionals
	
	Sport(String sportName,String levelRef ){
	
		this.sportName = sportName;
		this.levelReference = levelRef;
	}
	
	String getSportName() {
		return sportName;
	}
	public void setSportName() {
		this.sportName = sportName;
	}
	String getLevelRef() {
		return levelRef;
	}
	public void setLevelRef() {
		this.levelRef = levelRef;
	}


}
