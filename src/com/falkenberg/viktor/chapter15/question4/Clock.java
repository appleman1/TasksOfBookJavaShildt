package com.falkenberg.viktor.chapter15.question4;
/*<applet code="Clock" width="300" height="50">
</applet>*/
/*Создайте аплет, который отображает текущее
время, обновляя содержимое окна каждую секунду. Для того чтобы справиться
с этим заданием, вам придется провести дополнительное исследование. Вот
подсказка: получить текущее время можно, воспользовавшись объектом класса
Calendar, входящего в пакет java. util. (Напомним, что компания Oracle предоставляет
онлайновую документацию по всем стандартным классам Java.) Приобретенных
вами к этому моменту знаний должно быть достаточно для того, чтобы
самостоятельно изучить класс Calendar и использовать ero методы для выполнения
задания.*/
import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class Clock extends Applet implements Runnable {
    Date date;
    Thread thread;
    boolean stopFlag;

    public void init() {
        thread = null;
    }

    public void start() {
        thread = new Thread(this);
        stopFlag = false;
        thread.start();
    }
    public void stop(){
        stopFlag = true;
        thread = null;
    }
    public void paint(Graphics graphics){
        date = new Date();
        String hours = String.valueOf(date.getHours());
        String minutes = String.valueOf(date.getMinutes());
        String seconds = String.valueOf(date.getSeconds());
        graphics.drawString(hours+" : "+ minutes +" : "+ seconds, 50, 30);
    }

    @Override
    public void run() {
        while (true){
            try{
                repaint();
                Thread.sleep(1000);
                if (stopFlag)
                    break;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
