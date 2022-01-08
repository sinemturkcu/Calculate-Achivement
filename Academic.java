package calculateAchievement;


import java.util.Calendar;

public class Academic extends Personal{

    private int numberOfPaper;
    private int numberOfSymposium;

    public Academic(String name, int birthYear, String department,int numberOfPaper,int numberOfSymposium) {
        super(name, birthYear, department);
        this.numberOfPaper=numberOfPaper;
        this.numberOfSymposium=numberOfSymposium;

    }


    @Override
    public double calculateAchievement() {
        Calendar calendar=Calendar.getInstance();
        return ((3 * numberOfPaper) + (2 * numberOfSymposium)) / (calendar.get(Calendar.YEAR)-getBirthYear());
    }

    public int getNumberOfPaper() {
        return numberOfPaper;
    }

    public void setNumberOfPaper(int numberOfPaper) {
        this.numberOfPaper = numberOfPaper;
    }

    public int getNumberOfSymposium() {
        return numberOfSymposium;
    }

    public void setNumberOfSymposium(int numberOfSymposium) {
        this.numberOfSymposium = numberOfSymposium;
    }


}
