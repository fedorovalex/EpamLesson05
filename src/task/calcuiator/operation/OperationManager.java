package task.calcuiator.operation;

import java.util.HashMap;
import java.util.Map;

public class OperationManager {

    public Operation findOperation(String id) {
        Operation operation;
        switch (id) {
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
                operation = null;
        }
        return operation;
    }

    public Map<String, String > getDescriptionOperation() {
        Map<String, String> descriptionOperation = new HashMap<>();
        descriptionOperation.put("mult", "умножение");
        descriptionOperation.put("div", "деление");
        descriptionOperation.put("sub", "вычитание");
        descriptionOperation.put("add", "сложение");
        return descriptionOperation;
    }
}
