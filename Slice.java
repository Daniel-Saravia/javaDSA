import java.util.Arrays;

public class Slice {
    public static void main(String[] args) {
        int[] src = {1, 2, 3, 4, 5};
        int[] SubSrc = Arrays.copyOfRange(src, 1, 3);
        System.out.println(Arrays.toString(SubSrc));

    }
}