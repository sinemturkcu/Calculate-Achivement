package calculateAchievement;

public class Preparatory extends Student {
    private int levelOfEnglish;

    public Preparatory(String name, double GPA, int levelOfEnglish) {
        super(name, GPA);
        this.levelOfEnglish = levelOfEnglish;
    }


    @Override
    public double calculateAchievement() {
        return levelOfEnglish * 10 * getGPA();
    }

    public int getLevelOfEnglish() {
        return levelOfEnglish;
    }

    public void setLevelOfEnglish(int levelOfEnglish) {
        this.levelOfEnglish = levelOfEnglish;
    }
}

