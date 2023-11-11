//
//  main.c
//  第13题 计算求和
//
//  Created by rain on 2023/11/3.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int a = 2;
    int s = 0;
    for (int i=0; i<5; i++) {
        s += a;
        a = a*10+2;
    }
    printf("%d\n", s);
    return 0;
}
