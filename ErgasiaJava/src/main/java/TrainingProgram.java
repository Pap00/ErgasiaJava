import java.time.DayOfWeek;

public class TrainingProgram {
    private static int counter = 0;
    private int id;
    private String sport;
    private String facility;
    private String coach;
    private int minExperienceLevel;
    private boolean requiresWeeklyBooking;
    private String participantGender;
    private int durationInMinutes;
    private String dayOfWeek;

    public TrainingProgram(String sport, String facility, String coach, int minExperienceLevel, boolean requiresWeeklyBooking, String participantGender, int durationInMinutes, String dayOfWeek) {
        this.id = ++counter;
        this.sport = sport;
        this.facility = facility;
        this.coach = coach;
        this.minExperienceLevel = minExperienceLevel;
        this.requiresWeeklyBooking = requiresWeeklyBooking;
        this.participantGender = participantGender;
        this.durationInMinutes = durationInMinutes;
        this.dayOfWeek = dayOfWeek;
    }

    int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
    
    String getSport() {
    	return sport;
    }
    public void setSport(String sport) {
    	this.sport = sport;
    }
    
    String getFacility() {
    	return facility;
    }
    public void setFacility(String facility) {
    	this.facility = facility;
    }
    
    String geCoach() {
    	return coach;
    }
    public void setCoach(String coach) {
    	this.coach = coach;
    }
    
    String getParticipantGender() {
    	return participantGender;
    }
    public void setParticipantGender(String participantGender) {
    	this.participantGender = participantGender;
    }
    
    String getDurationInMinutes() {
    	return durationInMinutes;
    }
    public void setDurationInMinutes(String durationInMinutes) {
    	this.durationInMinutes = durationInMinutes;
    }
    
    String getDayOfWeek() {
    	return dayOfWeek;
    }
    public void setDayOfWeek(String dayOfWeek) {
    	this.dayOfWeek = dayOfWeek;
    }
}
