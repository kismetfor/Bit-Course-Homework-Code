//
//  main.c
//  第4题 递归实现n的k次方
//
//  Created by rain on 2023/10/29.
//

#include <stdio.h>

int the_kth_power_of_n (int n, int k){
    if(k==1){return n;}
    return n*the_kth_power_of_n(n, k-1);
}
int main(int argc, const char * argv[]) {
    int n, k;
    scanf("%d %d", &n, &k);
    the_kth_power_of_n(n, k);
    printf("%d\n", the_kth_power_of_n(n, k));
    return 0;
}
