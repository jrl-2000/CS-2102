import java.util.LinkedList;

class Earthquake2 {
    Earthquake2(){}

    // checks whether a datum is a date
    boolean isDate(double anum) {
        return (int)anum > 10000000;
    }
    // extracts the month from an 8-digit date
    int extractMonth(double dateNum) {
        return ((int)dateNum % 10000) / 100;
    }

    public MaxHzReport calcMonth(LinkedList<Double> data, int index) {
        double thisDate = data.get(index);
        double temp = 0;
        for (int f = index + 1; f < data.size() && isDate(data.get(f)) == false; f++) { //maybe false
            if (data.get(f) > temp) {
                temp = data.get(f);
            }
        }
        MaxHzReport oct = new MaxHzReport(thisDate, temp);
        return oct;
    }

    public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {
        LinkedList<MaxHzReport> max = new LinkedList<MaxHzReport>();
        for (int i = 0; i < data.get(i); i++){
            if (extractMonth(data.get(i)) == month) {

                max.add(calcMonth(data, i));
            }
        }
        return max;
    }



}










