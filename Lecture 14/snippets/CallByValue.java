public class CallByValue {
    public static void main(String[] args){
        int a = 5;
        int b = 9;

        System.out.println("Before: a = " + a + ", b = " + b);
        
        addTen(a, b);

        System.out.println("After: a = " + a + ", b = " + b);
    } 
    static void addTen(int a, int b){
        a = a + 10;
        b = b + 10;
    }

    // Here we are trying to change the values of a and b in the main method, but since Java is pass-by-value, the changes made in addTen() do not affect the original variables a and b in main().
    // The output will be:
    // Before: a = 5, b = 9
    // After: a = 5, b = 9

    // Explanation:
    // In Java, when you pass primitive data types (like int, float, etc.) to a method, a copy of the value is made. Therefore, when we call addTen(a, b), the method receives copies of the values of a and b. Any modifications made to these copies inside the addTen() method do not affect the original variables in the main method. This is why the values of a and b remain unchanged after the method call.
    // In the simplest terms, Java uses "pass-by-value" for primitive types, meaning that the method gets a copy of the variable's value, not the variable itself.
}
