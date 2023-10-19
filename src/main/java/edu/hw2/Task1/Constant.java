package edu.hw2.Task1;

public record Constant(double x) implements Expr {
    public double evaluate() {
        return this.x;
    }
}
/*
record всегда final, его поля указаны в скобках(которые тоже final соотв), еще он неявно делает след методы:
1) конструктор от аргументов для всех полей (и только он)
2) getterы для всех полей
3) 'корректно' переопределяет equals, hashcode, toString
*/
