package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class CloseParenthesesOperator extends Operator {
    @Override
    public int priority() {
        return 0;
    }

    @Override
    public Operand execute(Operand operandOne, Operand operandTwo) {
        return new Operand(0);
    }
}
