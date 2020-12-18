import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {
    // method to set up a ballot and cast votes

    ElectionData Setup1 () {

        ElectionData ED = new ElectionData();

        // put candidates on the ballot
        try {

            ED.addCandidate("gompei");
            ED.addCandidate("husky");
            ED.addCandidate("ziggy");

        } catch (Exception e) {}

        // cast votes

        try {

            ED.processVote("gompei", "husky", "ziggy");
            ED.processVote("gompei", "ziggy", "husky");
            ED.processVote("husky", "gompei", "ziggy");

        } catch (Exception e) {}

        return(ED);

    }

    // now run a test on a specific election
    // winner (not close)
    @Test
    public void testMostFirstWinner () {
        assertEquals ("gompei", Setup1().findWinnerMostFirstVotes());
    }
    // winner points (not close)
    @Test
    public void testMostPointsWinner () {
        assertEquals ("gompei", Setup1().findWinnerMostPoints());
    }

    ElectionData Setup2 () {

        ElectionData ED2 = new ElectionData();

        // put candidates on the ballot
        try {

            ED2.addCandidate("Jon");
            ED2.addCandidate("Emily");
            ED2.addCandidate("Cuneo");

        } catch (Exception e) {}

        // cast votes

        try {

            ED2.processVote("Emily", "Cuneo", "Jon");
            ED2.processVote("Emily", "Cuneo", "Jon");
            ED2.processVote("Emily", "Cuneo", "Cuneo");
            ED2.processVote("Cuneo", "Emily", "Jon");
            ED2.processVote("Cuneo", "Emily", "Jon");
            ED2.processVote("Cuneo", "Emily", "Jon");

        } catch (Exception e) {}

        return(ED2);

    }

    // now run a test on a specific election
    //tie
    @Test
    public void testMostFirstWinner2 () {
        assertEquals ("Runoff required", Setup2().findWinnerMostFirstVotes());
    }
    // winner tied Emily
    @Test
    public void testMostPointsWinner2 () {
        assertEquals ("Emily", Setup2().findWinnerMostPoints());
    }

    ElectionData Setup3 () {

        ElectionData ED3 = new ElectionData();

        // put candidates on the ballot
        try {

            ED3.addCandidate("Jon");
            ED3.addCandidate("Emily");
            ED3.addCandidate("Cuneo");

        } catch (Exception e) {}

        // cast votes

        try {

            ED3.processVote("Emily", "Emily", "Jon");
            ED3.processVote("Emily", "Cuneo", "Jon");
            ED3.processVote("Emily", "Jon", "Cuneo");
            ED3.processVote("Cuneo", "Emily", "Jon");
            ED3.processVote("Cuneo", "Emily", "Jon");
            ED3.processVote("Cuneo", "Emily", "Jon");

        } catch (Exception e) {}

        return(ED3);
    }

    @Test(expected=DuplicateVotesException.class)
    public void testSampleMethod() throws DuplicateVotesException, UnknownCandidateException
    {
        Setup3().processVote("Emily", "Emily", "Jon");
        //myObject.sampleMethod(sampleArgument);
    }
    @Test(expected=UnknownCandidateException.class)
    public void testSampleMethod1() throws DuplicateVotesException, UnknownCandidateException
    {
        Setup3().processVote("Emily", "Doroz", "Jon");
        //myObject.sampleMethod(sampleArgument);
    }
    @Test(expected=DuplicateVotesException.class)
    public void testSampleMethod2() throws DuplicateVotesException, UnknownCandidateException
    {
        Setup3().processVote("Jon", "Emily", "Jon");
        //myObject.sampleMethod(sampleArgument);
    }
    @Test(expected=UnknownCandidateException.class)
    public void testSampleMethod3() throws DuplicateVotesException, UnknownCandidateException
    {
        Setup3().processVote("Smith", "Doroz", "Hamel");
        //myObject.sampleMethod(sampleArgument);
    }
    @Test(expected=CandidateExistsException.class)
    public void testSampleMethod4() throws CandidateExistsException
    {
        Setup3().addCandidate("Cuneo");
        //myObject.sampleMethod(sampleArgument);
    }
    @Test(expected=CandidateExistsException.class)
    public void testSampleMethod5() throws CandidateExistsException
    {
        Setup3().addCandidate("Emily");
        //myObject.sampleMethod(sampleArgument);
    }
    @Test(expected=CandidateExistsException.class)
    public void testSampleMethod6() throws CandidateExistsException
    {
        Setup3().addCandidate("Jon");
        //myObject.sampleMethod(sampleArgument);
    }
}
//    @Test(expected=SampleException.class)
//    public void testSampleMethod() throws SampleException
//    {
//        myObject.sampleMethod(sampleArgument);
//    }
