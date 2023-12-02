//
//  main.c
//  第12题 交换两个整数
//
//  Created by rain on 2023/10/27.
//

#include <stdio.h>
void swap(int* p1, int* p2){
    int temp = *p1;
    *p1 = *p2;
    *p2 = temp;
}
int main(int argc, const char * argv[]) {
    int a, b;
    while (scanf("%d %d", &a, &b) == 2) {
        swap(&a, &b);
        printf("%d %d\n", a, b);
    }
    return 0;
}
