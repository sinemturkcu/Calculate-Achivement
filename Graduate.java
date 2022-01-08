package calculateAchievement;


public class Graduate extends Student {
    private int numberOfPaper;

    public Graduate(String name, double GPA,int numberOfPaper) {
        super(name, GPA);
        this.numberOfPaper=numberOfPaper;
    }


    @Override
    public double calculateAchievement() {
        return numberOfPaper * 30 + getGPA() * 20;
    }

    public int getNumberOfPaper() {
        return numberOfPaper;
    }

    public void setNumberOfPaper(int numberOfPaper) {
        this.numberOfPaper = numberOfPaper;
    }
}
