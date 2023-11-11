//
//  main.c
//  第6题 求两个数二进制中不同位的个数
//
//  Created by rain on 2023/10/31.
//

//00000000 00000000 00000000 00001010
//00000000 00000000 00000000 00001111
//00000000 00000000 00000000 00000101
//统计0的个数

#include <stdio.h>

int result(int a, int b){
    int c = a^b;
    int count = 0;
    for (int i=0; i<32; i++) {
        if(!(c&1)){
            count++;
        }
        c = c>>1;
    }
    return count;
}

int main(int argc, const char * argv[]) {
    int a, b;
    scanf("%d %d", &a, &b);
    int s = result(a, b);
    printf("%d\n", s);
    return 0;
}
