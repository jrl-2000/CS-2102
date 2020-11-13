import java.util.LinkedList;

class DataSmooth2 {
    DataSmooth2(){

    }

    public LinkedList<Double> dataSmooth(LinkedList<Show> shows)
    {
        LinkedList<Double> runTime = new LinkedList<Double>();
        for (int i = 1; i < shows.get(i).episodes.size() -1; i++){
            runTime.add(i, (double) (shows.get(i).episodes.get(i).runTime));

        }

        return smoothEpisodes(runTime);
    }

    public double avg (double a, double b, double c){ // seperate function for the smoothing
        return (a + b + c) / 3.0;
    }

    public LinkedList<Double> smoothEpisodes (LinkedList<Double> runTimes) {
        LinkedList<Double> smoothMove = new LinkedList<Double>();
        smoothMove.add(runTimes.getFirst());
        for (int i = 1; i < runTimes.size(); i++) {
            smoothMove.add(i, avg(runTimes.get(i-1), runTimes.get(i), runTimes.get(i+1)));
        }
        smoothMove.addLast(runTimes.getLast());
        return  smoothMove;
    }






}