//
//  main.c
//  第4题
//
//  Created by rain on 2023/11/7.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    unsigned int a= 0x1234;
    //在32位大端模式处理器上变量b等于（ ）
    //11 22 33 44
    unsigned char b = *(unsigned char *)&a;
    printf("%d", b);
    return 0;
}
