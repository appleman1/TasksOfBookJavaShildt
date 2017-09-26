package com.falkenberg.viktor.chapter14.question7;
/*7. Создайте блочное лямбда-выражение для вычисления факториала целого числа.
Продемонстрируйте его использование. В качестве функционального интерфейса
используйте интерфейс NumericFunc, который рассматривался в этой главе.*/
public class Main {
    public static void main(String args[]) {
        NumericFunc numericFunc = n -> {
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
