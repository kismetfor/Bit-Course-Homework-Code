//
//  main.c
//  第13题 函数判断闰年
//
//  Created by rain on 2023/10/27.
//

#include <stdio.h>
#include <stdbool.h>

bool is_leap_year(int year){
    return ((year%4==0 && year%100!=0) || year%400==0);
}
int main(int argc, const char * argv[]) {
    int year;
    while (scanf("%d", &year) == 1) {
        if(is_leap_year(year)){
            printf("%d is leap year\n", year);
        }
        else{
            printf("%d is not leap year\n", year);
        }
    }
    return 0;
}
