import java.util.LinkedList;

class ShowManager2 {

    LinkedList<Show> showsList;
    LinkedList<Show> daytime;
    LinkedList<Show> primetime;
    LinkedList<Show> latenight;
    LinkedList<Show> intermediate;

    ShowManager2() {
        this.showsList = new LinkedList<Show>();
        this.daytime = new LinkedList<Show>();
        this.primetime = new LinkedList<Show>();
        this.latenight = new LinkedList<Show>();
        this.intermediate = new LinkedList<Show>();
    }

    /**
     * searches a linked list to see if the shows a special
     * @return a linked list with non special shows
     */
    public LinkedList<Show> isItSpecial(){
        for(Show thisShow : this.showsList) {
            if ( thisShow.isSpecial == false) {
                intermediate.addLast(thisShow);
            }
        }
        return intermediate;
    }

    /**
     * searches a already filtered linked list and sorts it into 3 lists based on broadcast time
     * @param shows a list of shows
     * @return ShowSummary report which has 3 lists
     */

    public ShowSummary organizeShows(LinkedList<Show> shows)
    {
        for (Show thisShow: intermediate){
            if (600 <= thisShow.broadcastTime && thisShow.broadcastTime < 1700){
                daytime.add(thisShow);
            } else if (1700 <= thisShow.broadcastTime && thisShow.broadcastTime < 2200) {
                primetime.add(thisShow);
            } else if (2200 <= thisShow.broadcastTime && thisShow.broadcastTime < 2400 && 0 <= thisShow.broadcastTime && thisShow.broadcastTime < 100) {
                latenight.add(thisShow);
            }
        }
        return new ShowSummary(daytime, primetime, latenight);
    }
}
