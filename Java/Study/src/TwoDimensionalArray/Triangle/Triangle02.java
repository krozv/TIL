package TwoDimensionalArray.Triangle;

public class Triangle02 {
    public static void main(String[] args){
        int[][] arr = new int[4][4];

//        1 2 3 4
//        5 6 7
//        8 9
//       10

        int cnt = 0;
        for(int r=0; r<4; r++){
            for(int c=0; c<4-r; c++) {
                arr[r][c] = ++cnt;
            }
        }
        for(int r=0; r<4; r++){
            for(int c=0; c<4; c++) {
                if(arr[r][c] == 0){
                    System.out.print("   ");
                }
                else {
                    System.out.printf("%-3d", arr[r][c]);
                }
            }
            System.out.println();
        }
    }
}
