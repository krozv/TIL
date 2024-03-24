package APS;

import java.util.Scanner;

public class Odd {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int sum = 0;
            for (int i=0; i<10; i++){
                int num = sc.nextInt();
                if (num % 2 != 0){
                    sum += num;
                }
            }
            System.out.printf("#%d %d", test_case, sum);
            System.out.println();
        }

    }
}
