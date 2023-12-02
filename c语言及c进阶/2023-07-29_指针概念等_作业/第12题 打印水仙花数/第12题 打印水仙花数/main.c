//
//  main.c
//  第12题 打印水仙花数
//
//  Created by rain on 2023/11/3.
//

#include <stdio.h>
#include <math.h>

int get_digit(int n){
    int a = 1;
    while (n>10) {
        n /= 10;
        a++;
    }
    return a;
}

int is_shuixainhua(int n){
    int digit = get_digit(n);
    int s = 0;
    for (int i=0; i<digit-1; i++) {
        int a = pow(10, digit-i-1);
        s += pow(((n/a)%a), digit);
    }
    //个位数
    s += n%10;
    if(s==n){
        return 1;
    }
    return 0;
}

int main(int argc, const char * argv[]) {
    for (int i=0; i<=100000; i++) {
        if(is_shuixainhua(i)){
            printf("%d ", i);
        }
    }
    return 0;
}
