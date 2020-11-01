import org.junit.*;
import static org.junit.Assert.*;

// Homework 1
// Team 1266
// Emily Austin, Jonathan Lopez
// start date: 10/23/2020

public class Athlete {
    FinalResult aFinalResult;


    public Athlete(FinalResult finalResult){
        this.aFinalResult = finalResult;
    }


    public boolean betterSkiier(Athlete athlete) {
        if (athlete.aFinalResult.skiingResult.pointsEarned() >  this.aFinalResult.skiingResult.pointsEarned()){
            return true;
        }
        else {
            return false;
        }


    }

    public boolean betterShooter(Athlete athlete){
        if (athlete.aFinalResult.shootingResult.pointsEarned() < this.aFinalResult.shootingResult.pointsEarned()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean hasBeaten(Athlete athlete){
        if (betterSkiier(athlete) || betterShooter(athlete)){ //logical OR ||
            return true;
        }
        else {
            return false;
        }
    }

}
