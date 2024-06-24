package datatypes;

// 05 - Defining the interface data types
interface mathoperations {
    void multiply();
    void divide();
}

// Implementing the interface in the class
public class nonprimitivedatatypes implements mathoperations {
    // 01 - Class data types
    // Defining the variables of class
    int a = 20;
    int b = 30;

    // Defining the methods of class
    public void add() {
        int c = a + b;
        System.out.println("Addition of number is" + c);
    }

    public void sub() {
        int c = a - b;
        System.out.println("Substraction of number is" + c);
    }

    // Implementing the interface multiple method
    public void multiply() {
        int m = a * b;
        System.out.println("Multiplication of number is" + m);
    }

    // Implementing the interface divide method
    public void divide() {
        int d = a / b;
        System.out.println("Division of number is" + d);
    }

    public static void main(String[] args) {

        // 02 - Creating new object method of class
        nonprimitivedatatypes obj = new nonprimitivedatatypes();
        // Class & object calling the methods
        obj.add();
        obj.sub();

        // 03 - Creating string method and initializing it
        String str = "This is the example of string";
        // Calling the string method
        System.out.println(str);
        // Creating substring method to call specified indexed value from string
        String subStr = str.substring(0, 11);
        // Calling the substring method
        System.out.println(subStr);

        // 04 - Creating array method and initializing it
        int[] array;
        // One-dimensional array
        array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        // Calling the array method
        // i is a counter variable and use to increment the index position after checking if the current index position is less than the length of the array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index" + i + "is" + array[i]);
        }
        // 04 - Creating Array method and initializing it
        // Two-dimensional array
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}};
        for (int i1 = 0; i1 < 2; i1++) {
            for (int j1 = 0; j1 < 3; j1++) {
                System.out.println("Element of Two Dimensional index" + i1 + j1 + "is" + array2[i1][j1]);
            }
        }
        // 04 - Creating Array method and initializing it
        // Multi-dimensional array
        int[][] array3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i2 = 0; i2 < 3; i2++) {
            for (int j2 = 0; j2 < 3; j2++)
                System.out.println("Element of Multi Dimensional index" + i2 + j2 + "is" + array3[i2][j2]);
        }

        // 05 - Calling the methods from the Interface data types
        obj.multiply();
        obj.divide();
        }
    }
