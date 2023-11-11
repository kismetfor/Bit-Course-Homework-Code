//
//  main.c
//  第5题 计算一个数的每位之和（递归实现）
//
//  Created by rain on 2023/10/29.
//

#include <stdio.h>

int DigitSum(int num){
    if(num<10){
        return num;
    }
    return num%10+DigitSum(num/10);
}
int main(int argc, const char * argv[]) {
    int n;
    scanf("%d", &n);
    printf("%d\n", DigitSum(n));
    return 0;
}
