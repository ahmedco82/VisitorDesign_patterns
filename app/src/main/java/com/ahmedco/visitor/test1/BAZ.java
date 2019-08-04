package com.ahmedco.visitor.test1;

public class BAZ implements Base {

    public void execute(Base base) {
        base.doJob( this);
    }
    public void doJob(FOO foo) {
        System.out.println("FOO object was called from BAZ");
    }
    public void doJob(BAR bar) {
        System.out.println("BAR object was called from BAZ");
    }
    public void doJob(BAZ baz) {
        System.out.println("BAZ object calls by yourself");
    }
}
