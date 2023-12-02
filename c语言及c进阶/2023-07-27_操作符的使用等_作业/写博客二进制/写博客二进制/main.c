//
//  main.c
//  写博客二进制
//
//  Created by rain on 2023/10/31.
//


//00000000 00000000 00000000 00001010
//00000000 00000000 00000000 00000001


#include <stdio.h>

int count1(int n){
    int count = 0;
    for (int i=0; i<32; i++) {
        if(n&1){
            count++;
        }
        n = n>>1;
    }
    return count;
}

int count2(int n){
    int count = 0;
    int s = 1;
    for (int i=0; i<32; i++) {
        if(n&s){
            count++;
        }
        s = s<<1;
    }
    return count;
}

int main(int argc, const char * argv[]) {
    int n;
    scanf("%d", &n);
    int s1 = count1(n);
    int s2 = count2(n);
    printf("%d %d\n", s1, s2);
    return 0;
}
