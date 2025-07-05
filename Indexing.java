public class Indexing {
    public static void main(String[] args) {
        // type[] name = {"what", "I", "want", "in", "here"};
        String[] foods = {"apple", "noodles"};
        // you have to assign size at creatation
        // with varables or a new size like this
        String[] filler = new String[5];
        // the array is filled with default types:
        // int and double = 0, 0.0
        // boolean = false
        // String = null
        // access
        int[] a = {10, 20, 30};
        int x = a[1];
        System.out.println(x);

        String s = "hello";
        char c = s.charAt(2);
        
        System.out.println(c);

        
    }
}