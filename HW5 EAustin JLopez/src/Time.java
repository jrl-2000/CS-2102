public class Time {
    private int minute;
    private int hour;

    public Time(int hour, int minute) {
        this.minute = minute;
        this.hour = hour;
    }

    /**
     * Getter for the minute
     * @return the minute (integer)
     */
    public int getMinute() {
        return this.minute;
    }

    /**
     * Getter for the hour
     * @return/ the hour (integer)
     */
    public int getHour() {
        return this.hour;
    }
}