#include <stdio.h>
int main(){
    char a[2][8] = {"Hello", "Soojebi"};
    printf("%s\n", a[0]);
    printf("%s\n", a[1]);
    printf("%s\n", a[1]+3);
    a[1][4] = '\0';
    printf("%s\n", a[1]+2);
    return 0;
}
// 출력
// Hello
// Soojebi
// jebi
// oj