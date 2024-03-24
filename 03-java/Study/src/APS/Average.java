package APS;

import java.util.Scanner;

public class Average {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            float sum = 0;
            for (int i=0; i<10; i++){
                sum += sc.nextInt();
            }
            System.out.printf("#%d %.0f", test_case, sum/10);
            System.out.println();
        }

    }
}
