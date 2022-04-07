import java.util.ArrayList;

public class CafeUtil {

    public Integer getStreakGoal() {
        int numWeeks = 10;
        int i = 1;
        int sum = 0;
        while(i <= numWeeks)
        {
            
            sum += i;
            i++;
        }
        return sum;
    }
    public Double getOrderTotal(double[] prices) {
        double total = 0;
        for (double lineItems : prices) {
            total+=lineItems;
        }
        return total;
    }
    public Object displayMenu(ArrayList<String>menuItems) {
        for (int b = 0; b < menuItems.size(); b++) {
            System.out.printf("%s %s \n", b, menuItems.get(b));
        }
        return menuItems;
    }
    public Object addCustomer(ArrayList<String>customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.printf("There are %s people ahead of you \n", customers.size());
        customers.add(userName);
        System.out.println(customers);
        return customers;
    }
}