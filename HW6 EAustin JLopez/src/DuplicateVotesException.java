class DuplicateVotesException extends Exception{
    private String candidate;
    DuplicateVotesException(String candidate){
        this.candidate = candidate;
    }
    /**
     * getter for the constructor
     * @return the candidate
     */
    public String getCandidate() {
        return this.getCandidate();
    }
}
