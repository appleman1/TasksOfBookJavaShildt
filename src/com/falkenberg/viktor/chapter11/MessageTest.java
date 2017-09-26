package com.falkenberg.viktor.chapter11;

public class MessageTest implements Runnable {
    int i;


    public MessageTest(int i) {
        this.i = i;
    }

    synchronized void useMessageTest(int i) throws InterruptedException {
        while (!Thread.currentThread().isInterrupted()) {
            if ((i % 5 == 0)&&(i / 5 > 0)) {
                System.out.println("Test!");
                System.out.println(i++);
                Stopwatch.startStopwath = true;
                this.notify();
            }
            this.wait();

        }

    }

    @Override
    public void run() {
        try {
            useMessageTest(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
