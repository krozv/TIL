#include <stdio.h>
int fn(int n){
    n = 7;
    return n;
}
int main(){
    int n = 5;
    fn(n);
    printf("%d", n);
    return 0;
}
// 출력
// 5