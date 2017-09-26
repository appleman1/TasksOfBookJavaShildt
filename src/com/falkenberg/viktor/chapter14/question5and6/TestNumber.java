package com.falkenberg.viktor.chapter14.question5and6;

public interface TestNumber<T extends Number> {
    boolean test(T number);
}
