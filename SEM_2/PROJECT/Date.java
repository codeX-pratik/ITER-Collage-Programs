package PROJECT;

public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day , int month , int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //setter
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //getter
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public String getDate() {
        return (day + "-" + month + "-" + year);
    }

}
