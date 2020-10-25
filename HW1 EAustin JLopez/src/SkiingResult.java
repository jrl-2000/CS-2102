import org.junit.*;
import static org.junit.Assert.*;

public class SkiingResult implements IEvent {
    double lap1Time;
    double lap2Time;
    double lap3Time;
    double lap4Time;
    int position;
    int penalties;


    public double pointsEarned() {
        return lap1Time + lap2Time + lap3Time + lap4Time;
    }


    public double getPenalties() {
        return penalties * 5;
    }


}
