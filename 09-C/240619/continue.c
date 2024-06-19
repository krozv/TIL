#include <stdio.h>
int main(){
    int i=1;
    while (i < 5){
        i++;
        if (i==3)
            continue;
        printf("%d", i);
    }
    printf("%d", i);
    return 0;
}
// 출력
// 2455