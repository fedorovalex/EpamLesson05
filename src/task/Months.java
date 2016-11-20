package task;

public enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    public Months next() {
        return Months.values()[(this.ordinal() + 1) % 12];
    }

    public int getAmountDays() {

        int amountDays = 0;

        switch (this) {
            case FEBRUARY:
                amountDays = 28;
                break;
            case APRIL:
            case JUNE:
            case JULY:
            case SEPTEMBER:
            case NOVEMBER:
                amountDays = 30;
                break;
            case JANUARY:
            case MARCH:
            case MAY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                amountDays = 31;
                break;
        }

        return amountDays;
    }
}
