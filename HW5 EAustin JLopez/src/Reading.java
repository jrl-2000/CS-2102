public class Reading {
    private Time time;
    private double temperature;
    private double rainfall;

    public Reading(Time time, double temperature, double rainfall) {
        this.time = time;
        this.temperature = temperature;
        this.rainfall = rainfall;
    }


    /**
     * Getter for the temperature
     * @return the temperature (double)
     */
    public double  getTemp() {
        return this.temperature;
    }

    /**
     * Getter for tje rainfall amount
     * @return the rainfall amount (double)
     */
    public double getRainfall() {
        return rainfall;
    }

}
