import org.junit.*;
import static org.junit.Assert.*;

import java.awt.peer.LabelPeer;
import java.util.LinkedList;

public class SkiingResult implements IEvent {

    LinkedList<Double> laps = new LinkedList<Double>();

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
        laps.addLast(lap1Time);
        laps.addLast(lap2Time);
        laps.addLast(lap3Time);
        laps.addLast(lap4Time);


    }


    /**
     * calculates the points earned for a skiiing event
     * @return double the points earned
     */

    int counter = 0; //counter for each lap in the linked list. starts at zero
    double counter5 = 0;
    public double pointsEarned() {
        for(Double aLap : laps){
            counter5 = counter5 + laps.get(counter);
            counter++;
        }

        return counter5;
    }

    /**
     * calculates the  penalties for a skiing event
     * @return double the total penalty points
     */
    public double getPenalties() {

        return penalties * 5;
    }
}