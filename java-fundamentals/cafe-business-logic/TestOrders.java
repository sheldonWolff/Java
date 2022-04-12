import java.util.ArrayList;
public class TestOrders {
        public static void main(String[] args) {




// Menu items
                Item item1 = new Item();
                item1.name = "Drip Coffee";
                item1.price = 1.50;

                Item item2 = new Item();
                item2.name = "Cappuccino";
                item2.price = 4.25;

                Item item3 = new Item();
                item3.name = "Latte";
                item3.price = 3.50;

                Item item4 = new Item();
                item4.name = "Mocha";
                item4.price = 3.50;
                // Order variables -- order1, order2 etc.
                Order order1 = new Order();
                order1.name = "Cindhuri";
                order1.total = 1.50;
                order1.ready = false;
                order1.items.add(item1);
                order1.ready = true;

                Order order2 = new Order();
                order2.name = "Jimmy";
                order2.total = 3.50;
                order2.ready = false;
                order2.items.add(item3);
                order2.items.add(item1);
                order2.total += item1.price;
                order2.ready = true;

                Order order3 = new Order();
                order3.name = "Noah";
                order3.total = 3.50;
                order3.ready = false;
                order3.items.add(item4);
                order3.items.add(item2);
                order3.total += item2.price;

                Order order4 = new Order();
                order4.name = "Sam";
                order4.total = 4.25;
                order4.ready = false;
                order4.items.add(item2);
                order4.items.add(item3);
                order4.total += item3.price;
                order4.items.add(item3);
                order4.total += item3.price;
                order4.items.add(item3);
                order4.total += item3.price;
                // Application Simulations
                // Use this example code to test various orders' updates
                System.out.printf("Name: %s\n", order1.name);
                System.out.printf("Total: %s\n", order1.total);
                System.out.printf("Ready: %s\n", order1.ready);
                System.out.println(order2.total);
                System.out.println(order3.total);
                System.out.println(order1.ready);
                System.out.println(order2.ready);
                System.out.println(order4.total);
        }
}