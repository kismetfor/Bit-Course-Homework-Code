//
//  main.c
//  第2题
//
//  Created by rain on 2023/11/7.
//

#include <stdio.h>
#include <string.h>

int main(int argc, const char * argv[]) {
    char a[1000] = {0};
    int i=0;
    for (i=0; i<1000; i++) {
        a[i] = -1-i;
    }
    //0000 0000 最大2^7-1=127
    //a[0] = -1-0=-1
    //a[1] = -1-1=-2
    //a[2] = -1-2=-3
    //a[i] = -1-i=0
    //-1的ASCLL码 加上1 i的符号位在前面
    //1000 0001+1111 1111 = 1 0000 0000
    //
    printf("%zd\n", strlen(a));
    // /0的ASCLL码为0, 碰到为0就找到
    return 0;
}
