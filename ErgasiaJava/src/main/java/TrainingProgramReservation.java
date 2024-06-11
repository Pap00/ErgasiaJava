import java.time.LocalDate;

public class TrainingProgramReservation {
    private static int counter = 0;
    private int id;
    private String athlete;
    private String trainingProgram;
    private String trainingDate;

    public TrainingProgramReservation(String athlete, String trainingProgram, String trainingDate) {
        this.id = ++counter;
        this.athlete = athlete;
        this.trainingProgram = trainingProgram;
        this.trainingDate = trainingDate;
    }

    String getAthlete() {
    	return athlete;
    }
    public void setAthlete(String athlete) {
    	this.athlete = athlete;
    }
    
    String getTrainingProgram() {
    	return trainingProgram;
    }
    public void setTrainingProgram(String trainingProgram) {
    	this.trainingProgram = trainingProgram;
    }
    
    String getTrainingDate() {
    	return trainingDate;
    }
    public void setTrainingDate(String trainingDate) {
    	this.trainingDate = trainingDate;
    }
}

