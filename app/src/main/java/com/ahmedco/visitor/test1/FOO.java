package com.ahmedco.visitor.test1;

public class FOO implements Base {

    public void execute(Base base) {

        base.doJob(this);
    }

    public void doJob(FOO foo) {
        System.out.println("FOO object calls by yourself");
    }

    public void doJob(BAR bar) {

        System.out.println("BAR object was called from FOO");
    }

    public void doJob(BAZ baz) {
        System.out.println("BAZ object was called from FOO");
    }
}