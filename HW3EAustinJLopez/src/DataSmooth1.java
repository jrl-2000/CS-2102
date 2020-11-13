import java.util.LinkedList;

class DataSmooth1 {
    DataSmooth1() {
    }
    /**
     * smooths out the data for the run time of a show in a list
     * @param shows a list of shows
     * @return the runTime smoothed out list
     */
    public LinkedList<Double> dataSmooth(LinkedList<Show> shows) {

        LinkedList<Double> runTime = new LinkedList<Double>();
        //use of a index for loop
        runTime.add(0, (double) (shows.get(0).episodes.get(0).runTime));
        for (int i = 1; i < shows.get(i).episodes.size() -1; i++) {

            runTime.add(i, (double) (shows.get(i-1).episodes.get(i-1).runTime + shows.get(i).episodes.get(i).runTime + shows.get(i+1).episodes.get(i+1).runTime) / 3.0);
            }
        runTime.addLast((double) shows.getLast().episodes.getLast().runTime);
        return runTime;
    }
}

