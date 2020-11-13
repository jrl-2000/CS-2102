import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class EarthquakeExamples {
    Earthquake1 E1 = new Earthquake1();
    LinkedList<Double> noData = new LinkedList<Double>();
    LinkedList<Double> threeDates = new LinkedList<Double>();
    LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();

    public EarthquakeExamples() {
        threeDates.add(20151013.0);
        threeDates.add(10.0);
        threeDates.add(5.0);
        threeDates.add(20151020.0);
        threeDates.add(40.0);
        threeDates.add(50.0);
        threeDates.add(45.0);
        threeDates.add(20151101.0);
        threeDates.add(6.0);
        NovReports.add(new MaxHzReport(20151101.0,6.0));
    }

    @Test
    public void instructorTestEQ() {
        assertEquals(NovReports,
                E1.dailyMaxForMonth(threeDates, 11));
    }

}


//Problem 3
// take in a list od data and a desired month and make a new Linked list for the reports
//traversing through the list we need to find the month, call to extractMonth
//save that data/ date (8 digit number)
//also initialize temp to 0 to compare the rest of the smaller data numbers
// go through the list again except at 1 index ahead b/c of the date we saw earlier. we also don't want to run into another date
// call to isDate
//then find the largest value with a nested if statement
//replacing temp with the bigger number on that date
//fill in the MaxHzReport and add it to the list
//return the listr of MaxHzReports "max"


//2nd way
//split up the first into a helper function
// a good place to split was after the first if statement
// made a new function and made it take in i (index) and the data list of doubles
//it returns a MaxHzReport and is called in the adding of a new MaxHzReport to the empty Linked list we made earlier
// and returns that list

