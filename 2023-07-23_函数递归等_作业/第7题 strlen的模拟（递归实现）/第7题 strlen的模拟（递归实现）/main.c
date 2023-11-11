//
//  main.c
//  第7题 strlen的模拟（递归实现）
//
//  Created by rain on 2023/10/27.
//

#include <stdio.h>

size_t my_strlen(char* a){
    if(*a == '\0'){
        return 0;
    }
    return (1+my_strlen(a+1));
}

int main(int argc, const char * argv[]) {
    int n;
    scanf("%d", &n);
    char a[n];
    for (int i=0; i<n-1; i++) {
        a[i] = 'A'+i;
    }
    a[n-1] = '\0';
    for (int i=0; i<n; i++) {
        printf("%c", a[i]);
    }
    printf("\n");
    size_t len = my_strlen(a);
    printf("%zd\n", len);
    return 0;
}
