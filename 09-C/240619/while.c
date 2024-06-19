#include <stdio.h>
int main(){
    int i=0, sum=0;
    while (i < 2){
        i++;
        sum = sum + i;
    }
    printf("%d\n", sum);
    return 0;
}
// 출력
// 3