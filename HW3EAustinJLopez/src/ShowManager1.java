import java.util.LinkedList;

class ShowManager1 {



    ShowManager1() {
    }


    /**
     * searches through a list of shows and sorts them into 3 lists depending on the broadcast time and if it's not special
     * @param shows a list of shows
     * @return the summary of the report which has 3 lists
     */
    public ShowSummary organizeShows(LinkedList<Show> shows)
    {
        LinkedList<Show> daytime = new LinkedList<Show>();
        LinkedList<Show> primetime = new LinkedList<Show>();
        LinkedList<Show> latenight = new LinkedList<Show>();
        for(Show aShow : shows) {
            if (600 <= aShow.broadcastTime && aShow.broadcastTime < 1700 && aShow.isSpecial == false) {
                daytime.add(aShow);
            } else if (1700 <= aShow.broadcastTime && aShow.broadcastTime < 2200  && aShow.isSpecial == false) {
                primetime.add(aShow);
            }else if (2200 <= aShow.broadcastTime && aShow.broadcastTime < 2400 || 0 <= aShow.broadcastTime && aShow.broadcastTime < 100 && aShow.isSpecial == false) {
                latenight.add(aShow);
            }
        }
        return new ShowSummary(daytime, primetime, latenight);
    }

}
