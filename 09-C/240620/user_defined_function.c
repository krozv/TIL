#include <stdio.h>
char fn(int num){
    if(num % 2 == 0)
        return 'Y';
    else   
        return 'N';
}
int main(){
    char a = fn(5);
    printf("%c\n", a);
    return 0;
}
// 출력
// N