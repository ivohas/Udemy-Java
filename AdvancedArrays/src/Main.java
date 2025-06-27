import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        declareArrays();
        walkThoughArray();
        getRandomArray(5);
        searching();
        twoDimensions();
    }

    public static void declareArrays() {

        int[] nums = new int[10];
        nums[4] = 501;


        int[] moreNums = {1, 23, 53534, 4352, 432453, 765, 6425};
        int sum = Arrays.stream(moreNums).sum();

        System.out.println(sum);

        int[] newArray;
        newArray = new int[]{423, 213432};
    }

    public static void walkThoughArray() {
        int[] arr = new int[]{523525, 2424, 1, 5, 25};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void getRandomArray(int len) {
        Random random = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void searching() {
        String[] arr = {"Abby", "John", "Daniel", "James"};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, "John") >= 0);
        System.out.println(Arrays.binarySearch(arr, "Snow") >= 0);
    }

    public static void twoDimensions() {
        int[][] matrix = new int[3][3];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                matrix[i][j] = j + 1;
            }
        }

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.printf(String.valueOf(matrix[i][j]));
            }
            System.out.println();
        }
    }
}