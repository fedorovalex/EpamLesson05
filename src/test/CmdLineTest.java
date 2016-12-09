package test;


import org.apache.commons.cli.ParseException;
import org.junit.Test;
import task.calcuiator.CmdLine;
import task.calcuiator.Program;
import task.calcuiator.exception.ParametersException;
import task.calcuiator.operation.Addition;

import static org.junit.Assert.assertTrue;

public class CmdLineTest {
    @Test
    public void parseTest() {
        try {
            CmdLine cmdLine = new CmdLine();
            Program program = cmdLine.parse(new String[]{"-l", "5", "-r", "2", "-o", "add"});
            Program expectation = new Program(5, 2, new Addition());
            assertTrue(equalsProgram(program, expectation));
        }
        catch (ParseException | ParametersException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean equalsProgram(Program first, Program second) {
        if (first.getLeftOperand() != second.getLeftOperand()) {
            return false;
        }
        if (first.getRightOperand() != second.getRightOperand()) {
            return false;
        }
        if (!first.getOperationSymbol().equals(second.getOperationSymbol())) {
            return false;
        }
        return true;
    }
}
