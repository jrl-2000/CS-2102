import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class DataSmoothExamples
{
    LinkedList<Show> shows = new LinkedList<Show>();
    LinkedList<Double> showResults = new LinkedList<Double>();
    DataSmooth1 D1 = new DataSmooth1();

    public DataSmoothExamples()
    {
        LinkedList<Episode> eps1 = new LinkedList<Episode>();
        eps1.add(new Episode("Best of Both Worlds", 88));
        eps1.add(new Episode("The Ultimate Computer", 49));
        eps1.add(new Episode("Trials and Tribble-ations", 43));
        shows.add(new Show("Star Trek", 1800, eps1, false));

        LinkedList<Episode> eps2 = new LinkedList<Episode>();
        eps2.add(new Episode("Fear of a Bot Planet", 23));
        eps2.add(new Episode("The Why of Fry", 21));
        eps2.add(new Episode("Roswell that Ends Well", 23));
        eps2.add(new Episode("Meanwhile", 22));
        shows.add(new Show("Futurama", 1900, eps2, false));

        LinkedList<Episode> eps3 = new LinkedList<Episode>();
        eps3.add(new Episode("Yakko's World", 4));
        eps3.add(new Episode("Hello Nice Warners", 8));
        eps3.add(new Episode("Where Rodents Dare", 9));
        shows.add(new Show("Animaniacs", 1630, eps3, false));

        LinkedList<Episode> eps4 = new LinkedList<Episode>();
        eps4.add(new Episode("The Letter W", 59));
        eps4.add(new Episode("The Letter P", 57));
        eps4.add(new Episode("The Letter I", 58));
        shows.add(new Show("Sesame Street", 900, eps4, false));

        showResults.add(60.0);
        showResults.add(29.75);
        showResults.add(29.08333);
        showResults.add(58.0);
    }

    @Test
    public void instructorTestDS()
    {
        LinkedList<Double> runtimes = D1.dataSmooth(shows);

        for(int i = 0; i < runtimes.size(); i++)
        {
            assertEquals(runtimes.get(i), showResults.get(i), .01);
        }
    }

}
//Problem 2:
// took in a list  of shows and made a new linked list of doubles
//added the 0th term in the list since it doesn't get any manipulation by the smoothing of data
//traversing through the list we added the terms before and after and divided by 3 for the average
//then add the last term because it doesn't get any manipulation by the smoothing of data
//return the list runTime


//2nd Way:
// we split up the 1st way into different functions
//first make the dataSmooth function which makes a new double Linked Lists and puts all the runTimes in it and calls the other function in the return statement
// make an averaging function that takes in 3 double and divides them by 3
//and make  the main helper by traversing the new linked list of doubles calling the avg function when getting the before and after terms in the list
// it also adds the first term and the last term because they doesn't get any manipulation by the smoothing of data
// call this function in the return statement in dataSmooth
//
