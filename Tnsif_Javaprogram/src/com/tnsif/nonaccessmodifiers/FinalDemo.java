package com.tnsif.nonaccessmodifiers;

final class FinalDemo {

    final int Max = 100;

    final void display() {
        System.out.println("Show the value of Max: " + Max);
    }

    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        fd.display();

        // This line is invalid and should be removed:
        // fd.Max = 200; // Error: Cannot assign a value to final variable 'Max'
    }
}




