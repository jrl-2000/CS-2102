import java.util.GregorianCalendar;
import java.util.LinkedList;
public class Report implements IReport {
    private LinkedList<DailyWeatherReport> listOfReports;
    public Report() {
        this.listOfReports = new LinkedList<DailyWeatherReport>();
    }
    /**
     * adds a new DailyWeatherReport
     * @param date the date of the reading
     * @param reports the measurements the sensor makes for the day above
     */
    public void addToReport(GregorianCalendar date, LinkedList<Reading> reports) {
        LinkedList<Double> temps = new LinkedList<Double>();
        LinkedList<Double> rains = new LinkedList<Double>();
        for (int i = 0; i < reports.size(); i++) {
            temps.add(reports.get(i).getTemp());
            rains.add(reports.get(i).getRainfall());
        }
        listOfReports.add(new DailyWeatherReport(date, temps, rains));
    }
    /**
     * Calculates the average temperature for that month and year
     * @param month a month you want to calculate the average temperature
     * @param year a year you want to calculate the average temperature
     * @return a double which is the average temperature for that month and year
     */
    public double avgTempForMonth(int month, int year) {
        double sum1 = 0;
        double counter = 0;
        for (DailyWeatherReport checker : listOfReports) {
            if (checker.getDate().get(GregorianCalendar.MONTH) == month && checker.getDate().get(GregorianCalendar.YEAR) == year) {
                if (counter < listOfReports.size()){
                    sum1 =  sum1 + checker.avgTemp();
                    counter ++;
                }
            }
        }
        if (counter == 0){
            return sum1;
        } else {
            return sum1/counter;
        }
    }
    /**
     * Calculates the total rainfall for a specific month and year
     * @param month a month you want to calculate the total rainfall
     * @param year a year you want to calculate the the total rainfall
     * @return a double which is the total rainfall for that month and year
     */
    public double totalRainfallForMonth(int month, int year) {
        double sum2 = 0;
        double counter1 = 0;

        for (DailyWeatherReport checker : listOfReports) {
            if (checker.getDate().get(GregorianCalendar.MONTH) == month && checker.getDate().get(GregorianCalendar.YEAR) == year) {
                sum2 = sum2 + checker.totalRain();
                counter1++;
            }
        }
        if (counter1 == 0){
            return sum2;
        } else {
            return sum2/counter1;
        }
    }
    public void add(DailyWeatherReport aDWR) {
        listOfReports.add(aDWR);
    }
}