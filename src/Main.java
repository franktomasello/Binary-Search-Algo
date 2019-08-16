
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] testArray = {-3, 2, 3, 4, 7, 8, 12};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(testArray));
        System.out.println();

        System.out.print("Enter searched number: ");
        String searchedNum = scanner.nextLine();
        System.out.println();

        boolean isNumPresent = BinarySearch.search(testArray, Integer.parseInt(searchedNum));

        if(isNumPresent)
        {
            System.out.println("Value " + searchedNum + " is in the array.");
        }
        else {
            System.out.println("Value " + searchedNum + " is not in the array.");
        }
        // Print here the result
    }
}
