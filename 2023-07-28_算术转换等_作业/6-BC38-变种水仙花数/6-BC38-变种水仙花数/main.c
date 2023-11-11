//
//  main.c
//  6-BC38-变种水仙花数
//
//  Created by rain on 2023/11/1.
//

//12334
//1*2334+12*334+123*34+1233*4

#include <stdio.h>
#include <stdbool.h>

int is_Lily(int n){
    int s = 0;
    int j = 10;
    for (int i=0; i<4; i++) {
        s += (n%j) * (n/j);
        j *=10;
    }
    if(s==n){
        return 1;
    }
    return 0;
}

int main(int argc, const char * argv[]) {
    for (int i=10000; i<100000; i++) {
        if(is_Lily(i)){
            printf("%d ", i);
        }
    }
    return 0;
}
