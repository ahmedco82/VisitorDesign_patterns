package com.ahmedco.visitor;


public interface ItemElement{
    public int accept(ShoppingCartVisitor visitor);
}
