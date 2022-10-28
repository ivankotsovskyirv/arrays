package Arrays;

public class ArrayAverage {

    public static void main(String[] args) {

        int[] arr = {-2, -5, -7, 12, -18, 18, 20, 8};

        int average = 0;
        for (int j : arr) {
            average += j;
        }

        System.out.println("The average of a list of numbers in array is: " + (double) average/ arr.length);

    }

}
