#include <stdio.h>
int main(){
    float a = 1.234;
    int b = 10;
    printf("%.2f\n", a);
    printf("%5.1f\n", a);
    printf("%05.1f\n", a);
    printf("%-05.1f\n", a);
    printf("%5d\n", b);
    printf("%05d\n", b);
    printf("%-5d\n", b);
    printf("%-05d\n", b);
    return 0;
}
// 1.23
//   1.2
// 001.2
// 1.2
//    10
// 00010
// 10
// 10