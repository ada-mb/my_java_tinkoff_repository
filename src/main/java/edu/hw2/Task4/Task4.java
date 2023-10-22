package edu.hw2.Task4;

public class Task4 {
    private Task4() {}

    public static CallingInfo callingInfo(Throwable throwable) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        /*массив - стек вызовов методов, где нулевой эл - последний вызванный метод, последний эл -
         первый вызванный метод, который еще сохранен в стеке вызовов.*/
        String str = stackTrace[0].toString();
        //System.out.println("str == "+str);
        //строка формата <имя класса, откуда вызов>.<имя метода>(<имя файла.java>:<номер строки>)
        //на практике: "edu.hw2.Task4Test.CallingInfoTest.positive(CallingInfoTest.java:12)"
        str = str.substring(0, str.indexOf("("));
        int lastIndexOfPoint = str.lastIndexOf(".");
        String className = str.substring(0, lastIndexOfPoint);
        String methodName = str.substring(lastIndexOfPoint + 1, str.length());
        return new CallingInfo(className, methodName);
    }
}
