package com.falkenberg.viktor.chapter11;

/*Напишите программу, которая каждую секунду отображает на экране данные о времени,
прошедшем от начала сессии, а другой ее поток выводит сообщение каждые 5 секунд.
Предусмотрите возможность ежесекундного оповещения потока, воспроизводящего сообщение,
потоком, отсчитывающим время. Не внося изменений в код потока-"хронометра" ,
добавьте еще один поток, который выводит на экран другое сообщение каждые 7 секунд.
Предполагается использование методов wait(), notifyAll().*/
public class Main {
    static Integer i = 1;

    public static void main(String args[]) throws InterruptedException {

        synchronized (i) {
            Thread thread = new Thread(new Stopwatch(i), "thread1");
            Thread thread1 = new Thread(new MessageTest(i), "thread2");
            thread.start();
            thread1.start();
            thread.join();
            thread1.join();
            thread.interrupt();
            thread1.interrupt();
        }
    }
}
