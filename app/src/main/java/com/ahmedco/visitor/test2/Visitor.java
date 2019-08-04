package com.ahmedco.visitor.test2;

public interface Visitor {
    public void visit(City city);
    public void visit(Museum museum);
    public void visit(Park park);
}