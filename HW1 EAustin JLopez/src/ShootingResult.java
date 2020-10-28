import org.junit.*;
import static org.junit.Assert.*;

public class ShootingResult implements IEvent {

    ShootingRound round1;
    ShootingRound round2;
    ShootingRound round3;
    ShootingRound round4;




    public ShootingResult(ShootingRound round1, ShootingRound round2, ShootingRound round3, ShootingRound round4) {
        this.round1 = round1;
        this.round2 = round2;
        this.round3 = round3;
        this.round4 = round4;

    }

    public double pointsEarned() {
        return this.round1.targetsHit + this.round2.targetsHit + this.round3.targetsHit + this.round4.targetsHit;
    }

//max score = 20

    public double getPenalties() {
        double multiplier = 20 - (pointsEarned());
        return multiplier * 60;
    }
}