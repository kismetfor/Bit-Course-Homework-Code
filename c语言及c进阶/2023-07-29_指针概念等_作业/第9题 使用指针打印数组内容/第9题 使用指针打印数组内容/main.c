//
//  main.c
//  第9题 使用指针打印数组内容
//
//  Created by rain on 2023/11/3.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    int* p = arr;
    for (int i=0; i<10; i++) {
        printf("%d ", *(p+i));
    }
    return 0;
}
