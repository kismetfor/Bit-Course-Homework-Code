//
//  main.c
//  4-【一维数组】BC100-有序序列合并
//
//  Created by rain on 2023/11/1.
//

#include <stdio.h>

void bubble(int* arr, int sz){
    for (int i=0; i<sz-1; i++) {
        for (int j=0; j<sz-1-i; j++) {
            if(arr[j]>arr[j+1]){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}

int main(int argc, const char * argv[]) {
    int n, m;
    scanf("%d %d", &n, &m);
    int arr[n+m];
    for (int i=0; i<n; i++) {
        scanf("%d", &arr[i]);
    }
    for (int i=n; i<n+m; i++) {
        scanf("%d", &arr[i]);
    }
    bubble(arr, n+m);
    for (int i=0; i<n+m; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
    return 0;
}
