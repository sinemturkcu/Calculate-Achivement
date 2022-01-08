package calculateAchievement;

public class Administrative extends Personal{

    public Administrative(String name, int birthYear, String department) {
        super(name, birthYear, department);
    }


    @Override
    public double calculateAchievement() {
        return 0;
    }


}