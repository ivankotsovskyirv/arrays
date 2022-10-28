package Arrays;

import java.util.Arrays;

public class ReplaceDuplicates {

    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 1, 4, 2, 8, 3};
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                    arr2[j] = arr[j];
                } else {
                    arr2[i] = arr[i];

                }

            }
        }

        System.out.println("New array without duplicates:" + Arrays.toString(arr2));

    }
}