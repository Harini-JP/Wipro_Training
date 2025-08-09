package Day3;

class Productdetails {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Productdetails(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: ₹" + getTotalCost());
        System.out.println("------------------------");
    }
}

public class Product {
    public static void main(String[] args) {
        Productdetails[] items = new Productdetails[4];

        String[] names = {"Python Book", "Java Book", "Web Dev Book", "Full Stack Book"};
        double[] prices = {500.0, 400.0, 350.0, 600.0};
        int[] quantities = {2, 1, 3, 1};
        double totalBill = 0;

        for (int i = 0; i < items.length; i++) {
            items[i] = new Productdetails(names[i], prices[i], quantities[i]);
        }

        System.out.println("----- Bill Details -----");
        for (Productdetails item : items) {
            item.display();
            totalBill += item.getTotalCost();
        }

        System.out.println("Total Bill Amount: ₹" + totalBill);
    }
}
