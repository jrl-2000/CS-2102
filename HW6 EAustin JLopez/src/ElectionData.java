// Jonathan Lopez, Emily Austin
// CS 2102 Homework 6 B term 2020

import java.util.LinkedList;
import java.util.Scanner;
import java.util.HashMap;


class ElectionData {
//    LinkedList<String> ballot = new LinkedList<String>();
//    LinkedList<String> votes = new LinkedList<String>();
    Scanner keyboard = new Scanner(System.in);
    private HashMap<String, Integer> choiceOne = new HashMap<String, Integer>();
    private HashMap<String, Integer> choiceTwo = new HashMap<String, Integer>();
    private HashMap<String, Integer> choiceThree = new HashMap<String, Integer>();
    ElectionData() {
//        this.ballot.add("Gompei");
//        this.ballot.add("Husky");
    }

    /**
     * processes the vote for the 1st 2nd and 3rd choice
     * @param firstOne first candidate
     * @param secondOne second candidate
     * @param thirdOne third candidate
     */
    /**
     * processes the vote for the 1st 2nd and 3rd choice
     * @param firstOne first candidate
     * @param secondOne second candidate
     * @param thirdOne third candidate
     * @throws UnknownCandidateException when a unkown candidate appears
     * @throws DuplicateVotesException when a candidate appears twice
     */
    public void processVote(String firstOne, String secondOne, String thirdOne) throws UnknownCandidateException, DuplicateVotesException {
        LinkedList<String> candidateNames = new LinkedList<String>();
        candidateNames.add(firstOne);
        candidateNames.add(secondOne);
        candidateNames.add(thirdOne);
        for (String ballot: candidateNames){
            if (choiceOne.containsKey(ballot) == false) {
                throw new UnknownCandidateException(ballot);
            }
        }
        if (firstOne.equals(secondOne)) {
            throw new DuplicateVotesException(firstOne);
        }
        else if (firstOne.equals(thirdOne)) {
            throw new DuplicateVotesException(firstOne);
        }
        else if (secondOne.equals(thirdOne)) {
            throw new DuplicateVotesException(firstOne);
        }
        else {
            //update the votes
            choiceOne.replace(firstOne, (choiceOne.get(firstOne)+1));
            choiceTwo.replace(secondOne, (choiceTwo.get(secondOne)+1));
            choiceThree.replace(thirdOne, (choiceThree.get(thirdOne)+1));
        }
    }

    /**
     * adds a candidate to the hashmap
     * @param candidate
     * @throws CandidateExistsException when canddiate exist on the ballot already
     */
    public void addCandidate(String candidate) throws CandidateExistsException{
        if (choiceOne.containsKey(candidate) == false){
            choiceOne.put(candidate,0);
            choiceTwo.put(candidate,0);
            choiceThree.put(candidate,0);
        } else {
            throw new CandidateExistsException(candidate);
        }
    }

    /**
     * Finds the winner if they have more than 50% of the first place votes
     * @return the candidate that won
     */
    public String findWinnerMostFirstVotes(){
        double totalFirst = 0;
        double highestFirst = 0;
        boolean tied = false;
        String nameOne = "candidate";
        LinkedList<String> maps  = new LinkedList<String>(choiceOne.keySet());
        for (String ballot2: maps){
            totalFirst = totalFirst + choiceOne.get(ballot2);
            if (choiceOne.get(ballot2) == highestFirst){
                tied = true;
            }
            if (choiceOne.get(ballot2) > highestFirst){
                tied = false;
                highestFirst = choiceOne.get(ballot2);
                nameOne = ballot2;
            }
        }
        if (tied = false) {
            return nameOne;
        }
        if ((highestFirst/totalFirst) > 0.5) {
            return nameOne;
        }
        return "Runoff required";
    }

    /**
     * Finds the winner based on the following formula "three points for each first-place vote they received, two points for each second-place vote they received, and one point for each third-place vote they received."
     * @return the candidate that won
     */
    public String findWinnerMostPoints(){
        int largestPoints = 0;
        boolean tied2;
        String nameTwo = "canadate";
        LinkedList<String> maps2 = new LinkedList<String>(choiceOne.keySet());
        for (String ballot3: maps2){
            int counter =  0;
            counter = ((choiceOne.get(ballot3)*3)+ (choiceTwo.get(ballot3)*2) + (choiceThree.get(ballot3)));
            if (counter>largestPoints){
                largestPoints = counter;
                nameTwo = ballot3;
            }
        }
        return nameTwo;
    }

    /**
     * gets the ballot in a LinkedList of Strings
     * @return LL of strings
     */
    public LinkedList<String> getBallot(){
        return new LinkedList<String>(choiceOne.keySet());
    }



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

//delete this
//    public int countVotes(String forcand) {
//        int numvotes = 0;
//        for (String s : votes) {
//            if (s.equals(forcand))
//                numvotes = numvotes+1;
//        }
//        return numvotes;
//    }
}
