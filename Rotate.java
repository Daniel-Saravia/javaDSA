public class Rotate {
    static void rotate(int[] a, int k) {
        int n = a.length;
        k %= n;
        reverse(a, 0, n - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, n - 1);
    }

    static void reverse(int[] a, int i, int j) {
        while (i < j) {
            int t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }
    public static void main(String[] args) {
        int k = 2;
        int[] Tiwi = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Tiwi);
        rotate(Tiwi, k);
    }

}
