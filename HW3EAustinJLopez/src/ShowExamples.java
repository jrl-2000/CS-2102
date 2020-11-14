import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Arrays;

public class ShowExamples
{
    ShowManager1 sm1 = new ShowManager1();
    LinkedList<Show> shows = new LinkedList<Show>();
    ShowSummary report1 = new ShowSummary();

    ShowManager1 sm2 = new ShowManager1();
    LinkedList<Show> shows1 = new LinkedList<Show>();
    ShowSummary report3 = new ShowSummary();

    ShowManager1 sm3 = new ShowManager1();
    LinkedList<Show> shows2 = new LinkedList<Show>();
    ShowSummary report5 = new ShowSummary();

    public ShowExamples()
    {
        LinkedList<Episode> eps1 = new LinkedList<Episode>();
        eps1.add(new Episode("Best of Both Worlds", 88));
        eps1.add(new Episode("The Ultimate Computer", 49));
        eps1.add(new Episode("Trials and Tribble-ations", 43));
        Show s1 = new Show("Star Trek", 1800, eps1, false);
        shows.add(s1);
        report1.primetime.add(s1);


        LinkedList<Episode> eps2 = new LinkedList<Episode>();
        eps2.add(new Episode("Fear of a Bot Planet", 23));
        eps2.add(new Episode("The Why of Fry", 21));
        eps2.add(new Episode("Roswell that Ends Well", 23));
        eps2.add(new Episode("Meanwhile", 22));
        Show s2 = new Show("Futurama", 1900, eps2, false);
        shows.add(s2);
        report1.primetime.add(s2);

        LinkedList<Episode> eps3 = new LinkedList<Episode>();
        eps3.add(new Episode("Yakko's World", 4));
        eps3.add(new Episode("Hello Nice Warners", 8));
        eps3.add(new Episode("Where Rodents Dare", 9));
        Show s3 = new Show("Animaniacs", 1630, eps3, false);
        shows.add(s3);
        report1.daytime.add(s3);

        LinkedList<Episode> eps4 = new LinkedList<Episode>();
        eps4.add(new Episode("The Letter W", 59));
        eps4.add(new Episode("The Letter P", 57));
        eps4.add(new Episode("The Letter I", 58));
        Show s4 = new Show("Sesame Street", 900, eps4, false);
        shows.add(s4);
        report1.daytime.add(s4);

        //_______________________________

        LinkedList<Episode> eps5 = new LinkedList<Episode>();
        eps5.add(new Episode("Best of Both Worlds", 88));
        eps5.add(new Episode("The Ultimate Computer", 49));
        eps5.add(new Episode("Trials and Tribble-ations", 43));
        Show s5 = new Show("Star Trek", 1800, eps5, true);
        shows1.add(s5);
        //report3.primetime.add(s5);


        LinkedList<Episode> eps6 = new LinkedList<Episode>();
        eps6.add(new Episode("Fear of a Bot Planet", 23));
        eps6.add(new Episode("The Why of Fry", 21));
        eps6.add(new Episode("Roswell that Ends Well", 23));
        eps6.add(new Episode("Meanwhile", 22));
        Show s6 = new Show("Futurama", 1900, eps6, false);
        shows1.add(s6);
        report3.primetime.add(s6);

        LinkedList<Episode> eps7 = new LinkedList<Episode>();
        eps7.add(new Episode("Yakko's World", 4));
        eps7.add(new Episode("Hello Nice Warners", 8));
        eps7.add(new Episode("Where Rodents Dare", 9));
        Show s7 = new Show("Animaniacs", 1630, eps7, false);
        shows1.add(s7);
        report3.daytime.add(s7);

        LinkedList<Episode> eps8 = new LinkedList<Episode>();
        eps8.add(new Episode("The Letter W", 59));
        eps8.add(new Episode("The Letter P", 57));
        eps8.add(new Episode("The Letter I", 58));
        Show s8 = new Show("Sesame Street", 900, eps8, false);
        shows1.add(s8);
        report3.daytime.add(s8);



        //--------------

        LinkedList<Episode> eps9 = new LinkedList<Episode>();
        eps9.add(new Episode("Best of Both Worlds", 88));
        eps9.add(new Episode("The Ultimate Computer", 49));
        eps9.add(new Episode("Trials and Tribble-ations", 43));
        Show s9 = new Show("Star Trek", 1800, eps9, true);
        shows2.add(s9);
        //report3.primetime.add(s5);


        LinkedList<Episode> eps10 = new LinkedList<Episode>();
        eps10.add(new Episode("Fear of a Bot Planet", 23));
        eps10.add(new Episode("The Why of Fry", 21));
        eps10.add(new Episode("Roswell that Ends Well", 23));
        eps10.add(new Episode("Meanwhile", 22));
        Show s10 = new Show("Futurama", 1900, eps10, true);
        shows2.add(s10);
        //report3.primetime.add(s10);

        LinkedList<Episode> eps11 = new LinkedList<Episode>();
        eps11.add(new Episode("Yakko's World", 4));
        eps11.add(new Episode("Hello Nice Warners", 8));
        eps11.add(new Episode("Where Rodents Dare", 9));
        Show s11 = new Show("Animaniacs", 1630, eps11, true);
        shows2.add(s11);
        //report3.daytime.add(s11);

        LinkedList<Episode> eps12 = new LinkedList<Episode>();
        eps12.add(new Episode("The Letter W", 59));
        eps12.add(new Episode("The Letter P", 57));
        eps12.add(new Episode("The Letter I", 58));
        Show s12 = new Show("Sesame Street", 900, eps12, true);
        shows2.add(s12);
        //report3.daytime.add(s12);

    }

    @Test
    public void instructorTestOrganizeShows()
    {
        ShowSummary report2 = sm1.organizeShows(shows);
        assertEquals(report1, report2);
    }

    @Test
    public void instructorTestOrganizeShows2()
    {
        ShowSummary report4 = sm2.organizeShows(shows1);
        assertEquals(report3, report4);
    }
    //empty
    @Test
    public void instructorTestOrganizeShows3()
    {
        ShowSummary report6 = sm3.organizeShows(shows2);
        assertEquals(report5, report6);
    }

}
//Problem 1 sub tasks
//gonna take in a list of shows and gonna sort by broadcastTime and isSpecial
//make a for loop and a nested if statement and test the broadcast time and isSpecial in the same if statement with &&
//for (list has next


// 2nd way to do it would require a helper function for either the special or daytime list
// in my case we decided to make a helper function for the filtering of the special shows.
// then intake that list for the sorting of the broadcast times in organizeShows
