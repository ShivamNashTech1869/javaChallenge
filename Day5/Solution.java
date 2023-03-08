import java.io.*;

import static java.util.stream.Collectors.joining;

public class Solution {

    public static void printTableOf(int number){

        int multiples = 10 ;

        for(int multiplicand = 1 ; multiplicand <= multiples ; multiplicand ++){

            System.out.println(number + " x " + multiplicand + " = " + number * multiplicand);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter any Number(Not Decimal) that's table you want to see :\nNumber : ");

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        printTableOf(n);

        bufferedReader.close();
    }
}
