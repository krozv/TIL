#include <stdio.h>
int main(){
    int score = 101;
    switch(score/10){
        case 10:
        case 9:
            printf("A"); break;
        case 8:
            printf("B");
            break;
        default:
            printf("F");
    }
    return 0;
}
// 출력
// A