/* ==========================================================
   OOP Lab Task - 3
   Name: Bibi Sakina 
   Roll no : 2260051
   GitHub ID: sakina77sayed-debug
   
    Description:
   1. Class Multiply is created with a method multiply(int a, int b) that returns a * b.
   2. A second method named multiply is added that takes three integers and returns their product (method overloading).
   3. In the main method, multiply(2, 3) and multiply(2, 3, 4) are called and printed.
   ========================================================== */

class Multiply {
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class Main {
    public static void main(String[] args) {
        Multiply m = new Multiply();
        System.out.println(m.multiply(2, 3));
        System.out.println(m.multiply(2, 3, 4));
    }
}
