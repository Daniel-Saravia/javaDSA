import java.util.Arrays;
public class Merge {
    static int[] merge(int[] A, int[] B) {
        int i = 0, j = 0, k = 0, m = A.length, n = B.length;
        int[] C = new int[m + n];
        while (i < m && j < n) {
            C[k++] = (A[i] <= B[j]) ? A[i++] : B[j++];
        }
        while (i < m)
            C[k++] = A[i++];
        while (j < n)
            C[k++] = B[j++];
        return C;
    }

    public static void main(String[] args) {
        // nines
        int[] nines = { 9, 99, 999, 9999, 99999};
        System.out.println("Array nines: " +Arrays.toString(nines));

        //eights
        int[] eights = {8, 88, 888, 8888, 88888};
        System.out.println("Array eights: " + Arrays.toString(eights));

        //merge
        int[] both = merge(nines, eights);
        System.out.println("Both Arrays: " +Arrays.toString(both));
    }
}
