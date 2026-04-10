


import java.util.Scanner;

class ThisDemo {
    // 1. An integer instance variable named 'value'
    int value;

    // 2. A method setValue(int value) that uses 'this' to distinguish 
    // the instance variable from the parameter.
    void setValue(int value) {
        this.value = value; 
    }

    // 3. A method display() to print the value.
    void display() {
        System.out.println("Value: " + this.value);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the integer input
        int input = sc.nextInt();

        // Create the ThisDemo object
        ThisDemo demo = new ThisDemo();

        // Set the value using the method
        demo.setValue(input);

        // Display the value
        demo.display();

        sc.close();
    }
}