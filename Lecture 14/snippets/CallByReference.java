// Call by Reference Implmentation in Java
// There is no Call by Reference in java as it is a pass by value language.

// First of all in Java, everything is  passed by value. But when we pass an object to a method, the value of the reference to that object is passed. So, if we change the state of the object inside the method, it will be reflected outside the method as well. This is often referred to as "call by reference" in Java, even though technically it's still "call by value" of the reference.
// So, in java everything is call by value but in this case call by value is done in such a way that it behaves like call by reference and produces similar results.
// The rest is just trying it out ourselves and understanding how it works.

public class CallByReference {
    public static void main(String[] args){
        
        // Create an instance of the random class with initial values for x and y
        random R1 = new random(10, 20);
        // What this does is it creates a new object of the random class and assigns the reference of that object to the variable ran. So, ran is now a reference to the random object in memory.
        
        // Print the values of x and y before calling the addTen method
        System.out.println("Before addTen: x = " + R1.x + ", y = " + R1.y);

        // Call the addTen method and pass the reference of the random object
        addTen(R1);
        // What happens here is that the reference of the random object is passed to the addTen method. Inside the addTen method, we are modifying the state of the object that R1 refers to. Since R1 and the parameter in addTen refer to the same object, changes made inside addTen will be reflected outside as well.

        System.out.println("After addTen: x = " + R1.x + ", y = " + R1  .y);

    }
    static void addTen(random ran){
        ran.x += 10;
        ran.y += 10;
        // What this method does is obviouly takes the parameter passed into it and adds 10 to both x and y. 
        // But as we can see in the above code, Since the reference variable is passed, ran is a reference to the same object as R1, the changes made here will be reflected in R1 as well.
        // So when the function is called, a new reference variable ran is created and it points to the same object in the heap memory as R1. 
        // Then the method does it function as the code written inside it. It modifies the values of x and y of the object that ran points to.
        // Then the method ends and the reference variable ran is destroyed since it's a local variable.
        // But the object that ran pointed to is still in memory and R1 still points to it.
        // So when we modify the object using ran, we are actually modifying the same object that R1 points to. Hence, the changes are reflected in R1 as well.
    }
}

class random{
    int x;
    int y;

    random(int x, int y){
        this.x = x;
        this.y = y;
    }
}

// All this happens due to the existence of the reference variable. The reference variable is a pointer to the object in memory. When we pass the reference variable to a method, we are passing the address of the object in memory. So when we modify the object using the reference variable, we are actually modifying the same object that the original reference variable points to. Hence, the changes are reflected in the original reference variable as well.
// The reference variable was introduced in Java to allow for the manipulation of objects without having to copy the entire object. This is especially useful for large objects, as it saves memory and processing time.

// So :
// In Java, Reference types (also known as non-primitive types) are data types that store the memory address of an object rather than storing the object itself or the actual data/values directly. They are passed by value, but the value that is passed is the reference to the object in memory. 
// While primitive variables (like int or boolean) hold their values directly on the stack, reference variables act as pointers that point to an object located on the heap.

// This means that when you pass a reference type to a method, you are passing a copy of the reference, not the actual object. However, since both the original reference and the copied reference point to the same object in memory, any changes made to the object through either reference will be reflected in both references. This is why it can appear as though Java is using call by reference for objects, even though it is technically still call by value of the reference.

// In Java, According the the Java Language Specification, there are four primary categories of reference types: 
//  1. class types,
//  2. interface types,
//  3. array types, and 
//  4. type variables. 
// All of these reference types are passed by value, but the value that is passed is the reference to the object in memory.

// Key Behaviors of Data Reference Types: 
// 1. Memory Allocation: The reference variable is allocated on the stack, but the actual object data is allocated on the heap.
// 2. Default Value: If a reference variable is declared but not initialized, its default value is always null.
// 3. Assignment Side-Effects: Assigning one reference variable to another copies the memory address. Both variables then point to the exact same object.
// 4. Modifying the object through one variable changes it for the other.
// 5. The == Comparison: The == operator checks if two reference variables point to the same memory address. It does not check if the internal object properties are equal.