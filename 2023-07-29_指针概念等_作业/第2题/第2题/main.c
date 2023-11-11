//
//  main.c
//  第2题
//
//  Created by rain on 2023/11/3.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    int arr[] = {1, 2, 3,4,5};
    short* p = (short*)arr;
    //01 00 00 00 | 02 00 00 00 | 03 00
    //00 00|00 00 | 00 00|00 00 | 03 00
    for (int i=0; i<4; i++) {
        *(p+i) = 0;
    }
    for (int i=0; i<5; i++) {
        printf("%d ", arr[i]);
    }
    return 0;
}
