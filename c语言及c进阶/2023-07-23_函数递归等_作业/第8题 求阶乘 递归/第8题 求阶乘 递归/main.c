//
//  main.c
//  第8题 求阶乘 递归
//
//  Created by rain on 2023/10/27.
//

#include <stdio.h>

int factorial(int n){
    if(n==1){
        return 1;
    }
    else{
        return n*factorial(n-1);
    }
}
int main(int argc, const char * argv[]) {
    int n;
    scanf("%d", &n);
    printf("%d\n", factorial(n));
    return 0;
}
