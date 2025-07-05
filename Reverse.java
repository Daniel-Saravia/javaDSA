
public class Reverse {
    static void reverseHere(int[] a) {
        // init i (begin) and j (end)
        int i = 0, j = a.length - 1;
        // while i is less then j
        while (i < j) {
            // store temp a current index
            int tmp = a[i];
            // a current index(begining) = a(last in array
            // then add 1 to i 
            a[i++] = a[j];
            // use temp to make a starting value = a ending value in array
            // then subtract one from j
            a[j--] = tmp;
        }
    }
    
    public static void main(String[] args) {
        // init array
        int[] numbers = {1, 2, 3, 4, 5, 6};
        // print out of array with toString
        System.out.println("Original array: " + java.util.Arrays.toString(numbers));
        // sent to method
        reverseHere(numbers);
        // print out result
        System.out.println("Reversed array: " + java.util.Arrays.toString(numbers));
    }
}