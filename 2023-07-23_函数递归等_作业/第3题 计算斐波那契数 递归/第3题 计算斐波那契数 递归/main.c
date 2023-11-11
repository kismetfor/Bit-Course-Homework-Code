//
//  main.c
//  第3题 计算斐波那契数 递归
//
//  Created by rain on 2023/10/29.
//

#include <stdio.h>
int Fibonacci(int n){
    if(n==1 || n==2){return 1;}
    return Fibonacci(n-1) + Fibonacci(n-2);
}

int main(int argc, const char * argv[]) {
    int n;
    while (scanf("%d", &n) == 1) {
        int s = Fibonacci(n);
        printf("%d\n", s);
    }
    return 0;
}
