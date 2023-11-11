//
//  main.c
//  第1题
//
//  Created by rain on 2023/11/7.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    unsigned char a = 200;
    //0000 0000 最大255
    //200 1100 1000
    //100 0110 0100
    //0001 0010 1100
    //0010 1100 32+8+4=44
    unsigned char b = 100;
    //加上以后300 溢出300-255=45
    unsigned char c = 0;
    c = a+b;
    printf("%d %d", a+b, c);
    //打印300因为%d打印有符号整数 打印44因为溢出
    return 0;
}
