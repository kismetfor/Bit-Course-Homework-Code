//
//  main.c
//  第6题 字符串逆序(递归实现)
//
//  Created by rain on 2023/10/28.
//

#include <stdio.h>
#include <string.h>

void my_resverse(char* arr, int left, int right){
    if(left>right){
        return;
    }
    char temp;
    temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
    my_resverse(arr, left+1, right-1);
}
	
int main(int argc, const char * argv[]) {
    char arr[] = "abcdef";
    int len = strlen(arr);
    my_resverse(arr, 0, len-1);
    printf("%s\n", arr);
    return 0;
}
