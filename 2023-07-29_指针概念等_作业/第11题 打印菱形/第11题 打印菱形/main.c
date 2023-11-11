//
//  main.c
//  第11题 打印菱形
//
//  Created by rain on 2023/11/3.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    for (int i=0; i<7; i++) {
        for (int j=0; j<13; j++) {
            if(j<=i+6 && j>=6-i){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }
    for (int i=5; i>=0; i--) {
        for (int j=0; j<13; j++) {
            if(j<=i+6 && j>=6-i){
                printf("*");
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    }
    return 0;
}
