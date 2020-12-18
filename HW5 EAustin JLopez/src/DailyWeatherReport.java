import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DailyWeatherReport {
    private GregorianCalendar date;
    private LinkedList<Double> temps;
    private LinkedList<Double> rainfalls;


    public DailyWeatherReport(GregorianCalendar date, LinkedList<Double> temps, LinkedList<Double> rainfalls) {
        this.date = date;
        this.temps = temps;
        this.rainfalls = rainfalls;
    }

    /**
     * Getter for the date
     * @return the date
     */
    public GregorianCalendar getDate() {
        return this.date;
    }

    /**
     * Adds all the elements in a Linked List of doubles
     *
     * @param doubles
     * @return a double with all the elements added up
     */
    public double addingAllElts(LinkedList<Double> doubles) {
        double sum = 0;
        for (int i = 0; i < doubles.size(); i++) {
            sum = sum + doubles.get(i);
        }
        return sum;
    }

    /**
     * Calculates the average temperature
     *
     * @return a double that is the average temperatur
     */
    public double avgTemp() {
        double size = temps.size();
        return addingAllElts(temps) / size;

    }

    /**
     * Calculates the total rainfall
     *
     * @return a double that is the total rainfall
     */
    public double totalRain() {
        return addingAllElts(rainfalls);
    }
}