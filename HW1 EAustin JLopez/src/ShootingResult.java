import org.junit.*;
import static org.junit.Assert.*;

public class ShootingResult implements IEvent{
    int target1;
    int target2;
    int target3;
    int target4;
    int target5;
    int finalScore = 0;

    public ShootingResult(int target1Param, int target2Param, int target3Param, int target4Param, int target5Param) {

        this.target1 = target1Param;
        this.target2 = target2Param;
        this.target3 = target3Param;
        this.target4 = target4Param;
        this.target5 = target5Param;
        //this.penalties = penalties;
    }
    ShootingResult round1 = new ShootingResult(1, 1, 1, 1, 1);
    ShootingResult round2 = new ShootingResult(1, 1, 1, 1, 1);
    ShootingResult round3 = new ShootingResult(1, 1, 1, 1, 1);
    ShootingResult round4 = new ShootingResult(1, 1, 1, 1, 1);

    public double pointsEarned() {
        if (this.round1.target1 == 1) {
            return this.finalScore + 1;
        }
        if (this.round1.target2 == 1) {
            return this.finalScore + 1;
        }
        if (this.round1.target3 == 1) {
            return this.finalScore + 1;
        }
        if (this.round1.target4 == 1) {
            return this.finalScore + 1;
        }
        if (this.round1.target5 == 1) {
            return this.finalScore + 1;
        }
        if (this.round2.target1 == 1) {
            return this.finalScore + 1;
        }
        if (this.round2.target2 == 1) {
            return this.finalScore + 1;
        }
        if (this.round2.target3 == 1) {
            return this.finalScore + 1;
        }
        if (this.round2.target4 == 1) {
            return finalScore + 1;
        }
        if (this.round2.target5 == 1) {
            return finalScore + 1;
        }
        if (this.round3.target1 == 1) {
            return finalScore + 1;
        }
        if (this.round3.target2 == 1) {
            return finalScore + 1;
        }
        if (this.round3.target3 == 1) {
            return finalScore + 1;
        }
        if (this.round3.target4 == 1) {
            return finalScore + 1;
        }
        if (this.round3.target5 == 1) {
            return finalScore + 1;
        }
        if (this.round4.target1 == 1) {
            return finalScore + 1;
        }
        if (this.round4.target2 == 1) {
            return finalScore + 1;
        }
        if (this.round4.target3 == 1) {
            return finalScore + 1;
        }
        if (this.round4.target4 == 1) {
            return finalScore + 1;
        }
        if (this.round4.target5 == 1) {
            return finalScore + 1;
        }
        return this.finalScore;
    }

//max score = 20

    public double getPenalties() {
        int multiplier = (int) (pointsEarned() - 20); //gets score from points earned

        if (multiplier > 0) {
            return multiplier * 60;
        }
    return multiplier;
    }
}
