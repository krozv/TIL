package Array;

import java.util.Arrays;

public class Array04 {
    public static void main(String[] args){
        int[] nums = {13, 56, 1, 99, 85};

        // 1. 반복문
        // 새로 배열을 만든 다음, 반복문을 돌면서 일일이 옮긴다
        int[] tmp = new int[nums.length*2];

        for(int i=0; i<nums.length; i++) {
            tmp[i] = nums[i];
        }
        System.out.println(Arrays.toString(tmp));

        // 2. Arrays.copyOf(원본배열, 새로운배열의크기)
        int[] tmp2 = Arrays.copyOf(nums, 10);
        System.out.println(Arrays.toString(tmp2));

        // 3. System.arraycopy(원본배열, 원본배열의시작점, 복사배열, 복사배열의시작점, 복사할크기)
        int[] tmp3 = new int[10];
        System.arraycopy(nums, 0, tmp3, 0, nums.length);
        System.out.println(Arrays.toString(tmp3));

    }
}
