import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Given value -
        int preInt = 4;
        double preDouble = 4.0;
        String preString = "HackerRank ";

        // User input -

        Scanner scannerObject = new Scanner(System.in);
        int    userInt    = scannerObject.nextInt();
        double userDouble = scannerObject.nextDouble();
        scannerObject.nextLine(); /* use extra .nextLine() for empty the BUFFER */
        String userString = scannerObject.nextLine();
        scannerObject.close();

        //Add pre and my variables value and print them -

        System.out.println(preInt + userInt);
        System.out.println(preDouble + userDouble);
        System.out.println(preString + userString);

    }
}
