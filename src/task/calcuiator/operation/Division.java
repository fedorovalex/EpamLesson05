package task.calcuiator.operation;

public class Division implements Operation {
    @Override
    public double calculate(int leftOperand, int rightOperand) {
        return (double) leftOperand / rightOperand;
    }

    @Override
    public String toString() {
        return "/";
    }
}
