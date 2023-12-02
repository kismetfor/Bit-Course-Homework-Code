//
//  main.c
//  写博客交换变量
//
//  Created by rain on 2023/10/31.
//

#include <stdio.h>

void swap(int* p1, int* p2){
    int temp = *p1;
    *p1 = *p2;
    *p2 = *p1;
}

int main(int argc, const char * argv[]) {
    int a = 1;
    int b = 2;
    printf("%d %d\n", a, b);
    swap(&a, &b);
    printf("%d %d\n", a, b);
    return 0;
}

