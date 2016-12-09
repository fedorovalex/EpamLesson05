package task.calcuiator;

import org.apache.commons.cli.ParseException;
import task.calcuiator.exception.ParametersException;

public class Calculator {

    public static void main(String[] args) {

        CmdLine cmdLine = new CmdLine();
        try {
            Program program = cmdLine.parse(args);
            String result = program.getLeftOperand() + program.getOperationSymbol() +
                    program.getRightOperand() + " = " + program.calculate();

            System.out.println(result);
        }
        catch (ParseException | ParametersException e) {
            System.out.println(e.getMessage());
            System.out.println(Helper.getHelp());
        }
        catch (Exception e) {
            System.out.println(Helper.getHelp());
        }
    }
}
