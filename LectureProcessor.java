package calculateAchievement;

public abstract class LectureProcessor implements Lecturable{
    public static void doIt(Lecturable lecturable){

        if( lecturable.isQualified()==true){
            System.out.println("can lecture..." );
        }
        else{
            System.out.println("cannot lecture");
        }

    }
}
