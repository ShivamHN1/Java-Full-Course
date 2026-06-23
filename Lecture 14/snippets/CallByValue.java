// Call by Value Implementation in Java
// In Java, all primitive data types (like int, float, etc.) are passed by value. This means that when you pass a primitive variable to a method, a copy of the variable's value is made. Any changes made to the parameter inside the method do not affect the original variable outside the method. This is known as "call by value" in Java.


public class CallByValue {
    public static void main(String[] args){
        // Initializing two integer variables a and b.
        int a = 5;
        int b = 9;

        // Printing the values of a and b before calling the addTen method.
        System.out.println("Before: a = " + a + ", b = " + b);
        
        addTen(a, b);
        // What this does is it creates copies of the values of a and b and passes those copies to the addTen method. Inside the addTen method, we are modifying the copies of a and b, not the original variables. Therefore, the changes made inside addTen do not affect the original variables a and b in main().

        // Printing the values of a and b after calling the addTen method.
        System.out.println("After: a = " + a + ", b = " + b);
    } 
    static void addTen(int a, int b){
        a = a + 10;
        b = b + 10;
        // How this addTen method works is that it takes two integer parameters a and b, which are copies of the original variables. Inside the method, we are modifying these copies by adding 10 to each of them. However, since these are just copies, the original variables in the main method remain unchanged after the method call.
        // But in case if a reference type is passed to the method, then the changes made inside the method will affect the original object outside the method. This is because when we pass an object to a method, we are passing the reference to that object, not a copy of the object itself. Therefore, any changes made to the object's state inside the method will be reflected outside the method as well.
        // We will see this in depth in the next lecture on "Call by Reference" in Java.
    }

    // Here we are trying to change the values of a and b in the main method, but since Java is pass-by-value, the changes made in addTen() do not affect the original variables a and b in main().
    // The output will be:
    // Before: a = 5, b = 9
    // After: a = 5, b = 9

    // Explanation:
    // In Java, when you pass primitive data types (like int, float, etc.) to a method, a copy of the value is made. Therefore, when we call addTen(a, b), the method receives copies of the values of a and b. Any modifications made to these copies inside the addTen() method do not affect the original variables in the main method. This is why the values of a and b remain unchanged after the method call.
    // In the simplest terms, Java uses "pass-by-value" for primitive types, meaning that the method gets a copy of the variable's value, not the variable itself.
    // So, pass by value is a mechanism where the method receives a copy of the variable's value, and any changes made to that copy do not affect the original variable. This is different from "pass-by-reference," where the method would receive a reference to the original variable, allowing it to modify the original variable's value directly.
    // How to know if we are using pass by value or pass by reference?
    // In Java, there are 8 primitive data types (byte , short, int, long, float, double, char, boolean) 
    // All primitive data types are passed by value, while reference types (objects) are passed by reference.
    // We will see pass by reference in depth in its own dedicated lecture. 
    // However, it's important to note that even though objects are passed by reference, the reference itself is passed by value. This means that while you can modify the object's internal state, you cannot change the reference to point to a new object within the method. Therefore, Java is often described as "pass-by-value" for both primitives and object references, but the behavior differs based on whether you're dealing with primitives or objects.
}
