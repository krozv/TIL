#include <stdio.h>
int main(){
    int i=1, sum=0;
    do{
        sum = sum + i;
        i++;
    }while(i<0);
    printf("%d\n", sum);
    return 0;
}
// 출력
// 1