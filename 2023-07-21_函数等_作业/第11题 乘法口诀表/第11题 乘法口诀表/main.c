//
//  main.c
//  第11题 乘法口诀表
//
//  Created by rain on 2023/10/27.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    for (int i=1; i<=9; i++) {
        for (int j=1; j<=i; j++) {
            printf("%d*%d=%d ", j, i, i*j);
        }
        printf("\n");
    }
    return 0;
}
