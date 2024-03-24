package TwoDimensionalArray.Array;

public class Array03 {
    public static void main(String[] args){
        int[][] arr1 = new int[3][4]; // 행, 열
        int[][] arr2 = new int[3][]; // 1차원 배열의 개수만 지정하는 방식(행의 크기만 지정)
        // 1차원 배열은 아직 생성되지 않았고, 연결되지 않음

        System.out.println(arr2[0]);

        arr2[0] = new int[] {1, 2, 3};
        arr2[1] = new int[] {4, 5, 6, 7, 8};
        arr2[2] = new int[] {9, 10};

        // 2차원 배열의 원소에 접근
        // 행의 번호를 지정 -> 실제 1차원 배열 안에서 각 원소의 index 지정(열)

        System.out.println(arr2[1][4]);
    }
}
