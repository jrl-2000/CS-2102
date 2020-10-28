import org.junit.*;
import static org.junit.Assert.*;

public class Athlete {
    FinalResult aFinalResult;


    public Athlete(FinalResult finalResult){
        this.aFinalResult = finalResult;
    }


    public boolean betterSkiier(Athlete athlete) {
        if (athlete.aFinalResult.skiingResult.pointsEarned() >  aFinalResult.skiingResult.pointsEarned()){
            return true;
        }
        else {
            return false;
        }


    }

    public boolean betterShooter(Athlete athlete){
        if (athlete.aFinalResult.shootingResult.pointsEarned() > aFinalResult.shootingResult.pointsEarned()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean hasBeaten(Athlete athlete){
        if (betterSkiier(athlete) || betterShooter(athlete)){
            return true;
        }
        else {
            return false;
        }
    }

}
