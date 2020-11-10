import java.util.LinkedList;

class DataSmooth1 {

    LinkedList<Show> showsList;
    LinkedList<Double> runTime;

    DataSmooth1() {
        this.showsList = new LinkedList<Show>();
    }


    public LinkedList<Double> dataSmooth(LinkedList<Show> shows) {
        int counter = 0;
        double accum =0;
        for (Show thisShow : this.showsList) {
            accum = thisShow.episodes.get(counter).runTime + accum;



        }
        return null;
    }
}