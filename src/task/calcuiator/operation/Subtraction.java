package task.calcuiator.operation;

public class Subtraction implements Operation {
    @Override
    public double calculate(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }

    @Override
    public String toString() {
        return "-";
    }
}
