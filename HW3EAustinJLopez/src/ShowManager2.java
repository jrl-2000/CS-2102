import java.util.LinkedList;

class ShowManager2 {



    ShowManager2() {

    }

    /**
     * searches a linked list to see if the shows a special
     * @return a linked list with non special shows
     */
    public LinkedList<Show> isItSpecial(LinkedList<Show> shows){
        LinkedList<Show> intermediate = new LinkedList<Show>();
        for(Show thisShow : shows) {
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
        LinkedList<Show> showsList = new LinkedList<Show>();
        LinkedList<Show> daytime = new LinkedList<Show>();
        LinkedList<Show> primetime = new LinkedList<Show>();
        LinkedList<Show> latenight= new LinkedList<Show>();

        for (Show thisShow: shows){
            if (600 <= thisShow.broadcastTime && thisShow.broadcastTime < 1700){
                daytime.add(thisShow);
            } else if (1700 <= thisShow.broadcastTime && thisShow.broadcastTime < 2200) {
                primetime.add(thisShow);
            } else if (2200 <= thisShow.broadcastTime && thisShow.broadcastTime < 2400 || 0 <= thisShow.broadcastTime && thisShow.broadcastTime < 100) {
                latenight.add(thisShow);
            }
        }
        return new ShowSummary(daytime, primetime, latenight);
    }
}
