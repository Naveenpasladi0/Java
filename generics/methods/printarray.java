package generics.methods;

public class printarray {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"one", "two", "three", "four", "five"};

        System.out.println("Integer Array: ");
        printArray(intArray);

        System.out.println("String Array: ");
        printArray(strArray);
    }
}
