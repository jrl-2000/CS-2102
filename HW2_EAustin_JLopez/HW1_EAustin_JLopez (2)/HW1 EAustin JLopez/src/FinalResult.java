import org.junit.*;
import static org.junit.Assert.*;

public class FinalResult {
    SkiingResult skiingResult;
    ShootingResult shootingResult;

    public FinalResult(ShootingResult asr, SkiingResult askr) {
        this.shootingResult = asr;
        this.skiingResult = askr;


    }


    /**
     * calculates the final score after a skiing event and shooting event with penalties
     * @return double the final score
     */

    public double finalScore() {
        if (skiingResult.position == 1) {
            return skiingResult.lap1Time + skiingResult.lap2Time + skiingResult.lap3Time + skiingResult.lap4Time + shootingResult.getPenalties() + skiingResult.getPenalties() - 10; //1st place
        }
        else if (skiingResult.position == 2){
            return skiingResult.lap1Time + skiingResult.lap2Time + skiingResult.lap3Time + skiingResult.lap4Time + shootingResult.getPenalties() + skiingResult.getPenalties() - 7; //2nd place
        }
        else if (skiingResult.position == 3){
            return skiingResult.lap1Time + skiingResult.lap2Time + skiingResult.lap3Time + skiingResult.lap4Time + shootingResult.getPenalties() + skiingResult.getPenalties() - 3; //3rd place
        }
        if (skiingResult.position == 4){
            return skiingResult.lap1Time + skiingResult.lap2Time + skiingResult.lap3Time + skiingResult.lap4Time + shootingResult.getPenalties() + skiingResult.getPenalties() - 1; //4th place
        }
        else {
            return skiingResult.lap1Time + skiingResult.lap2Time + skiingResult.lap3Time + skiingResult.lap4Time + shootingResult.getPenalties() + skiingResult.getPenalties(); //all other places
        }
    }
}
