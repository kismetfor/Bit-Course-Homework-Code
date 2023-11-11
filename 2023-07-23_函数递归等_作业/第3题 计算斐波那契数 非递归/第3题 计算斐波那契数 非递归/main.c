//
//  main.c
//  第3题 计算斐波那契数 非递归
//
//  Created by rain on 2023/10/29.
//

#include <stdio.h>
// 1 1 2 3 5
// a b c
//   a b c
int Fibonacci(int n){
    int a = 1;
    int b = 1;
    int c = 1;
    while (n>=3) {
        c = a+b;
        a = b;
        b = c;
        n--;
    }
    return c;
}
int main(int argc, const char * argv[]) {
    int n;
    while (scanf("%d", &n) == 1) {
        int s = Fibonacci(n);
        printf("%d\n", s);
    }
    return 0;
}
