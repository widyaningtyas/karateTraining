package org.example;

//Overloading
//Polymorphism static
class Operation {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b){
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }
}

//Overriding
class MultiplyOverride extends Operation {
    @Override
    public int add (int a, int b) {
        return a*b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Operation op = new Operation();
        MultiplyOverride mulOv = new MultiplyOverride();

        int result1 = op.add(5, 10);
        double result2 = op.add(2.5, 3.5);
        int result3 = op.add(5, 10, 15);
        int result4 = mulOv.add(5, 10);

        System.out.println("Operation (5, 10): " + result1);
        System.out.println("Operation (2.5, 3.5): " + result2);
        System.out.println("Operation (5, 10, 15): " + result3);
        System.out.println("Operation (5,10): " + result4);

        try {
            int result = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Error aritmatic : " + e.getMessage() );
        }

        try {
            int[] arr = new int[5];
            int index = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error array : " + e.getMessage() );
        }

        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("Error null : " + e.getMessage() );
        }

        try {
            String str = "Hello";
            char a = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error null : " + e.getMessage() );
        }

        try {
            Thread t = new Thread();
            t.start();
            t.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("Error Thread State : " + e.getMessage() );
        }
    }
}
