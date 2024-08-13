package com.driver;


public class Main {

    // Task 1: Create a class Product inside Main class
    public class Product {

        // Task 3: Create a method product(int x, int y)
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method product(int x, int y, int z)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create an overloaded method product(double x, double y)
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create an object of Product in Main function called p
        Main mainInstance = new Main();
        Product p = mainInstance.new Product();

        // Call the methods from Main using the Product class object p
    p.product(2, 4);        // Task 3: Call the first method, Output: 8
     p.product(2, 4, 6);     // Task 4: Call the second method, Output: 48
        p.product(2.5, 4.6);    // Task 5: Call the third method, Output: 11.5
    }
}
