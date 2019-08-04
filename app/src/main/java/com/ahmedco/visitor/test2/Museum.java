package com.ahmedco.visitor.test2;

public class Museum implements Element {

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Museum is accepting visitor.");
        visitor.visit(this);
    }

}
