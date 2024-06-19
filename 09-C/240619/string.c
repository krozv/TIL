#include <stdio.h>
int main(){
    char a[8] = "Hello";
    printf("%s\n", a);
    printf("%s\n", a+1);
    a[3] = '\0';
    printf("%s\n", a+1);
    printf("%s\n", a+4);
    return 0;
}
// 출력
// Hello
// ello
// el
// o