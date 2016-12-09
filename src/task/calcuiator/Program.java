package task.calcuiator;

import task.calcuiator.operation.Operation;

public class Program {

    private final int leftOperand;
    private final int rightOperand;
    private final Operation operation;

    public Program(int leftOperation, int rightOperation, Operation operation) {
        this.leftOperand = leftOperation;
        this.rightOperand = rightOperation;
        this.operation = operation;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public String getOperationSymbol() {
        return this.operation.getSymbol();
    }

    public double calculate() {
        return this.operation.calculate(this.leftOperand, this.rightOperand);
    }
}
