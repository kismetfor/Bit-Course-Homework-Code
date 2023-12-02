//
//  main.c
//  第14题 函数判断素数
//
//  Created by rain on 2023/10/27.
//

#include <stdio.h>
#include <math.h>

int is_prime(int n){
    for (int i=2; i<=sqrt(n); i++) {
        if(n%i == 0){
            return 0;
        }
    }
    return 1;
}

int main(int argc, const char * argv[]) {
    int count = 0;
    for (int i=100; i<=200; i++) {
        if(is_prime(i)){
            printf("%d ", i);count++;
        }
    }
    printf("\n%d\n", count);
    return 0;
}
