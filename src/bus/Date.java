package bus;

import java.io.Serializable;

public class Date implements Serializable{
    private static final long serialVersionUID = 3358439940798024536L;
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
        super();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws MyException{
        Validation.validDay(day);
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws MyException{
        Validation.validMonth(month);
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws MyException{
        Validation.validYear(year);
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
