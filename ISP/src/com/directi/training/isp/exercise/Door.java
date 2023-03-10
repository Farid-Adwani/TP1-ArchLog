package com.directi.training.isp.exercice;

public interface Door
{
    void lock();

    void unlock();

    void open();

    void close();

    void timeOutCallback();

    void proximityCallback();
}
