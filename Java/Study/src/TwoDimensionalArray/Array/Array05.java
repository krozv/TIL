package TwoDimensionalArray.Array;

public class Array05 {
    public static void main(String[] args){
        int[][] grid = {
                {2, 3, 1, 4, 7},
                {8, 13, 3, 33, 1},
                {7, 4, 5, 80, 12},
                {17, 9, 11, 5, 4},
                {4, 5, 91, 27, 7},
        };
        int count = 0;
        int sum = 0;
        for(int [] row:grid){
            for(int num:row){
                if(num % 3 == 0){
                    sum += num;
                    count++;
                }
            }
        }
        System.out.printf("개수: %d, 총합: %d%n", count, sum);
    }
}
