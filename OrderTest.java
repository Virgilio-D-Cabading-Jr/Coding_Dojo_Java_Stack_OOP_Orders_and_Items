import java.util.ArrayList;

import javax.print.attribute.standard.PrinterInfo;

//  ////////////////////////////////////////////////////////////////
//  ORDER TEST
//  By: Virgilio D. Cabading Jr.    Created at: November 29, 2021 1115
//  ////////////////////////////////////////////////////////////////

public class OrderTest {
    public static void main(String[] args) {
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("ORDER TEST APP\n");
    
        System.out.println("*****************************************************");
        System.out.println("Menu Items\n");
        Item item1 = new Item("mocha", (double) 3);
        Item item2 = new Item("latte", (double) 3.5);
        Item item3 = new Item("drip coffee", (double) 1.5);
        Item item4 = new Item("capuccino", (double) 3.75);
        
        System.out.printf("Item: %s | price: $%.2f\n", item1.getName(), item1.getPrice());
        System.out.printf("Item: %s | price: $%.2f\n", item2.getName(), item2.getPrice());
        System.out.printf("Item: %s | price: $%.2f\n", item3.getName(), item3.getPrice());
        System.out.printf("Item: %s | price: $%.2f\n", item4.getName(), item4.getPrice());
        System.out.println("");

        // Order variables -- order1, order2 etc.
    
        // Application Simulations
        // Use this example code to test various orders' updates

        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        System.out.println("*****************************************************");
        System.out.println("Start 4 orders\n");
        System.out.println(order1.getOrder());
        System.out.println(order2.getOrder());
        System.out.println(order3.getOrder());
        System.out.println(order4.getOrder());
        System.out.println("");

        System.out.println("*****************************************************");
        System.out.println("Jimmy orders a mocha\n");
        order2.addItem(item1);
        System.out.println(order2.getOrder());
        System.out.println("");

        System.out.println("*****************************************************");
        System.out.println("Noah orders a capuccino\n");
        order3.addItem(item4);
        System.out.println(order3.getOrder() + "\n");

        System.out.println("*****************************************************");
        System.out.println("Sam orders a latte\n");
        order4.addItem(item2);
        System.out.println(order4.getOrder() + "\n");

        System.out.println("*****************************************************");
        System.out.println("Cindhuri's order is now ready\n");
        order1.setReady(true);
        System.out.println(order1.getOrder() + "\n");

        System.out.println("*****************************************************");
        System.out.println("Sam orders two more lattes\n");
        order4.addItem(item2);
        order4.addItem(item2);
        System.out.println(order4.getOrder() + "\n");

        System.out.println("*****************************************************");
        System.out.println("Jimmy's order is now ready\n");
        order2.setReady(true);
        System.out.println(order2.getOrder() + "\n");
    }
}

