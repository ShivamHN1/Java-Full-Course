// Here, the objectives are :
// 1. we are going to use reference variable in method parameter instead of passing the value directly to the method we are going to pass the reference variable to the method and then we are going to use that reference variable in the method to perform some operation.
// 2. A Method that returns non-primitive data type aka reference variable. In this case we are going to return an object of a class from a method.

public class MethodWithRefVars {
    public static void main(String[] args) {
        int a = 10;  // Primitive variable
        int b = 20;  // Primitive variable
        int c = 30;  // Primitive variable
        int d = 40;  // Primitive variable
        int e = 50;  // Primitive variable
        System.out.println("Original Values: ");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e);

        
        // Calling the method with primitive variable as parameter first to show that the values of a, b, c, d, e are not changed after calling the method with primitive variable as parameter.
        PrimitiveParameterTestingMethod(a, b, c, d, e);
        
        // Creating an object of the ReferenceVariableClass to initialize a reference variable.
        ReferenceVariableClass refVar = new ReferenceVariableClass(a, b, c, d, e);

        System.out.println("Values of the variables in the ReferenceVariableClass object: ");
        System.out.println("a = " + refVar.a + ", b = " + refVar.b + ", c = " + refVar.c + ", d = " + refVar.d + ", e = " + refVar.e);

        // Calling the method with reference variable as parameter to show that the values of a, b, c, d, e are changed after calling the method with reference variable as parameter.
        NonPrimitiveParameterTestingMethod(refVar);

        // Printing the values of a, b, c, d, e after calling the method with reference variable as parameter to show that they are changed after calling the method with reference variable as parameter.
        System.out.println("Values of the variables in the ReferenceVariableClass object after calling the method with reference variable: ");
        System.out.println("a = " + refVar.a + ", b = " + refVar.b + ", c = " + refVar.c + ", d = " + refVar.d + ", e = " + refVar.e);
        
        // Again printing the values of a, b, c, d, e to show that they are not changed after calling the method with reference variable as parameter.
        System.out.println("After calling method with reference variable: ");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e);
        
        // So, to clarify things a bit, there are two instances of the variables a, b, c, d, e. One is the primitive variable and the other is the reference variable. The primitive variable is passed to the constructor of the ReferenceVariableClass and then the values of the primitive variable are assigned to the instance variables of the ReferenceVariableClass object. Then when we call the method with reference variable as parameter, we are passing the reference variable to the method and then we are changing the values of the instance variables of the ReferenceVariableClass object. But when we call the method with primitive variable as parameter, we are passing the primitive variable to the method and then we are changing the values of the primitive variable inside the method but it does not affect the original primitive variable outside the method.

        // Calling the Method that returns Reference Variable
        refVar = returnReferenceVariable(a, b, c, d, e);
        // What this does is that it passes the values of a, b, c, d, e local variables or primitives into the function returnReferencVariable and then returns the Reference variable which we are assigning to the reference variable or non primitive data type already declared that is refVar

        System.out.println("Values of the variables in the ReferenceVariableClass object after calling the method that returns reference variable: ");
        System.out.println("a = " + refVar.a + ", b = " + refVar.b + ", c = " + refVar.c + ", d = " + refVar.d + ", e = " + refVar.e);
        // What Happened and how  we did it ?
        // So what happened is that we passed the values of a, b, c, d, e local variables or primitives into the function returnReferencVariable and then the method/function returned the Reference variable which we are assigning to the reference variable or non primitive data type already declared that is refVar. So now the values of a, b, c, d, e in the ReferenceVariableClass object are changed to 101, 201, 301, 401, 501 respectively.
        // So this is how we can return a reference variable from a method and assign it to a reference variable or non primitive data type already declared.

        // Lets do it the other way which is also pretty similar, this time we are going to pass a reference variable to the method and then return a reference variable from the method and assign it to a reference variable or non primitive data type already declared.
        refVar = returnReferenceVariable(refVar.e, refVar.d, refVar.c, refVar.b, refVar.a);
        // What this does is that it passes the values of refVar.a, refVar.b, refVar.c, refVar.d, refVar.e reference variable into the function returnReferencVariable and then returns the Reference variable which we are assigning to the reference variable or non primitive data type already declared that is refVar

        System.out.println("Values of the variables in the ReferenceVariableClass object after calling the method that returns reference variable with reference variable as parameter: ");
        System.out.println("a = " + refVar.a + ", b = " + refVar.b + ", c = " + refVar.c + ", d = " + refVar.d + ", e = " + refVar.e);
        // What Happened and how  we did it ?
        // So what happened is that we passed the values of refVar.a, refVar.b, refVar.c, refVar.d, refVar.e reference variable into the function returnReferencVariable and then the method/function returned the Reference variable which we are assigning to the reference variable or non primitive data type already declared that is refVar. 

        refVar = returnReferenceVariable(refVar);
        System.out.println("Values of the variables in the ReferenceVariableClass object after calling the method that returns reference variable with reference variable as parameter: ");
        System.out.println("a = " + refVar.a + ", b = " + refVar.b + ", c = " + refVar.c + ", d = " + refVar.d + ", e = " + refVar.e);
        // What Happened and how  we did it ?
        // So what happened is that we passed the reference variable refVar into the function returnReferencVariable and then the method/function returned the Reference variable which we are assigning to the reference variable or non primitive data type already declared that is refVar. So now the values of a, b, c, d, e in the ReferenceVariableClass object are changed to 201, 301, 401, 501, 601 respectively.

    }
    // Creating a method that takes reference variable as parameter
    static void NonPrimitiveParameterTestingMethod(ReferenceVariableClass refVar) {
        refVar.a += 1;
        refVar.b += 1;
        refVar.c += 1;
        refVar.d += 1;
        refVar.e += 1;
        System.out.println("Inside method with reference variable: ");
        System.out.println("a = " + refVar.a + ", b = " + refVar.b + ", c = " + refVar.c + ", d = " + refVar.d + ", e = " + refVar.e);
    }
    // Creating a method that takes primitive variable as parameter
    static void PrimitiveParameterTestingMethod(int a, int b, int c, int d, int e) {
        a += 1;
        b += 1;
        c += 1;
        d += 1;
        e += 1;
        System.out.println("Inside method with primitive variable: ");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + ", e = " + e);
    }

    // Creating a method that returns non-primitive data type aka reference variable. In this case we are going to return an object of a class from a method.
    // Here in the place of returning primitive data type we are going to return non-primitive data type aka reference variable. In this case we are going to return an object of a class from a method.
    // So this can be done in two ways which is the output will always be a non primitive data type but the input can either be a) primitive data type or b) non primitive data type.

    // Lets input a primitive data type for our first try 
    static ReferenceVariableClass returnReferenceVariable(int x, int y, int z, int j, int k) {
        x = x + 100;
        y = y + 100;
        z = z + 100;
        j = j + 100;
        k = k + 100;

        ReferenceVariableClass refVar = new ReferenceVariableClass(x, y, z, j, k);
        return refVar;
    }
    static ReferenceVariableClass returnReferenceVariable(
        ReferenceVariableClass refVar) {

    return new ReferenceVariableClass(
            refVar.a + 100,
            refVar.b + 100,
            refVar.c + 100,
            refVar.d + 100,
            refVar.e + 100);
        }
}
class ReferenceVariableClass {
    int a;
    int b;
    int c;
    int d;
    int e;

    public ReferenceVariableClass(int a, int b, int c, int d, int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
}
