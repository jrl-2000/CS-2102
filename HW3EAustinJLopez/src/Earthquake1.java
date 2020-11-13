import java.util.LinkedList;

class Earthquake1 {
    Earthquake1(){}

    // checks whether a datum is a date
    boolean isDate(double anum) {
        return (int)anum > 10000000;
    }
    // extracts the month from an 8-digit date
    int extractMonth(double dateNum) {

        return ((int)dateNum % 10000) / 100;
    }

    public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {
        LinkedList<MaxHzReport> max = new LinkedList<MaxHzReport>();
        for (int i = 0; i < data.get(i); i++){
            if (extractMonth(data.get(i)) == month) {
                double thisDate = data.get(i);
                double temp = 0;
                for (int f = i+1; f < data.size() && isDate(data.get(f)) == false; f++){ //maybe false
                    if (data.get(f) > temp){
                        temp = data.get(f);
                    }
                }
                MaxHzReport oct = new MaxHzReport(thisDate, temp);
                max.add(oct);
            }
        }
        return max;
    }
}

