import static org.junit.Assert.*;
import org.junit.Test;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Examples {


    WeatherMonitor rpt1;
    WeatherMonitor rpt2;
    LinkedList<Reading> reading1 = new LinkedList<Reading>();
    LinkedList<Reading> reading2 = new LinkedList<Reading>();

    LinkedList<Double> temps1 = new LinkedList<Double>();
    LinkedList<Double> rains1 = new LinkedList<Double>();
    LinkedList<Double> temps2 = new LinkedList<Double>();
    LinkedList<Double> rains2 = new LinkedList<Double>();


    public Examples() {
        //temps for date 1
        double t1 = 74.0;
        double t2 = 42.0;
        double t3 = 15.0;
        double t4 = 69.0;
        temps1.add(t1);
        temps1.add(t2);
        temps1.add(t3);
        temps1.add(t4);

        //rainfall for date 1
        double rf1 = 1.2;
        double rf2 = 7.5;
        double rf3 = 6.9;
        double rf4 = 4.2;
        rains1.add(rf1);
        rains1.add(rf2);
        rains1.add(rf3);
        rains1.add(rf4);

        // Times for Readings 1
        Time time1 = new Time(16, 20);
        Time time2 = new Time(13, 37);
        Time time3 = new Time(11, 11);
        Time time4 = new Time(3, 14);

        // Reading1

        Reading read1 = new Reading(time1, t1, rf1);
        Reading read2 = new Reading(time2, t2, rf2);
        Reading read3 = new Reading(time3, t3, rf3);
        Reading read4 = new Reading(time4, t4, rf4);
        reading1.add(read1);
        reading1.add(read2);
        reading1.add(read3);
        reading1.add(read4);


        //__________________________________________________________


        //temps for date 2
        double t21 = 13.0;
        double t22 = 37.0;
        double t23 = 61.0;
        double t24 = 89.0;
        temps2.add(t21);
        temps2.add(t22);
        temps2.add(t23);
        temps2.add(t24);
        //rainfall for date 2
        double rf21 = 5.3;
        double rf22 = 2.4;
        double rf23 = 7.9;
        double rf24 = 1.3;
        rains2.add(rf21);
        rains2.add(rf22);
        rains2.add(rf23);
        rains2.add(rf24);


        Time time21 = new Time(16, 20);
        Time time22 = new Time(13, 37);
        Time time23 = new Time(11, 11);
        Time time24 = new Time(3, 14);

        // Reading2

        Reading read21 = new Reading(time21, t21, rf21);
        Reading read22 = new Reading(time22, t22, rf22);
        Reading read23 = new Reading(time23, t23, rf23);
        Reading read24 = new Reading(time24, t24, rf24);
        reading2.add(read21);
        reading2.add(read22);
        reading2.add(read23);
        reading2.add(read24);


        GregorianCalendar date1 = new GregorianCalendar(2016, 11, 11);
        GregorianCalendar date2 = new GregorianCalendar(2016, 9, 17);



        DailyWeatherReport dwrSameNum = new DailyWeatherReport(date1, temps1, rains1);
        DailyWeatherReport normal = new DailyWeatherReport(date2, temps2, rains2);

        IReport report1 = new Report();
        report1.addToReport(date1, reading1);
        report1.addToReport(date2, reading2);



        rpt1 = new WeatherMonitor(report1);
//        rpt2 = new WeatherMonitor(report2);
    }

// noraml test
        @Test
    public void testNormaAvg(){
        assertEquals(50.0, rpt1.averageTempForMonth(11, 2016), .1);
    }
    // test the 2nd element in the report
    @Test
    public void testNormaAvg1(){
        assertEquals(50.0, rpt1.averageTempForMonth(9, 2016), .1);

    }
// no month matching
    @Test
    public void testNoMonth(){
        assertEquals(0.0, rpt1.averageTempForMonth(0, 1337), .1);

    }
// not a valid month
    @Test
    public void testNotAValidMonth(){
        assertEquals(0.0, rpt1.averageTempForMonth(12, 1337), .1);

    }
// not year matching
    @Test
    public void testNoYear(){
        assertEquals(0.0, rpt1.averageTempForMonth(11, 2015), .1);

    }


//not a valid year
    @Test
    public void testNotAValidYear(){
        assertEquals(0.0, rpt1.averageTempForMonth(12, -1337), .1);

    }


//_____________________________________________________________________________________________________________
    //total Rainfall tests


// normal total test
    @Test
    public void testTotal(){
        assertEquals(19.8, rpt1.totalRainfallForMonth(11, 2016), .1);
    }
    //tests the 2nd element in the report
    @Test
    public void testTotal2(){
        assertEquals(16.9, rpt1.totalRainfallForMonth(9, 2016), .1);
    }

    // no month matching
    @Test
    public void testNoMonthtotal(){
        assertEquals(0.0, rpt1.totalRainfallForMonth(10, 2016), .1);
    }
    // not a valid month
    @Test
    public void testTotalNotAMonth(){
        assertEquals(0.0, rpt1.totalRainfallForMonth(12, 2016), .1);
    }
    // no year matching
    @Test
    public void testTotalNoYear(){
        assertEquals(0.0, rpt1.totalRainfallForMonth(11, 2016), .1);
    }

    // not a valid year
    @Test
    public void testTotalNotAYear(){
        assertEquals(0.0, rpt1.totalRainfallForMonth(12, 0000), .1);
    }

}

