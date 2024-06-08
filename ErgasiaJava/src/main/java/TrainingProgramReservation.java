import java.time.LocalDate;

public class TrainingProgramReservation {
    private static int counter = 0;
    private int id;
    private Athlete athlete;
    private TrainingProgram trainingProgram;
    private LocalDate trainingDate;

    public TrainingProgramReservation(Athlete athlete, TrainingProgram trainingProgram, LocalDate trainingDate) {
        this.id = ++counter;
        this.athlete = athlete;
        this.trainingProgram = trainingProgram;
        this.trainingDate = trainingDate;
    }

    // getters and setters	
}
