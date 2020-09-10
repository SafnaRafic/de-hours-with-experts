package com.labs1904;

import java.util.Arrays;
import java.util.Scanner;

public class NextBiggestNumber {

    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter a number:  ");
//        Integer input = in.nextInt();
        Integer input= Integer.parseInt(args[0]);
        Integer nextBiggestNumber = getNextBiggestNumber(input);
        System.out.println("Input: " + input);
        System.out.println("Next biggest number: " + nextBiggestNumber);
        }

    public static int getNextBiggestNumber(Integer i) {
        //TODO: IMPLEMENT ME!

              char[] array=String.valueOf(i).toCharArray();
//              System.out.println(array);
              int n = array.length;
              int result;
              int k;
//            Checking for descending order.
            for (k = n - 1; k > 0; k--)
            {
                if (array[k] > array[k - 1]) {
//                    System.out.println("Not descending order");
                    break;
                }
            }
            if (k == 0)
            {
                System.out.println("No larger number can be created");
            }
            else
            {
//                System.out.println("Checking conditions in else statement");
                int min = k;
                for (int j = k + 1; j < n; j++)
                {
//                    System.out.println("checking smallest number");
                    if (array[j] > array[k-1] && array[j] < array[min])
                    {
                        min = j;
                    }
                }
                char temp = array[k-1];
                array[k-1] = array[min];
                array[min] = temp;
                Arrays.sort(array, k, n);
                result= Integer.parseInt(new String(array));
                return result;
            }
     return -1;
    }
}
