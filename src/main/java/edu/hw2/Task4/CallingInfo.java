package edu.hw2.Task4;

/*МОДИФИКАТОР ДОСТУПА ПО УМОЛЧАНИЮ был бы PACKAGE PRIVATE, но он нам не подходит, так как для
создания объектов класса, у нас должен быть не только public конструктор, но и public класс?*/

public record CallingInfo(String className, String methodName) {
}
//есть хорошие переопределенные методы get, PUBLIC конструктор только от 2х арг и вообще это final класс


