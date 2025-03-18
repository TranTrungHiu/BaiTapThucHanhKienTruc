package com.journaldev.week03.task_observer;

public interface TaskObserver {
    void update();
    void setTaskSubject(TaskSubject task);
}
