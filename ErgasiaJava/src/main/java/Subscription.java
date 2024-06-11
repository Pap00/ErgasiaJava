public class Subscription implements Pricelist {
    private static int counter = 0;
    private int id;
    private String athlete;
    private String trainingProgram;
    private double monthlyCost;

    public Subscription(String athlete, String trainingProgram, double monthlyCost) {
        this.id = ++counter;
        this.athlete = athlete;
        this.trainingProgram = trainingProgram;
        this.monthlyCost = monthlyCost;
    }

    @Override
    public double calculateTotalPrice() {
        return monthlyCost;
    }

    int getAthlete() {
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
}
