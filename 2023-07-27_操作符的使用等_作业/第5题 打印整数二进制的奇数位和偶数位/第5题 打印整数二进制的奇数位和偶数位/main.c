//
//  main.c
//  第5题 打印整数二进制的奇数位和偶数位
//
//  Created by rain on 2023/10/31.
//

//00000000 00000000 00000000 00001010
//00000000 00000000 00000000 00000001

#include <stdio.h>

int odd_bits(int n){
    int s = 0;
    for (int i=0; i<32; i+=2) {
        if(n&1){
            s++;
        }
        n = n>>2;
    }
    return s;
}

int even_bits(int n){
    n = n>>1;
    int s = 0;
    for (int i=1; i<32; i+=2) {
        if(n&1){
            s++;
        }
        n = n>>2;
    }
    return s;
}

int main(int argc, const char * argv[]) {
    int n;
    scanf("%d", &n);
    int odd = odd_bits(n);
    int even = even_bits(n);
    printf("odd = %d\n", odd);
    printf("even = %d\n", even);
    return 0;
}
