package pr2;
interface print{
public abstract	void printday();
}
enum DayOfWeek implements print {
    SUNDAY(1) , MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
    private int dayNumber;
    DayOfWeek(int dayNumber) {
        this.dayNumber = dayNumber;
    }
    public int getDayNumber() {
        return this.dayNumber;
    }
    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }
    public String toString() {
        switch(this.dayNumber) {
        case 1:
            return "Sunday";
        case 2:
            return "Monday";
        case 3:
            return "Tuesday";
        case 4:
            return "Wednesday";
        case 5:
            return "Thursday";
        case 6:
            return "Friday";
        default:
            return "Saturday";
        }
    }
}

public class Day {
    DayOfWeek day;
    public Day(DayOfWeek day) {
        this.day = day;
    }

    public Day(int dayNumber) {
        this.day = DayOfWeek.SUNDAY;
        this.day.setDayNumber(dayNumber);
    }
    public DayOfWeek getDay() {
        return this.day;
    }

    public String toString() {
        return this.day.toString();
    }
}