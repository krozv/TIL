#include <stdio.h>
int main(){ // 12 -> 1100  10 -> 1010
    printf("%d\n", 12 & 10);
    printf("%d\n", 12 | 10);
    printf("%d\n", 12 ^ 10);
    printf("%d\n", ~12); // 2의 보수법 이용. 음수로 처리
    printf("%u", ~12); // unsigned일 경우 32bit 모두 변환됨
}
// 출력
// 8
// 14
// 6
// -13
// 4294967283