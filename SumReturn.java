package Arrays;

public class SumReturn {

    public static void main(String[] args) {

        int[] arr = {6, 8, 19, 13, -16, 0, 7, -8};
        int sum = 0;
        for (int j : arr) {
            if (j > 0) {
                sum += j;
            }
        }

    System.out.println("The sum of the positive numbers in array: " + sum);

    }

}
