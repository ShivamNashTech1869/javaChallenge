import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static void printReverse(int []array , int length){

        for(int index = length-1 ; index >= 0 ; index--){

            System.out.print(array[index]+" ");

        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");

        int sizeOfArray = scanner.nextInt();

        int array[] = new int[sizeOfArray];

        System.out.println("Enter "+sizeOfArray+" integers for array :");

        for(int index = 0 ; index < sizeOfArray ; index ++){

            //input from user
            array[index] = scanner.nextInt();

        }

        System.out.println("Your Array in Reverse Order : ");

        printReverse(array , sizeOfArray);      //call print reverse method

        scanner.close();

    }
}
