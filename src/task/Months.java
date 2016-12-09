package task;

import java.time.LocalDate;

public enum Months {
    JANUARY(31),
    FEBRUARY(28){
        @Override
        public int getAmountDays(int year) {
            LocalDate localDate = LocalDate.ofYearDay(year, 1);
            if (localDate.isLeapYear()) {
                return super.amountDays + 1;
            }
            return super.amountDays;
        }
    },
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(30),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int amountDays;

    private Months(int amountDays) {
        this.amountDays = amountDays;
    }

    public Months next() {
        return Months.values()[(this.ordinal() + 1) % Months.values().length];
    }

    public int getAmountDays(int year) {
        return this.amountDays;
    }
}
