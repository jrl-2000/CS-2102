import java.util.LinkedList;

public class Competition {

    LinkedList<Athlete> athletes = new LinkedList<Athlete>();
    LinkedList<String> namesDNF = new LinkedList<String>();
    int shootingRound;

    public Competition(int shootingRound, LinkedList<Athlete> athletes) {
        this.shootingRound = shootingRound;
        this.athletes = athletes;


    }

    /**
     * finds the athletes in a list that havenb't completed their shooting rounds
     * @return the list of names of the athletes
     */

    public LinkedList<String> shootingDNF() {

        for (Athlete a : this.athletes) {
            if (this.shootingRound > a.aFinalResult.shootingResult.rounds.size()) {
                namesDNF.add(a.aName);
            }
        }
        return namesDNF;
    }


    /**
     * Searches for the final score for a given athlete name
     * @param searchName String for the name we are searching
     * @return double the score of that athlete
     */
    public double finalScoreForAthlete(String searchName) {
        for (Athlete b : this.athletes) {
            if (b.aName == searchName) {
                return b.aFinalResult.finalScore();

            }
        }
        return 0;
    }


    /**
     * calculates if there's any improvement
     *
     * @param aComp a Competition we are looking to see if an athlete did better in
     * @return boolean if they did better
     */
    public boolean anyImprovement(Competition aComp) {
        for (Athlete f : this.athletes) {
            for (Athlete g : aComp.athletes){
                if (f.aFinalResult.finalScore() > g.aFinalResult.finalScore()) {
                    return true;
                }
            }
        }
        return false;
    }
}
//13
//We are content with the way we've written both anyImprovemnt and finalScoreAthlete. They could be cleaned a little
// more and helper functions/methods can help with that process especially since the for loops in both functions are identical.
