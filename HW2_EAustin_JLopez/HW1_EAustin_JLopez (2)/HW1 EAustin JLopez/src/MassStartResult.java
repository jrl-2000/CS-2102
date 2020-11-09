import org.junit.*;
import static org.junit.Assert.*;

import java.awt.peer.LabelPeer;
import java.util.LinkedList;

class MassStartResult extends AbsSkiing implements IEvent{

    LinkedList<Double> lapsM = new LinkedList<Double>();
    double lap1Time;
    double lap2Time;
    double lap3Time;
    double lap4Time;
    int startPos;

    MassStartResult (int startPos, int position, double lap1Time, double lap2Time, double lap3Time, double lap4Time, int penalties) {
        super(position,penalties);
        lapsM.addLast(lap1Time);
        lapsM.addLast(lap2Time);
        lapsM.addLast(lap3Time);
        lapsM.addLast(lap4Time);
        this.startPos = startPos;
        this.lap1Time = lap1Time;
        this.lap2Time = lap2Time;
        this.lap3Time = lap3Time;
        this.lap4Time = lap4Time;
        this.position = position;
        this.penalties = penalties;
    }
    int counterMass = 0;

    /**
     * calculates the points earned after a Mass Start event
     * @return double earned points
     */

    int counter6 = 0; //counter for each lap in the linked list. starts at zero
    double counter7 = 0;
    public double pointsEarned() {
        for(Double aLap : lapsM){
            counter7 = counter7 + lapsM.get(counter6);
            counter6++;
        }

        return counter7;
    }


    /**
     * calculates the penalties in a Mass Start event
     * @return double the peanlties for Mass Start
     */

    public double getPenalties() {

        return penalties * 5;
    }
}
