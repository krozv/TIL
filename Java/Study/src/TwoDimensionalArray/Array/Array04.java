package TwoDimensionalArray.Array;

public class Array04 {
    public static void main(String[] args){
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };

        // 행 우선 순회
        // 2차원 배열 -> 2중 for문 사용
        // 바깥쪽 for문: 행, 안쪽 for문: 열
        for(int r=0; r < 3; r++) {
            for(int c=0; c < 4; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }

        // 지그재그 순회
        for(int r=0; r < 3; r++) {
            if(r%2==0){
                for(int c=0; c < 4; c++) {
                    System.out.print(arr[r][c] + " ");
                }
            }
            else{
                for(int c=3; c >= 0; c--) {
                    System.out.print(arr[r][c] + " ");
                }
            }
            System.out.println();
        }

    }
}
