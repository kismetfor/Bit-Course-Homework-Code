//
//  main.c
//  第8题 程序死循环解释
//
//  Created by rain on 2023/11/5.
//
#include <stdio.h>

int main()
{
    int i = 0;
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    for(i=0; i<=12; i++)
    {
        arr[i] = 0;
        printf("hello bit\n");
    }
    return 0;
}
