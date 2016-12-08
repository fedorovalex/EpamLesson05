package task.calcuiator;


public class Helper {
    private Helper() {

    }
    public static String getHelp() {
        String help = "Нужно указать параметры для калькулятора:\n" +
                "-l 'левый операнд' (целое число)\n" +
                "-r 'правый операнд' (целое число)\n" +
                "-o 'операция'\n" +
                "\n Допустимые операции:\n" +
                "'mult' - умножение\n" +
                "'div' - деление\n" +
                "'add' - сложение\n" +
                "'sub' - вычитание.\n" +
                "\nПример: '-l 5 -r 2 -o add'.";
        return help;
    }
}
