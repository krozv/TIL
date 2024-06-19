#include <stdio.h>
int main(){
    int a[2][3] = {1, 2, 3, 4};
    int i, j;
    for (i=0; i<2; i++)
        for (j=0; j<3; j++)
            printf("%d ", a[i][j]);
    return 0;
}
// 출력
//1 2 3 4 0 0