import java.util.LinkedList;

class ShowManager1 {


    LinkedList<Show> showsList;
    LinkedList<Show> daytime;
    LinkedList<Show> primetime;
    LinkedList<Show> latenight;

    ShowManager1() {
        this.showsList = new LinkedList<Show>();
        this.daytime = new LinkedList<Show>();
        this.primetime = new LinkedList<Show>();
        this.latenight = new LinkedList<Show>();
    }


    /**
     * searches through a list of shows and sorts them into 3 lists depending on the broadcast time and if it's not special
     * @param shows a list of shows
     * @return the summary of the report which has 3 lists
     */
    public ShowSummary organizeShows(LinkedList<Show> shows)
    {
        for(Show thisShow : this.showsList) {
            if (600 <= thisShow.broadcastTime && thisShow.broadcastTime < 1700 && thisShow.isSpecial == false) {
                daytime.add(thisShow);
            } else if (1700 <= thisShow.broadcastTime && thisShow.broadcastTime < 2200  && thisShow.isSpecial == false) {
                primetime.add(thisShow);
            }else if (2200 <= thisShow.broadcastTime && thisShow.broadcastTime < 2400 && 0 <= thisShow.broadcastTime && thisShow.broadcastTime < 100 && thisShow.isSpecial == false) {
                latenight.add(thisShow);
            }
        }
        return new ShowSummary(daytime, primetime, latenight);
    }

}
