package task.calcuiator;

import org.apache.commons.cli.*;
import task.calcuiator.exception.ParametersException;
import task.calcuiator.operation.*;

public class CmdLine {

    public Program parse(String[] args) throws ParseException, ParametersException {

        CommandLineParser cmdLinePosixParser = new PosixParser();
        CommandLine commandLine = cmdLinePosixParser.parse(setOptions(), args);

        if (!commandLine.hasOption("l")) {
            throw new ParametersException("Нет левого операнда.");
        }
        if (!commandLine.hasOption("r")) {
            throw new ParametersException("Нет правого операнда.");
        }
        if (!commandLine.hasOption("o")) {
            throw new ParametersException("Нет параметра операции.");
        }

        int left = Integer.parseInt(commandLine.getOptionValue("l"));
        int right = Integer.parseInt(commandLine.getOptionValue("r"));

        Operation operation;

        switch (commandLine.getOptionValue("o")) {
            case "mult":
                operation = new Multiplication();
                break;
            case "add":
                operation = new Addition();
                break;
            case "sub":
                operation = new Subtraction();
                break;
            case "div":
                operation = new Division();
                break;
            default:
                throw new ParametersException("Неизвестная операция.");
        }
        return new Program(left, right, operation);
    }

    private Options setOptions() {
        Option optionLeft = new Option("l", "left", true, "Left");
        Option optionRight = new Option("r", "right", true, "Right");
        Option optionOperation = new Option("o", "operation", true, "Operation");

        optionLeft.setArgs(1);
        optionRight.setArgs(1);
        optionOperation.setArgs(1);

        Options posixOptions = new Options();
        posixOptions.addOption(optionLeft);
        posixOptions.addOption(optionRight);
        posixOptions.addOption(optionOperation);

        return posixOptions;
    }
}
