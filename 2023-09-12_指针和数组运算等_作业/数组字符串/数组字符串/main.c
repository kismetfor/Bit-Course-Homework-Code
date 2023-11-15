

#include <stdio.h>

int main(int argc, const char * argv[]) {
//    char arr[] = "abcdef";
//    printf("%d\n", sizeof(arr));
//    printf("%d\n", sizeof(arr+0));
//    printf("%d\n", sizeof(*arr));
//    printf("%d\n", sizeof(arr[1]));
//    printf("%d\n", sizeof(&arr));
//    printf("%d\n", sizeof(&arr+1));
//    printf("%d\n", sizeof(&arr[0]+1));
//
    char arr[] = "abcdef";
    printf("%d\n", strlen(arr));
    printf("%d\n", strlen(arr+0));
    printf("%d\n", strlen(*arr));
    printf("%d\n", strlen(arr[1]));
    printf("%d\n", strlen(&arr));
    printf("%d\n", strlen(&arr+1));
    printf("%d\n", strlen(&arr[0]+1));
    return 0;
}
