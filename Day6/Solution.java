/* Given a string, , of length that is indexed from to , print its even-indexed
 and odd-indexed characters as space-separated strings on a single line  */
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Enter number of String : ") ;

        int T = scanner.nextInt() ;

        System.out.println("Enter "+T+" Strings : ") ;

        String string[] = new String[T] ;

        for(int i = 0 ; i < T ; i ++){

            string[i] = scanner.next() ;

        }

        for(int arrayIndex = 0 ; arrayIndex < string.length ; arrayIndex ++){

            String str = string[arrayIndex];

            int stringLength = str.length();

            for(int evenIndex = 0 ; evenIndex < stringLength ; evenIndex += 2){

                System.out.print(str.charAt(evenIndex));
            }

            System.out.print(" ");

            for(int oddIndex = 1 ; oddIndex < stringLength ; oddIndex += 2){

                System.out.print(str.charAt(oddIndex));
            }

            System.out.print("\n");
        }

    }
}