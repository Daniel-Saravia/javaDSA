
public class Reverse {
    static void reverse(int[] a) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            int tmp = a[i];
            a[i++] = a[j];
            a[j--] = tmp;
        }
    }
    
    public static void main(String[] args) {
        // init array
        int[] numbers = {1, 2, 3, 4, 5, 6};
        // print out of array with toString
        System.out.println("Original array: " + java.util.Arrays.toString(numbers));
        // sent to method
        reverse(numbers);
        // print out result
        System.out.println("Reversed array: " + java.util.Arrays.toString(numbers));
    }
}