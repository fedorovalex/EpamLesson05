package task.calcuiator;


import task.calcuiator.operation.OperationManager;

import java.util.Map;

public class Helper {
    private Helper() {

    }
    public static String getHelp() {
        OperationManager operationManager = new OperationManager();
        Map<String, String> descriptionOperation =  operationManager.getDescriptionOperation();
        String help = "Нужно указать параметры для калькулятора:\n" +
                "-l 'левый операнд' (целое число)\n" +
                "-r 'правый операнд' (целое число)\n" +
                "-o 'операция'\n" +
                "\nДопустимые операции:\n";
        for (String key : descriptionOperation.keySet())
        {
            help += "'" + key + "' - " + descriptionOperation.get(key) + ".\n";
        }

        help += "\nПример: '-l 5 -r 2 -o add'.";
        return help;
    }
}
