package task.calcuiator.operation;

public interface Operation {
    double calculate(int leftOperand, int rightOperand);

    @Override
    String toString();
}
