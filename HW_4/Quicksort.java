import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
      int[] array = {7, 5, 3, 4, -5, 0, 6, 0};
      sort(array, 0, array.length-1);
      System.out.println(Arrays.toString(array));

    }
    static void sort(int[] arr, int left, int right) {
        if (arr.length == 0 || left >= right) return;
        int separator = partition(arr, left, right);
        sort(arr, left, separator - 1);
        sort(arr, separator, right);
    }
    static int getSupport(int[] arr, int left, int right) {
        int middle = left + (right - left) / 2;
        int support = arr[middle];
        return support;
    }
    static int partition (int[] arr, int from, int to) {
        int pivot = getSupport(arr, from, to);
        while (from <= to) {

            while (arr[from] < pivot) {
                from++;
            }
            while (arr[to] > pivot) {
                to--;
            }
            if (from <= to) {
                swap(arr, to, from);
                from++;
                to--;
            }
        }
        return from;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
