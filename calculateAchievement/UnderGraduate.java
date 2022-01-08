package calculateAchievement;

public class UnderGraduate extends Student {
    private double credit;

    public UnderGraduate(String name, double GPA,double credit) {
        super(name, GPA);
        this.credit=credit;
    }


    @Override
    public double calculateAchievement() {
        return 50 * credit * getGPA();
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}