import org.junit.*;
import static org.junit.Assert.*;

// Homework 1
// Team 1266
// Emily Austin, Jonathan Lopez
// start date: 10/23/2020

public class Athlete {
    FinalResult aFinalResult;
    String aName;


    public Athlete(FinalResult finalResult, String name){
        this.aFinalResult = finalResult;
        this.aName = name;
    }

    /**
     * calculates if a skiier is better than another
     * @param athlete take in a athlete
     * @return boolean if the athlete is a better skiier
     */

    public boolean betterSkiier(Athlete athlete) {
        if (athlete.aFinalResult.skiingResult.pointsEarned() >  this.aFinalResult.skiingResult.pointsEarned()){
            return true;
        }
        else {
            return false;
        }


    }

    /**
     * calculates if a shooter is better than another
     * @param athlete take in a athlete
     * @return boolean is the athelet is a better shooter
     */
    public boolean betterShooter(Athlete athlete){
        if (athlete.aFinalResult.shootingResult.pointsEarned() < this.aFinalResult.shootingResult.pointsEarned()){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * calculates if an athlete has beaten another athlete
     * @param athlete take in athlete
     * @return boolean if the athlete has beaten the other
     */
    public boolean hasBeaten(Athlete athlete){
        if (betterSkiier(athlete) || betterShooter(athlete)){ //logical OR ||
            return true;
        }
        else {
            return false;
        }
    }

}
