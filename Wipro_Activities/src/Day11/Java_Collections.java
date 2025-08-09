package Day11;

import java.util.ArrayList;

public class Java_Collections {
    
    static class Department {
        private String name;
        private double sales;
        private double expenses;

        public Department(String name, double sales, double expenses) {
            this.name = name;
            this.sales = sales;
            this.expenses = expenses;
        }

        public double getProfit() {
            return sales - expenses;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        ArrayList<Department> depart = new ArrayList<>();

        depart.add(new Department("Sales", 20000, 15000));
        depart.add(new Department("Marketing", 3000, 2000));
        depart.add(new Department("Research", 25000, 20000));

        System.out.println("Profit by Department:");
        for (Department d : depart) {
            System.out.println(d.getName() + " Profit: " + d.getProfit());
        }

        // Sorting departments by profit in descending order
        depart.sort((d1, d2) -> Double.compare(d2.getProfit(), d1.getProfit()));

        System.out.println("\nDepartments sorted by highest profit:");
        for (Department d : depart) {
            System.out.println(d.getName() + " Profit: " + d.getProfit());
        }

        // Highest profit department
        Department highest = depart.get(0);
        System.out.println("\nHighest Profit Department: " + highest.getName() + " with Profit: " + highest.getProfit());
    }
}



