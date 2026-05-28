import java.util.Arrays;

public class array_copy3 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr2 = new int[arr1.length];
        // System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        // System.out.println(Arrays.toString(arr2));
        //the above is actually used to copy the entire element from one array into another array.

        System.arraycopy(arr1, 2, arr2, 4, 3);
        System.out.println(Arrays.toString(arr2));
    }
}
