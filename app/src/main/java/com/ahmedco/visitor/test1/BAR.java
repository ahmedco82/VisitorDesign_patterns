package com.ahmedco.visitor.test1;

public class BAR implements Base {

    public void execute(Base base) {
        base.doJob(this);
    }

    public void doJob(FOO foo) {
        System.out.println("FOO object was called from BAR" );
    }

    public void doJob(BAR bar) {
        System.out.println("BAR object calls by yourself");
    }

    public void doJob(BAZ baz) {
        System.out.println("BAZ object was called from BAR");
    }
}