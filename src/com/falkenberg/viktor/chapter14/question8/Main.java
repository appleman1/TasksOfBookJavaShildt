package com.falkenberg.viktor.chapter14.question8;

/*Создайте обобщенный функциональный интерфейс MyFunc<T>. Вызовите его абстрактный
метод func () . Метод func () должен принимать параметр типа т и возвращать
ссылку типа т. (Таким образом, интерфейс MyFunc должен представлять собой
обобщенную версию интерфейса NumericFunc, который рассматривался в этой главе.)
Продемонстрируйте его использование, переработав свое решение
для п. 7 таким образом, чтобы вместо интерфейса Num e ricFunc в нем использовался
интерфейс MyFunc<T>.*/
public class Main {
    public static void main(String args[]) {
        MyFunc<Integer> numericFunc = n -> {
            int fact = 1;
            if (n == 0)
                return fact;
            else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            }
            return fact;
        };
        System.out.println(numericFunc.func(0));
    }
}
