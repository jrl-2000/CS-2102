import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface IReport {
    //adds a new DailyWeatherReport
    public void addToReport(GregorianCalendar date, LinkedList<Reading> reports);

    //Calculates the average temperature for that month and year
    public double avgTempForMonth(int month, int year);

    //Calculates the total rainfall for a specific month and year
    public double totalRainfallForMonth(int month, int year);
}