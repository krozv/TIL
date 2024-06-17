#include <stdio.h>
int main(){
    int x = 5;
    if(x % 3 == 0)
        printf("1");
    else if(x % 3 == 1)
        printf("2");
    else
        printf("3");
    return 0;
}
// 출력
// 3