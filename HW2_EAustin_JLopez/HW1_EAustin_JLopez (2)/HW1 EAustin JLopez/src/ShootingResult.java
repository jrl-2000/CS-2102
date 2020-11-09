import java.util.LinkedList;
import org.junit.*;
import static org.junit.Assert.*;

import java.awt.peer.LabelPeer;
public class ShootingResult implements IEvent {

    LinkedList<ShootingRound> rounds;


    //ShootingRound round1;
    //ShootingRound round2;
    //ShootingRound round3;
    //ShootingRound round4;


    public ShootingResult(LinkedList<ShootingRound> rounds) {
        this.rounds = rounds;
        //rounds.addFirst(round1);
        //rounds.add(round2);
        //rounds.add(round3);
        //rounds.addLast(round4);

        //this.round1 = round1;
        //this.round2 = round2;
        //this.round3 = round3;
        //this.round4 = round4;

    }


    /**
     * calculates the points earned after a shooting round
     *
     * @return double earned points
     */


    public double pointsEarned() {
        //return this.round1.targetsHit + this.round2.targetsHit + this.round3.targetsHit + this.round4.targetsHit;
        int counter = 0; //counter for each ShootingRound in the LinkedList which starts at 0
        int counter3 = 0;

        for (ShootingRound around : rounds) {
            counter3 = counter3 + rounds.get(counter).targetsHit;
            counter++;

        }

        return counter3;
    }

    /**
     * calculates the penalties from a shooting round
     *
     * @return double penalty points
     */


//max score = 20
    public double getPenalties() {
        double multiplier = 20 - (pointsEarned());
        return multiplier * 60;
    }


    /**
     * Searches for the best shooting round based on whether the athlete is prone or standing
     *
     * @param standCheck boolean if they are prone or standing
     * @return the best round
     */
//using r for a round
//    public ShootingRound bestRoundByType(boolean standCheck) {
//        ShootingRound bestRound = null; // new shooting round to compare the rest to initialized as null
//
//        for (ShootingRound r : this.rounds) {
//            if (standCheck = r.isStanding ) {
//                if (r.targetsHit > targetsInit) {
//                    bestRound = r;
//                }
//            } else if (standCheck == false && r.isStanding == false){
//                if (r.targetsHit > targetsInit) {
//                    bestRound = r;
//                }
//            } else{
//                bestRound = null;
//            }
//
//        }
//        return bestRound;
//    }
//
//}

    //Returns the ShootingRound that is the best round for the shooter.
    public ShootingRound bestRoundByType(boolean standCheck) {

        ShootingRound bestRound = new ShootingRound(-99, false); //impossible to get


        int counter4 = 0;

        for (ShootingRound r : this.rounds) {

            if (bestRound.targetsHit < rounds.get(counter4).targetsHit && rounds.get(counter4).isStanding == standCheck) bestRound = rounds.get(counter4);
             else
                bestRound = bestRound;

            counter4++;
        }

        if (bestRound.targetsHit == -99)
            return null;

        else return bestRound;
    }
}





