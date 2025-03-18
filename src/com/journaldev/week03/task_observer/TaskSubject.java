package com.journaldev.week03.task_observer;

public interface TaskSubject {
    void registerObserver(TaskObserver observer);
    void removeObserver(TaskObserver observer);
    void notifyObservers();
    String getUpdate(TaskObserver observer);
}

