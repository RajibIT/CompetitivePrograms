package com.competitie_programming.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
* Write function to find all quadruplets in an array that sum up to the target sum and return 2D array of all these triplet
*
* # Sort the given array. Considering three pointers, i, j, left and right. Adding four pointers values and comparing with target
* value and if it is equal then return all quadruplets in a new list otherwise increment left index if potential sum
* is greater than zero else decrement right index value
*/
public class FourNumberSum {
    public static void main(String[] args) {
        List<Integer[]> results = fourNumberSum(new int[] {7, 6, 4, -1, 1, 2}, 16);

    }

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        // sort array
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<>();
        for(int i = 0; i <  array.length - 2; i++){
            for(int j = i + 1; j < array.length - 1; j++) {
                int left = j + 1;
                int right = array.length - 1;
                while(left < right) {
                    int potentialSum = array[i] + array[j] + array[left] + array[right];
                    if(potentialSum == targetSum) {
                        result.add(new Integer[]{array[i], array[j], array[left], array[right]});
                        left++;
                        right--;
                    }else if(potentialSum < targetSum) {
                        left++;
                    }else if(potentialSum > targetSum) {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
