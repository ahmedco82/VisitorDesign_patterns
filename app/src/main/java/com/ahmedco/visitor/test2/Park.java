package com.ahmedco.visitor.test2;

public class Park implements Element {

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Park is accepting visitor.");
        visitor.visit(this);
    }
}