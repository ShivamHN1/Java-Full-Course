// Ok now lets dive deep into objects in Java.

// So an Object is a data structure that can contain data and methods. It is a fundamental building block of object-oriented programming in Java.
// More specifically, an object is an runtime instance of a class. A class is a blueprint for creating objects. It defines the properties and behaviors of the objects that are created from it.

// So lets see things from the very beginning 

// It starts with a class definition. A class is defined using the class keyword followed by the class name and a pair of curly braces. Inside the curly braces, we can define the properties and methods of the class.
// for example:
class Person {  // A class named Person with minimal properties and methods.
    // properties
    String name;
    int age;
}
// Now What happens internally when we create a class ?
// When we define a class, the Java compiler creates a .class file that contains the bytecode for the class. This bytecode is what the Java Virtual Machine (JVM) executes at runtime. The class definition itself does not create any objects or allocate any memory for the properties. It simply defines the structure and behavior of the objects that can be created from it. 
// None of the above happens until we compile the code and run it as a Java application. When we run the application, the JVM loads the class into memory and creates an instance of the class (an object) when we use the new keyword to create an object from the class.

// OK now lets create an object from the Person class and see what happens internally when we do that.
public class ObjectDeep {
    public static void main(String[] args) {
        // creating an object of the Person class
        Person person1 = new Person(); // This line creates an object of the Person class and assigns it to the variable person1.
        // Now what happens internally when we create an object of the Person class?
        // When we create an object of the Person class using the new keyword, the JVM allocates memory for the object on the heap. 
        // The heap is a region of memory that is used for dynamic memory allocation.
        // Its called the heap because it is a large pool of memory that can be used to store objects of varying sizes. The JVM manages the heap and allocates memory for objects as needed.
        // The JVM also initializes the properties of the object to their default values (null for objects, 0 for numeric types, false for boolean, etc.). In this case the name property will be initialized to null and the age property will be initialized to 0.
        // The JVM also creates a reference to the object in the variable person1. This reference points to the memory location where the object is stored on the heap.
        // The reference variable person1 is stored on the stack, which is a region of memory that is used for storing local variables and method call information. The stack is organized in a last-in-first-out (LIFO) manner, meaning that the most recently created variable is the first one to be removed when it goes out of scope.
        // The reference variable takes about 4bytes of memory on a 32-bit system and 8 bytes on a 64-bit system, regardless of the size of the object it references. This is because the reference variable only stores the memory address of the object on the heap, not the actual data of the object.
        // So now we have an object of the Person class stored on the heap and a reference to that object stored in the variable person1. We can use this reference to access the properties and methods of the object.

        // Now lets try to guess what will be the object size of the Person class. The object size of the Person class will be 16 bytes. This is because the object has two properties: a String and an int. The String property takes up 8 bytes of memory (4 bytes for the reference and 4 bytes for the actual data), and the int property takes up 4 bytes of memory. The total size of the object is therefore 8 + 4 = 12 bytes. However, the JVM adds some additional overhead to the object for things like object headers and alignment, which brings the total size of the object to 16 bytes.
        // But this is just an estimate and the actual size of the object may vary depending on the JVM implementation and the specific properties of the class. The best way to determine the actual size of an object is to use a profiling tool or a memory analyzer.
        // Why ? 
        // Since the object size depends on 3 things :
        // 1. Header size : The header size of an object is the amount of memory that is used to store metadata about the object, such as its class type, hash code, and synchronization information. The header size can vary depending on the JVM implementation and the specific properties of the class. In general, the header size is typically 8 bytes on a 32-bit system and 12 bytes on a 64-bit system.
        // 2. Exact fields and Field size : The field size of an object is the amount of memory that is used to store the actual data of the object, such as its properties and methods. The field size can vary depending on the specific properties of the class and the data types of those properties. In general, the field size is typically 4 bytes for an int, 8 bytes for a long, and 4 bytes for a reference type (such as a String).
        // 3. (Optional) Padding and Alignment : The padding and alignment of an object is the amount of memory that is used to ensure that the object is properly aligned in memory. The padding and alignment can vary depending on the JVM implementation and the specific properties of the class. In general, the padding and alignment is typically 4 bytes on a 32-bit system and 8 bytes on a 64-bit system.
        // We try to store data in the multiple of 8 bytes for better performance. This is because modern CPUs are optimized to read and write data in chunks of 8 bytes, which is the size of a long or a double. When data is stored in memory in a non-aligned manner, the CPU may need to perform additional operations to read or write the data, which can result in slower performance. By aligning data to 8-byte boundaries, we can ensure that the CPU can read and write data more efficiently, which can improve the overall performance of the application.
        
        //  Now lets take a closer look at object headers and how they are used by the JVM to manage objects in memory. The object header is a small amount of memory that is allocated for each object on the heap. It contains metadata about the object, such as its class type, hash code, and synchronization information. The object header is typically 8 bytes on a 32-bit system and 12 bytes on a 64-bit system.
        // Object header contains 3 things :
        // 1. Mark Word : The mark word is a 4-byte field that contains information about the object, such as its hash code, garbage collection status, and lock state. The mark word is used by the JVM to manage the object in memory and to perform operations such as garbage collection and synchronization. The mark word is typically the first field in the object header and is used to store information about the object that is needed by the JVM to manage the object in memory.
        // 2. Class Pointer : The class pointer is a 4-byte field that contains a reference to the class of the object. The class pointer is used by the JVM to determine the type of the object and to access the methods and properties of the class. The class pointer is typically the second field in the object header and is used to store a reference to the class of the object that is needed by the JVM to manage the object in memory.
        // 3. Array Length : The array length is a 4-byte field that contains the length of the array if the object is an array. The array length is used by the JVM to determine the size of the array and to access the elements of the array. The array length is typically the third field in the object header and is used to store the length of the array if the object is an array that is needed by the JVM to manage the object in memory.

    }
}