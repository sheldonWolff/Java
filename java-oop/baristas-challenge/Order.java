import java.util.ArrayList;

public class Order{

        // class Attributes
        private String name;
        private boolean ready;
        private ArrayList<Item> items = new ArrayList<Item>(); 

        // class constructors
        public Order() {
            this.name = "Guest";
        }
        public Order(String name) {
            this.name = name;
        }

        // class methods
        public void addItem(Item item) {
            this.items.add(item);
        }
        public void getStatusMessage() {
            if(isReady() == true) {
                System.out.println("Your order is ready.");
            }
            else {
                System.out.println("Thank you for waiting. Your order will be ready soon.");
            }
        }
        public double getOrderTotal() {
        double total = 0;
        for (Item b : this.items) {
            total += b.getPrice();
        }
        return total;
        }
        public ArrayList<Item> display() {
        System.out.printf("Customer name: %s \n", this.name);
        for (Item b : this.items) {
            b.itemDetails();
        }
        System.out.printf("Order total : %.2f \n", this.getOrderTotal());
        return items;
        }
        // class methods (getters & setters)
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public boolean isReady() {
            return ready;
        }
        public void setReady(boolean ready) {
            this.ready = ready;
        }
        public ArrayList<Item> getItems() {
            // System.out.println(Item.getName());
            return items;
        }
        public void setItems(ArrayList<Item> items) {
            this.items = items;
        }
    }