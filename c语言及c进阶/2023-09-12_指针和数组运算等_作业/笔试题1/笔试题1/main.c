//
//  main.c
//  笔试题1
//
//  Created by rain on 2023/11/18.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
     int a[5] = { 1, 2, 3, 4, 5 };
     int *ptr = (int *)(&a[4]+1);
     printf( "%d,%d", *(a + 1), *(ptr - 1));
    //程序的结果是什么？
    return 0;
}
