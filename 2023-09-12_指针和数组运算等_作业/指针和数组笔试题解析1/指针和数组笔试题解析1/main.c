
#include <stdio.h>

int main(int argc, const char * argv[]) {
    //一维数组
    int a[] = {1,2,3,4};
    printf("0 %d\n",sizeof(a));
    
    printf("1 %d\n",sizeof(a+0));
    printf("2 %d\n",sizeof(*a));
    printf("3 %d\n",sizeof(a+1));
    printf("4 %d\n",sizeof(a[1]));
    printf("5 %d\n",sizeof(&a));
    printf("6 %d\n",sizeof(*&a));
    printf("7 %d\n",sizeof(&a+1));
    printf("8 %d\n",sizeof(&a[0]));
    printf("9 %d\n",sizeof(&a[0]+1));
    return 0;
}
