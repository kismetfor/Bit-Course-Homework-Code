//
//  main.c
//  第10题 字符串逆序
//
//  Created by rain on 2023/11/3.
//

#include <stdio.h>
#include <string.h>

int main(int argc, const char * argv[]) {
    char str[10000] = {'\0'};
    fgets(str, sizeof(str), stdin);
    char *p = str;
    size_t len = strlen(p);
    for (int i=len-1; i>=0; i--) {
        printf("%c", *(p+i));
    }
    printf("\n");
    return 0;
}
