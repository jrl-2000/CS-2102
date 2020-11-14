import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class EarthquakeExamples {
    Earthquake1 E1 = new Earthquake1();
    LinkedList<Double> noData = new LinkedList<Double>();
    LinkedList<Double> threeDates = new LinkedList<Double>();
    LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
    LinkedList<MaxHzReport> OctReports = new LinkedList<MaxHzReport>();

    Earthquake1 E2 = new Earthquake1();
    LinkedList<Double> noData1 = new LinkedList<Double>();
    LinkedList<Double> threeDates1 = new LinkedList<Double>();
    LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();
    LinkedList<MaxHzReport> DecReports1 = new LinkedList<MaxHzReport>();

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
        OctReports.add(new MaxHzReport(20151013.0,10.0));
        OctReports.add(new MaxHzReport(20151020.0,50.0));

        threeDates1.add(20151113.0);
        threeDates1.add(10.0);
        threeDates1.add(5.0);
        threeDates1.add(20151120.0);
        threeDates1.add(40.0);
        threeDates1.add(50.0);
        threeDates1.add(45.0);
        threeDates1.add(20151201.0);
        threeDates1.add(6.0);
        DecReports.add(new MaxHzReport(20151201.0,6.0));


    }

    @Test
    public void instructorTestEQ() {
        assertEquals(NovReports,
                E1.dailyMaxForMonth(threeDates, 11));
    }
    //December
    @Test
    public void instructorTestEQ1() {
        assertEquals(DecReports,
                E2.dailyMaxForMonth(threeDates1, 12));
    }
    //2 dates in October
    @Test
    public void instructorTestEQ3() {
        assertEquals(OctReports,
                E1.dailyMaxForMonth(threeDates, 10));
    }
    //empty test
    @Test
    public void instructorTestEQ4() {
        assertEquals(DecReports1,
                E1.dailyMaxForMonth(threeDates, 12));
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

// a good place for a helper to handle the rest of the dates first
// made a new function and made it take in i (index) and the data list of doubles
//it returns a MaxHzReport and is called in the adding of a new MaxHzReport to the empty Linked list we made earlier
// and returns that list

