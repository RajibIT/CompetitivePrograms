package com.competitie_programming.easy;

import java.util.Arrays;
/*
Problem : If any two numbers in a given input array sum up to target sum.. our function should return
them in an array..

solution : 1.Sort the given array.
           2.Considering two pointers(eg: left and right), left pointer pointing to first index and right
           pointer pointing to last index.
           3.Adding values of left and right index until left index is greater than the right
           and if it the sum is equal to target sum then return the two numbers in an new array,
           otherwise increment the left index if sum is smaller than target sum else decrement
           right index.
*/
public class TwoNumberSum {
    public static void main(String[] args) {
        int[] numbers = twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println(numbers[0] + " " + numbers[1]);
    }
    public static int[] twoNumberSum(int[] array, int targetSum) {
        int left = 0;
        int right = array.length-1;
        //Sorting given array
        Arrays.sort(array);
        while(left < right) {
            int result = array[left] + array[right];
            if(result == targetSum){
                return new int[]{array[left], array[right]};
            }
            if(result<targetSum)
                left++;
            else
                right--;
        }
        return new int[0];
    }
}
