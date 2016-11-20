package task;

import org.apache.commons.cli.*;

public class Calculator {

    private static int left;
    private static int right;
    private static String operation;

    public static void main(String[] args) throws ParseException {
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

        CommandLineParser cmdLinePosixParser = new PosixParser();
        CommandLine commandLine = cmdLinePosixParser.parse(posixOptions, args);

        if (commandLine.hasOption("l")) {
            left = Integer.parseInt(commandLine.getOptionValue("l"));
        }
        if (commandLine.hasOption("r")) {
            right = Integer.parseInt(commandLine.getOptionValue("r"));
        }
        if (commandLine.hasOption("o")) {
            operation = commandLine.getOptionValue("o");
        }
        double result = 0;
        switch (operation) {
            case "mult":
                result = left * right;
                break;
            case "add":
                result = left + right;
                break;
            case "sub":
                result = left - right;
                break;
            case "div":
                result = (double) left / right;
                break;
        }
        System.out.println(left + " " + operation + " " + right + " = " +result);
    }
}
