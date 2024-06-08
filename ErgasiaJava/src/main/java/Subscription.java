public class Subscription implements Pricelist {
    private static int counter = 0;
    private int id;
    private Athlete athlete;
    private TrainingProgram trainingProgram;
    private double monthlyCost;

    public Subscription(Athlete athlete, TrainingProgram trainingProgram, double monthlyCost) {
        this.id = ++counter;
        this.athlete = athlete;
        this.trainingProgram = trainingProgram;
        this.monthlyCost = monthlyCost;
    }

    @Override
    public double calculateTotalPrice() {
        return monthlyCost;
    }

    // getters and setters
}
