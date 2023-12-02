//
//  main.c
//  5-BC54-获得月份天数
//
//  Created by rain on 2023/11/1.
//

#include <stdio.h>

int is_leap(int n){
    if((n%4==0 && n%100!=0) || n%400==0){
        return 1;
    }
    return 0;
}

int main(int argc, const char * argv[]) {
    int year, month;
    while (scanf("%d %d", &year, &month) == 2) {
        int months[13] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(is_leap(year)){
            months[2] = 29;
        }
        printf("%d\n", months[month]);
    }
    return 0;
}
