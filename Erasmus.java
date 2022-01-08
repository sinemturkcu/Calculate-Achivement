package calculateAchievement;

public class Erasmus  extends Student{
    private String country;


    public Erasmus(String name, double GPA,String country) {
        super(name, GPA);
        this.country=country;
    }


    @Override
    public double calculateAchievement() {
        return 0;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

