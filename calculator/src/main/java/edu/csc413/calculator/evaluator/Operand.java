package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
    int token;
    /**
     * construct operand from string token.
     */
    public Operand(String token) {
        this.token = Integer.parseInt(token);
    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        this.token = token;

    }

    /**
     * return value of operand
     */
    public int getValue() {

        return token;
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        if(token == null) return false;
        try{
            int d = Integer.parseInt(token);
        }catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }
}
