package com.labs1904;

import java.util.Arrays;

public class NextBiggestNumber {

    public static void main(String[] args) {
        Integer input = Integer.parseInt(args[0]);
        Integer nextBiggestNumber = getNextBiggestNumber(input);
        System.out.println("Input: " + input);
        System.out.println("Next biggest number: " + nextBiggestNumber);
    }

    public static int getNextBiggestNumber(Integer number) {
        //TODO: IMPLEMENT ME!
        String str = Integer.toString(number);
        char[] array = str.toCharArray();
        int n = array.length;
        int result;
        int i;

        // Checking for descending order.
        for (i = n - 1; i > 0; i--) {
            if (array[i] > array[i - 1]) {
                break;
            }
        }
        //If the number is descending order, no larger number can be created
        if (i == 0) {
            System.out.println("No larger number can be created");
        }
        // If the number is ascending order, then i+1 equals to the length.
        else if (i + 1 == n) {
            char temp = array[i - 1];
            array[i - 1] = array[i];
            array[i] = temp;
            result = Integer.parseInt(new String(array));
            return result;
        } else {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[i - 1] && array[j] < array[min]) {
                    min = j;
                }
            }
            char temp = array[i - 1];
            array[i - 1] = array[min];
            array[min] = temp;
            Arrays.sort(array, i, n);

            result = Integer.parseInt(new String(array));
            return result;
        }
        return -1;
    }
}
