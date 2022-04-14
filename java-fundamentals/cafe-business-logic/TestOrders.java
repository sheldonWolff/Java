import java.util.ArrayList;
public class TestOrders {
        public static void main(String[] args) {




// Menu items
                Item item1 = new Item("Drip Coffee", 1.50);

                Item item2 = new Item("Cappuccino", 4.25);

                Item item3 = new Item("Latte", 3.50);

                Item item4 = new Item("Mocha", 3.50);
                // Order variables -- order1, order2 etc.
                Order order1 = new Order();
                order1.addItem(item1);
                order1.addItem(item2);
                order1.display();
                order1.setReady(true);
                order1.getStatusMessage();

                Order order2 = new Order();
                order2.addItem(item3);
                order2.addItem(item4);
                order2.display();
                order2.setReady(true);
                order2.getStatusMessage();


                Order order3 = new Order("Sheldon");
                order3.addItem(item1);
                order3.addItem(item4);
                order3.display();
                order3.getStatusMessage();

                Order order4 = new Order("Merci");
                order4.addItem(item2);
                order4.addItem(item3);
                order4.display();
                order4.getStatusMessage();

                Order order5 = new Order("Superman");
                order5.addItem(item1);
                order5.addItem(item2);
                order5.addItem(item3);
                order5.addItem(item4);
                order5.display();
                order5.getStatusMessage();
        }
}