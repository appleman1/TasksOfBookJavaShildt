package com.falkenberg.viktor.chapter14.question5and6;

/*5. Составьте лямбда-выражение, которое возвращает значение true, если число
принадлежит к диапазону чисел 10-20, включая граничные значения.
6. Создайте функциональный интерфейс, способный поддерживать лямбда-выражение,
предложенное в п. 5. Вызовите интерфейс MyTest и его абстрактный метод
testing ().*/
public class Main {
    public static void main(String args[]){
        TestNumber<Integer> testNumber = n -> ((n >= 10)&( n <= 20));
        System.out.println(testNumber.test(15));
    }
}
