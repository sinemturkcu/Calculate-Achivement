package calculateAchievement;

public abstract class Student implements Lecturable {
    private String name;
    private double GPA;

    public Student(){

    }

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    @Override
    public boolean isQualified() {
        if(calculateAchievement()>100){
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

}
