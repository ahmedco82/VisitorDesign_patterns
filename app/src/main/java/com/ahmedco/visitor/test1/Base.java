package com.ahmedco.visitor.test1;

public interface Base {
    void execute(Base target);
    void doJob(FOO target);
    void doJob(BAR target);
    void doJob(BAZ target);
}