package test;

import org.junit.Assert;
import org.junit.Test;
import task.calcuiator.Program;
import task.calcuiator.operation.*;

import static java.lang.Math.abs;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProgramTest {
    @Test
    public void calculateTestOnMultiplication() {
        Program program = new Program(4, 5, new Multiplication());

        assertEquals(20, (int)program.calculate());
    }

    @Test
    public void calculateTestOnDivision() {
        Program program = new Program(5, 2, new Division());

        assertTrue(abs(2.5 - program.calculate()) < 0.0001);
    }

    @Test
    public void calculateTestOnAddition() {
        Program program = new Program(4, 5, new Addition());

        assertEquals(9, (int)program.calculate());
    }

    @Test
    public void calculateTestOnSubtraction() {
        Program program = new Program(4, 5, new Subtraction());

        assertEquals(-1, (int)program.calculate());
    }
}
