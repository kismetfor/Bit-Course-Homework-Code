//
//  main.c
//  第10题 冒泡排序
//
//  Created by rain on 2023/10/29.
//

#include <stdio.h>

void swap(int* a, int* b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

void bubble_sort(int* arr, int sz){
    for (int i=0; i<sz; i++) {
        for (int j=0; j<sz-1-i; j++) {
            if(arr[j]>arr[j+1]){
                swap(&arr[j], &arr[j+1]);
            }
        }
    }
}

int main(int argc, const char * argv[]) {
    int arr[] = {10,9,8,7,6,5,4,3,2,1};
    int sz = sizeof(arr)/sizeof(arr[0]);
    bubble_sort(arr, sz);
    for (int i=0; i<sz; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}
