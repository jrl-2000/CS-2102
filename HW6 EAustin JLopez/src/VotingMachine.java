import java.util.Scanner;
public class VotingMachine {
    Scanner keyboard = new Scanner(System.in);
    ElectionData eData;
    VotingMachine(){
        eData = new ElectionData();
    }

    /**
     * Prints the  ballot to the console so the voter can know how this program is structured
     */
    public void printBallot() {
        System.out.println("The candidates are");
        System.out.println(eData.getBallot());
    }

    /**
     * put up the choices respectively after the voter votes for their first, second, and third choices.
     */
    public void screen() {
        this.printBallot();
        System.out.println("Who do you want to vote for? (1st choice)");
        String candidateFirst = keyboard.next();
        System.out.println("Vote counted for " + candidateFirst);
        System.out.println("Who do you want to vote for? (2nd choice)");
        String candidateSecond = keyboard.next();
        System.out.println("Vote counted for " + candidateSecond);
        System.out.println("Who do you want to vote for? (3rd choice)");
        String candidateThird = keyboard.next();
        System.out.println("Vote counted for " + candidateThird);
        try {
            eData.processVote(candidateFirst, candidateSecond, candidateThird);
        }
        catch (UnknownCandidateException e){
            System.out.println("Candidate not found. Do you want to add a write in? Type y or Y for yes");
            String writeInYes = keyboard.next();
            if (writeInYes == "y" || writeInYes == "Y"){
                System.out.println("Enter the name of your write in candidate");
                String addC = keyboard.next();
                addWriteIn(addC);
            }
            this.screen();
        }
        catch (DuplicateVotesException e){
            System.out.println("You can't vote for the same candidate twice");
            this.screen();
        }
    }

    /**
     * adds a write in vote to the ballot
     * @param toAdd the candidate to add
     */
    public void addWriteIn(String toAdd) {
        try {
            eData.addCandidate(toAdd);
            System.out.println("Candidate was add successfully");
        }
        catch (CandidateExistsException e){
            System.out.println("Candidate exists already");
        }
    }
}
//from the starter file

//    public void printBallot() {
//        System.out.println("The candidates are ");
//        for (String s : ballot) {
//            System.out.println(s);
//        }
//    }
//    public void screen() {
//        this.printBallot();
//        System.out.println("Who do you want to vote for?");
//        String candidate = keyboard.next();
//        //votes.add(candidate);
//        System.out.println("You voted for " + candidate);
//    }
