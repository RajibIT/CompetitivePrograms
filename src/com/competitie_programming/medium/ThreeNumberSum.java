package com.competitie_programming.medium;

import java.util.*;

/*
 * Write function to find all triplets in an array that sum up to the target sum and return 2D array of all these triplet
 *
 * # Sort the given array. Considering three pointers, i, left and right. Subtract sum of three pointers values from target
 * sum and if difference is equal to zero then return all triplets in a new list otherwise increment left index if difference
 * is greater than zero else decrement right index value
 * */
public class ThreeNumberSum {
    public static void main(String[] args) {
        List<Integer[]> results = threeNumberSum(new int[] {12, 3, 1, 2, -6, 5, -8, 6}, 0);
    }
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Set<Integer> threeSum = new HashSet<>();
        List<Integer[]> result = new ArrayList<>();
        int right = array.length-1;
        //sorting array
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            for(int left=i+1; left<right;){
                int remaining = targetSum - (array[i] + array[left] + array[right]);
                if(remaining == 0){

                    result.add(new Integer[]{array[i], array[left], array[right]});
                    right--; left++;
                }else if(remaining<0){
                    right--;
                }else if(remaining>0){
                    left++;
                }
            }
        }
        return result;
    }
}
