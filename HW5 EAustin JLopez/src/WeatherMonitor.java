//CS 2102 B 2020
// Emily Austin
//Jonathan Lopez
//Homework 5: Encapsulation
//Due 12/2/2020 8AM
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {
    private IReport monitor;

    public WeatherMonitor(IReport monitor){
        this.monitor = monitor;

}
    /**
     * Calculates the average temperature for that month and year
     * @param month a month you want to calculate the average temperature
     * @param year a year you want to calculate the average temperature
     * @return a double which is the average temperature for that month and year
     */

    public double averageTempForMonth(int month, int year) {
        double avgTempWM =  monitor.avgTempForMonth(month, year);
        return avgTempWM;

    }

    /**
     * Calculates the total rainfall for a specific month and year
     * @param month a month you want to calculate the total rainfall
     * @param year a year you want to calculate the the total rainfall
     * @return a double which is the total rainfall for that month and year
     */

    public double totalRainfallForMonth(int month, int year) {
        double totalRainfallWM = monitor.totalRainfallForMonth(month, year);
        return totalRainfallWM;

    }

    /**
     * adds a new DailyWeatherReport
     * @param day the day of the reading
     * @param reports the measurements the sensor makes for the day above
     */
    public void addDailyReport (GregorianCalendar day, LinkedList<Reading> reports){
        monitor.addToReport(day, reports);
    }
}
