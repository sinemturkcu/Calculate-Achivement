package calculateAchievement;

public abstract class Personal implements Lecturable {
    private String name;
    private int birthYear;
    private String department;


    public Personal(String name, int birthYear, String department) {
        this.name = name;
        this.birthYear = birthYear;
        this.department = department;
    }

    @Override
    public boolean isQualified() {
        if (calculateAchievement() > 1) {
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

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getDepartment() {
        return department;
    }
}

