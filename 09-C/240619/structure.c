#include <stdio.h>
struct Student {
    char gender;
    int age;
};
int main( ) {
    struct Student s = {'F', 21};
    s.gender = 'M';
    printf("%c", s.gender);
    printf("%d", s.age);
    return 0;
}
// 출력
// M21
