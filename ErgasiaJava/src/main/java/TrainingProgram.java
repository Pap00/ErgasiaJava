import java.time.DayOfWeek;

public class TrainingProgram {
    private static int counter = 0;
    private int id;
    private Sport sport;
    private Facility facility;
    private Coach coach;
    private int minExperienceLevel;
    private boolean requiresWeeklyBooking;
    private String participantGender;
    private int durationInMinutes;
    private DayOfWeek dayOfWeek;

    public TrainingProgram(Sport sport, Facility facility, Coach coach, int minExperienceLevel, boolean requiresWeeklyBooking, String participantGender, int durationInMinutes, DayOfWeek dayOfWeek) {
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

    // getters and setters
}
