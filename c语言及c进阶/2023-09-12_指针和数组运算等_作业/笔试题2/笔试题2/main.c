//
//  main.c
//  笔试题2
//
//  Created by rain on 2023/11/18.
//

#include <stdio.h>

//由于还没学习结构体，这里告知结构体的大小是20个字节
struct Test
{
 int Num;
 char *pcName;
 short sDate;
 char cha[2];
 short sBa[4];
}*p;
//假设p 的值为0x100000。 如下表表达式的值分别为多少？
//已知，结构体Test类型的变量大小是20个字节

int main(int argc, const char * argv[]) {
    p = 0x100000;
    printf("%p\n", p + 0x1);
    printf("%p\n", (unsigned long)p + 0x1);
    printf("%p\n", (unsigned int*)p + 0x1);
    return 0;
    return 0;
}
