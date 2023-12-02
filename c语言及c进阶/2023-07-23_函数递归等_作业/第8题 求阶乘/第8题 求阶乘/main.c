//
//  main.c
//  第8题 求阶乘 非递归
//
//  Created by rain on 2023/10/27.
//

#include <stdio.h>

int factorial(int n){
    int s = 1;
    for (int i=1; i<=n; i++) {
        s *= i;
    }
    return s;
}
int main(int argc, const char * argv[]) {
    int n;
    while (scanf("%d", &n) == 1) {
        printf("%d\n", factorial(n));
    }
    return 0;
}
