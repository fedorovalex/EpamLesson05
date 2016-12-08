package task.calcuiator.operation;

public class Multiplication implements Operation {
    @Override
    public double calculate(int leftOperand, int rightOperand) {
        return leftOperand * rightOperand;
    }

    @Override
    public String toString() {
        return "*";
    }
}
