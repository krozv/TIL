package Array;

import java.util.Arrays;

public class Array03{
    public static void main(String[] args){
        int[] nums = {1, 3, 5, 7, 9};

        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        for (int x: nums){
            System.out.println(x);
        }
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
    }
}