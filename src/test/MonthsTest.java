package test;

import org.junit.Test;
import task.Months;

import static org.junit.Assert.*;

public class MonthsTest {

    @Test
    public void nextTestOnMiddleValue() {
        Months months = Months.APRIL;
        assertEquals(months.next(), Months.MAY);
    }

    @Test
    public void nextTestOnExtremeValue() {
        Months months = Months.DECEMBER;
        assertEquals(months.next(), Months.JANUARY);
    }

    @Test
    public void getAmountDaysTestOnAmountDaysInApril() {
        Months months = Months.APRIL;
        assertEquals(months.getAmountDays(2016), 30);
    }

    @Test
    public void getAmountDaysTestOnAmountDaysInFebruary() {
        assertEquals(Months.FEBRUARY.getAmountDays(2012), 29);
    }
}