#include <stdio.h>
int main(){
    int x = 3, y = 3;
    int z = x++ + ++y; // 3 + 4
    printf("%d %d %d", x, y, z);
    return 0;
}
// 출력
// 4 4 7