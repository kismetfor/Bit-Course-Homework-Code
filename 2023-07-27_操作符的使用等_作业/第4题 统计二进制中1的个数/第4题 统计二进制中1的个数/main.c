//
//  main.c
//  第4题 统计二进制中1的个数
//
//  Created by rain on 2023/10/31.
//

//00000000 00000000 00000000 00001010
//00000000 00000000 00000000 00000001
//&按位与 然后后者左移与 或者前者右移与

#include <stdio.h>

int result1(int n){
    int count = 0;
    for (int i=0; i<32; i++) {
        //n右移按位与
        if(n&1){
            count++;
        }
        n = n>>1;
    }
    return count;
}

int result2(int n){
    int count = 0;
    int a = 1;
    for (int i=0; i<32; i++) {
        //a左移按位与
        if(a&n){
            count++;
        }
        a = a<<1;
    }
    return count;
}

int main(int argc, const char * argv[]) {
    int n;
    scanf("%d", &n);
    int s = result2(n);
    printf("%d\n", s);
    return 0;
}
