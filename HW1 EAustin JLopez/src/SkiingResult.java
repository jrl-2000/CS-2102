import org.junit.*;
import static org.junit.Assert.*;

public class SkiingResult implements IEvent {
    double lap1Time;
    double lap2Time;
    double lap3Time;
    double lap4Time;
    int penalties;
    int position;

    public SkiingResult(int position, double lap1Time, double lap2Time, double lap3Time, double lap4Time, int penalties) {
        this.lap1Time = lap1Time;
        this.lap2Time = lap2Time;
        this.lap3Time = lap3Time;
        this.lap4Time = lap4Time;
        this.position = position;
        this.penalties = penalties;
    }
    public double pointsEarned() {
        return lap1Time + lap2Time + lap3Time + lap4Time;
    }
    public double getPenalties() {
        return penalties * 5;
    }
}