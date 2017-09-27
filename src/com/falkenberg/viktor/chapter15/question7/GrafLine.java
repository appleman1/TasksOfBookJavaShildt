package com.falkenberg.viktor.chapter15.question7;
/*<applet code="GrafLine" width="300" height="50">
</applet>*/
/*Среди языковых средств Java, предназначенных
мя отображения информации, имеется метод drawLine (). Метод определен
в классе Graphics и позволяет отобразить отрезок прямой линии между
двумя заданными точками с использованием текущего цвета. Используя метод
drawLine (), создайте аплет, отслеживающий перемещение мыши. Если кнопка
мыши нажата, аплет должен рисовать на экране сплошную линию до тех пор,
пока кнопка не будет отпущена.*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class GrafLine extends Applet implements MouseMotionListener {
    int mouseX1 = 0, mouseY1 = 0, mouseX2 = 0, mouseY2 = 0;

    public void init() {
        addMouseMotionListener(this);
    }

    public void start() {

    }

    public void stop() {

    }

    public void paint(Graphics graphics) {
        graphics.drawLine(mouseX1,mouseY1,mouseX2,mouseY2);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        mouseX2 = e.getX();
        mouseY2 = e.getY();
        showStatus(mouseX2 + " : " + mouseY2);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX1 = e.getX();
        mouseY1 = e.getY();


    }
}
