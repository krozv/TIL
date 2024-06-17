#include <stdio.h>
int main(){
    int x=11; // 0b1011 (0d11)
    printf("%d", x<<3); // 0b1011000 (0d88)
    printf("%d", x>>1); // 0b101 (0d5)
    return 0;
}
// 출력
// 885