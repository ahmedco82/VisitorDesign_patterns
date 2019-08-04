package com.ahmedco.visitor.test2;

import java.util.ArrayList;

public class City implements Element {

    ArrayList<Element> places = new ArrayList<Element>();

    public City() {
        places.add(new Museum());
        places.add(new Park());
    }

    @Override  // (new FirstTimeVistor )
    public void accept(Visitor visitor){
        System.out.println("City is accepting visitor.");
        visitor.visit(this);
        for (Element e:places) {
            e.accept(visitor);
        }
    }
}
