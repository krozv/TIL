#include <stdio.h>
int main(){
    int a = 17;
    a += 1;
    a -= 2;
    a *= 3;
    a /= 4;
    a %= 5;
    printf("%d", a);
    return 0;
}
// 출력
// 17 -> 18 -> 16 -> 48 -> 12 -> 2
// 2