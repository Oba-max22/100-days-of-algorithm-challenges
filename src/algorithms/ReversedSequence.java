package algorithms;

import java.util.Arrays;

/*
 Day-2
 Build a function that returns an array of integers from n to 1 where n>0.
 Example : n=5 --> [5,4,3,2,1]
 */

public class ReversedSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5))); // {5,4,3,2,1}
    }
    public static int[] reverse(int n){
        int[] result = new int[n];

        int temp = n;
        for (int i = 0; i < n; i++) {
            result[i] = temp;
            temp--;
        }
        return result;
    }
}
