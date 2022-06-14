public class Date {
    //instance variables
    private String month;
    private int day;
    private int year;

    //constructor
    public Date(String month, int day, int year) {
        if (Validate(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            System.out.println("Invalid Input!!!");
            System.out.println("Please enter a valid date.");
        }
    }

    //methods
    public boolean Validate(String month, int day, int year) {
        boolean valid = true;
        enum Months {
            JANUARY(31),
            FEBRUARY(28),
            MARCH(31),
            APRIL(30),
            MAY(31),
            JUNE(30),
            JULY(31),
            AUGUST(31),
            SEPTEMBER(30),
            OCTOBER(31),
            NOVEMBER(30),
            DECEMBER(31);

            int numDays;

            Months (int numDays) {
                this.numDays = numDays;
            }
        }

        month = month.toUpperCase();

        if (year < 1000 || year > 9999) {
            valid = false;
            return valid;
        }

        if (year % 4 == 0 && year % 100 != 0) {
            Months.FEBRUARY.numDays = 29;
        }

        for (Months m : Months.values()) {
            if (m.name().equals(month)) {
                valid = true;
                break;
            } else {
                valid = false;
            }
        }

        return valid;
    }

    @Override
    public String toString() {
        return month + ", " + day + ", " + year;
    }
}
