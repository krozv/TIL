package TwoDimensionalArray.Array;

public class Array02 {
    public static void main(String[] args){
        int[][] arr1 = new int[3][4]; // 자료형의 기본값으로 초기화.
        int[][] arr2 = new int[][]{ // 우리가 지정한 값으로 초기화.
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        int[][] arr3 = { // 각각 독립적으로 길이를 정할 수 있음.
                {1, 2, 3, 4},
                {5, 6, 7},
                {8},
        };
    }
}
