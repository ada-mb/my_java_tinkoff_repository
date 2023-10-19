package edu.hw2.Task1;

public record Exponent(Expr expr, double x) implements Expr {
    //переопределила конструктор, чтобы не хранить объекты типа 1/(0^y)
    public Exponent(Expr expr, double x) {
        if (x < 0 && expr.evaluate() == 0) {
            throw new IllegalArgumentException();
        } else {
            this.expr = expr;
            this.x = x;
        }
    }

    public double evaluate() {
        return Math.pow(expr.evaluate(), x);
    }
}
