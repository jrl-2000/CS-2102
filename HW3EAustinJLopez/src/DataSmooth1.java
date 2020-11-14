import java.util.LinkedList;

class DataSmooth1 {

    double average;


    DataSmooth1() {
        this.average = average;
    }
    public LinkedList<Double> dataSmooth(LinkedList<Show> shows) {
        int counter1 = 0;
        LinkedList<Double> runTime = new LinkedList<Double>();
        for (Show s : shows) {
            if (counter1 == 0 || counter1 + 1 == shows.size()) {
                runTime.add(helper(s.episodes));
            }else {
                runTime.add((helper(shows.get(counter1 - 1).episodes)
                        + helper(shows.get(counter1).episodes) + helper(shows.get(counter1 + 1).episodes)) / 3.0);
            }
            counter1++;
        }
        return runTime;
    }
    double helper(LinkedList<Episode> episode) {
        average = 0;
        for (int i = 0; i < episode.size(); i++) {
            average = average + episode.get(i).runTime;
        }
        average = average / (episode.size());
        return average;
    }
}