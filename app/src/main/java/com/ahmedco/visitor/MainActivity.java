package com.ahmedco.visitor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmedco.visitor.test1.BAR;
import com.ahmedco.visitor.test1.BAZ;
import com.ahmedco.visitor.test1.Base;
import com.ahmedco.visitor.test1.FOO;
import com.ahmedco.visitor.test2.City;
import com.ahmedco.visitor.test2.FirstTimeVisitor;

public class MainActivity extends AppCompatActivity {


    private static int calculatePrice(ItemElement[] items){
        //we’ll extract the algorithm which will be applied to the object structure
        // from the classes.
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();

        int sum = 0;
        for(ItemElement item:items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Test1();
        //Test2();
        Test3();
    }

    private void Test3(){
        //https://www.geeksforgeeks.org/visitor-design-pattern/
        ItemElement[] items = new ItemElement[]{
         new Book(20, "1234"),
         new Book(100, "5678"),
         new Fruit(10, 2, "Banana"),
         new Fruit(5, 5, "Apple")};
          //add new functionality to our code without modification of existing classes?
         int total = calculatePrice(items);
         System.out.println("Total Cost = "+total);
    }


    private void Test2(){
        /****
         * It is used when we have to perform an operation on
           a group of similar kind of Objects.
         */
        //https://www.programcreek.com/2011/05/visitor-design-pattern-example/
        // FirstTimeVisitor : it holds the algorithm we will apply to our elements
        FirstTimeVisitor visitor = new FirstTimeVisitor();
        City city = new City();
        city.accept(visitor);
    }


    private void Test1(){
        /**
        * Visitor is a behavioral design pattern that allows
        * adding new behaviors to existing class hierarchy without
        * altering any existing code.

        *Visitor design pattern enables one or more operations
        *to be used on a set of objects in run time,
        */
        Base objects[] = {new FOO() , new BAR() , new BAZ()};
        for (Base object:objects){
            for (int j = 0; j < 3; j++) {
                object.execute(objects[j]);
            }
            System.out.println();
        }
    }
}
