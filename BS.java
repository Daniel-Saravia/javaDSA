import java.util.Arrays;

public class BS {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int target = 3;
        int hit = Arrays.binarySearch(a, target);
        System.out.println(hit);
    }

}
