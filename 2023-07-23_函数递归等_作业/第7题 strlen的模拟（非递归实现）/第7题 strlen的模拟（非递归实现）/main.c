//
//  main.c
//  第7题 strlen的模拟（非递归实现）
//
//  Created by rain on 2023/10/28.
//

#include <stdio.h>

size_t my_strlen(char* a){
    size_t length = 0;
    int i = 0;
    while (a[i] != '\0') {
        length++;
        i++;
    }
    return length;
}

int main(int argc, const char * argv[]) {
    int n;
    scanf("%d", &n);
    char a[n];
    for (int i=0; i<n-1; i++) {
        a[i] = 'A' + i;
    }
    a[n-1] = '\0';
    printf("%s", a);
    printf("\n");
    size_t len = my_strlen(a);
    printf("%zd\n", len);
    return 0;
}
