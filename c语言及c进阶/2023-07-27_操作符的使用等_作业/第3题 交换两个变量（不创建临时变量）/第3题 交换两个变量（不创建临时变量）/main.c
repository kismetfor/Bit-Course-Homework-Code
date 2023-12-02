//
//  main.c
//  第3题 交换两个变量（不创建临时变量）
//
//  Created by rain on 2023/10/31.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int a = 1;
    int b = 2;
    printf("%d %d\n", a, b);
//    a = a + b;
//    b = a - b;
//    a = a - b;
    a = a ^ b; // a = 1^2
    b = a ^ b; // b = 1^2^2
    a = a ^ b; // a = 1^2^1
    printf("%d %d\n", a, b);
    return 0;
}
