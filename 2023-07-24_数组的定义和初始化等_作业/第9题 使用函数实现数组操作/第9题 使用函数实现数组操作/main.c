//
//  main.c
//  第9题 使用函数实现数组操作
//
//  Created by rain on 2023/10/29.
//

#include <stdio.h>


void init(int* arr, int n){
    for (int i=0; i<n; i++) {
        arr[i] = i;
    }
}

void print(int* arr, int n){
    for (int i=0; i<n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

void reverse(int* arr, int n){
    int left = 0;
    int right = n-1;
    while (left<=right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}

int main(int argc, const char * argv[]) {
    int n = 5;
    scanf("%d", &n);
    int arr[n];
    init(arr, n);
    print(arr, n);
    reverse(arr, n);
    print(arr, n);
    return 0;
}
