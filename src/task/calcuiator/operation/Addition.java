package task.calcuiator.operation;

public class Addition implements Operation {
    @Override
    public double calculate(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }

    @Override
    public String getSymbol() {
        return "+";
    }
}
