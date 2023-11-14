
#include <stdio.h>
#include <stdlib.h>

int compare(const void* a, const void* b){
    return *(int*)a-*(int*)b;
}

int main(int argc, const char * argv[]) {
    int arr[] = {9,8,7,6,5,4,3,2,1};
    int sz = sizeof(arr)/sizeof(arr[0]);
    qsort(arr, sz, sizeof(arr[0]), compare);
    for (int i=0; i<sz; i++) {
        printf("%d ", arr[i]);
    }
    return 0;
}
