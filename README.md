# Problem : If any two numbers in a given input array sum up to target sum.. our function should return
them in an array..

solution : 1.Sort the given array.
           2.Considering two pointers(eg: left and right), left pointer pointing to first index and right
           pointer pointing to last index.
           3.Adding values of left and right index until left index is greater than the right
           and if it the sum is equal to target sum then return the two numbers in an new array,
           otherwise increment the left index if sum is smaller than target sum else decrement
           right index.
