#include <stdio.h>
int main(){
    int i, j;
    for(i=1; i<3; i++)
        for(j=1; j<3; j++)
            printf("%d\n", i*10+j);
    return 0;
}
// 출력
// 11
// 12
// 21
// 22