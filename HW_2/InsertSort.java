import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {8, 5, 7, 3, -6, 4};
        sortOut(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sortOut(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int temp = i - 1;
            while (temp >= 0 && arr[temp] > currentValue) {
                arr[temp + 1] = arr[temp];
                arr[temp] = currentValue;
                temp--;
            }

        }
    }
}
