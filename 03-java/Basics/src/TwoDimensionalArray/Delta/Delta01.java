package TwoDimensionalArray.Delta;

public class Delta01 {
    public static void main(String[] args){
        int[][] arr = {
                {0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1},
        };
        int N = 5;

        // 델타배열 만들기
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                if(arr[r][c] == 1){
                    // (r, c) -> 1인 원소의 좌표, 기준점!
                    System.out.println("r: "+r+", c:"+c);
                    // (r, c)를 기준으로 해서, 상하좌우의 인접 좌표를 만듦
                    for(int d=0; d<4; d++){
                        // 새로운 좌표
                        int nr = r + dr[d];
                        int nc = c + dc[d];
                        // 경계조건
                        if(0<=nr && nr<N && 0<=nc && nc<N){
                            arr[nr][nc] = 2;
                        }
                    }
                }
            }
        }
        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                System.out.printf("%2d", arr[r][c]);
            }
            System.out.println();
        }
    }
}
