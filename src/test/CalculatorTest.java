package test;


import org.apache.commons.cli.ParseException;
import org.junit.Test;
import task.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void calculateTestOnAddition() {
        try {
            String result = Calculator.calculate(new String[]{"-l", "5", "-r", "2", "-o", "add"});
            assertEquals(result, "5 + 2 = 7");
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void calculateTestOnSubtraction() {
        try {
            String result = Calculator.calculate(new String[]{"-l", "5", "-r", "2", "-o", "sub"});
            assertEquals(result, "5 - 2 = 3");
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void calculateTestOnMultiplication() {
        try {
            String result = Calculator.calculate(new String[]{"-l", "5", "-r", "2", "-o", "mult"});
            assertEquals(result, "5 * 2 = 10");
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void calculateTestOnDivision() {
        try {
            String result = Calculator.calculate(new String[]{"-l", "5", "-r", "2", "-o", "div"});
            assertEquals(result, "5 / 2 = 2.5");
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
