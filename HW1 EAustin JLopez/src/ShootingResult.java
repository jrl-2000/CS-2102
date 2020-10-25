import org.junit.*;
import static org.junit.Assert.*;

public class ShootingResult implements IEvent{
    int target1;
    int target2;
    int target3;
    int target4;
    int target5;

    int penalties = 0;

    public ShootingResult(int target1Param, int target2Param, int target3Param, int target4Param, int target5Param) {

        this.target1 = target1Param;
        this.target2 = target2Param;
        this.target3 = target3Param;
        this.target4 = target4Param;
        this.target5 = target5Param;


    }

    public double pointsEarned() {
        return target1 + target2 + target3 + target4 + target5;
    }

    public double getPenalties() {
        if (this.target1 == 0) {
            return this.penalties + 60;
        }
        if (this.target2 == 0) {
            return this.penalties + 60;
        }
        if (this.target3 == 0) {
            return this.penalties + 60;
        }
        if (this.target4 == 0) {
            return this.penalties + 60;
        }
        if (this.target5 == 0) {
            return this.penalties + 60;
        }
        return this.penalties;
    }


//    ShootingResult round1 = new ShootingResult();
//    ShootingResult round2 = new ShootingResult();
//    ShootingResult round3 = new ShootingResult();
//    ShootingResult round4 = new ShootingResult();
// int target1Param, int target2Param, int target3Param, int target4Param, int target5Param)
}
