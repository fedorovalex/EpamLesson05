package task;

import org.apache.commons.cli.*;

public class Calculator {

    public static void main(String[] args) throws ParseException {

        System.out.println(calculate(args));
    }

    public static String calculate(String[] args) throws ParseException {

        CommandLineParser cmdLinePosixParser = new PosixParser();
        CommandLine commandLine = cmdLinePosixParser.parse(setOptions(), args);

        if (!commandLine.hasOption("l")) {
            return "Нет левого операнда.";
        }
        if (!commandLine.hasOption("r")) {
            return "Нет правого операнда.";
        }
        if (!commandLine.hasOption("o")) {
            return "Нет параметра операции.";
        }

        int left = Integer.parseInt(commandLine.getOptionValue("l"));
        int right = Integer.parseInt(commandLine.getOptionValue("r"));
        String operation = commandLine.getOptionValue("o");

        String result = "";

        switch (operation) {
            case "mult":
                result = compileResultString(left, right, left * right, "*") ;
                break;
            case "add":
                result = compileResultString(left, right, left + right, "+") ;
                break;
            case "sub":
                result = compileResultString(left, right, left - right, "-") ;
                break;
            case "div":
                result = compileResultString(left, right, (double) left / right, "/") ;
                break;
        }
        return result;
    }

    private static String compileResultString(int left, int right, int result, String operation) {
        return left + " " + operation + " " + right + " = " +result;
    }
    private static String compileResultString(int left, int right, double result, String operation) {
        return left + " " + operation + " " + right + " = " +result;
    }

    private static Options setOptions() {
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
