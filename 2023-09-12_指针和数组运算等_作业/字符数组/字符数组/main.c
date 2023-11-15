
#include <stdio.h>
#include <string.h>

int main(int argc, const char * argv[]) {
    //字符数组
    char arr[] = {'a','b','c','d','e','f'};
//    printf("%d\n", sizeof(arr));
//    printf("%d\n", sizeof(arr+0));
//    printf("%d\n", sizeof(*arr));
//    printf("%d\n", sizeof(arr[1]));
//    printf("%d\n", sizeof(&arr));
//    printf("%d\n", sizeof(&arr+1));
//    printf("%d\n", sizeof(&arr[0]+1));
//
    printf("%d\n", strlen(arr));
    printf("%d\n", strlen(arr+0));
//    printf("%lu\n", strlen(*arr));
//    printf("%d\n", strlen(arr[1]));
    printf("%lu\n", strlen(&arr));
    printf("%d\n", strlen(&arr+1));
    printf("%d\n", strlen(&arr[0]+1));
    return 0;
}
