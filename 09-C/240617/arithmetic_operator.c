#include <stdio.h>
int main(){
    int x=3, y=2;
    float z=2.0;
    printf("%d %d\n", x%y, y%x);
    printf("%d %.2f", x/y, x/z);
    return 0;
}
// 출력
// 1 2
// 1 1.50