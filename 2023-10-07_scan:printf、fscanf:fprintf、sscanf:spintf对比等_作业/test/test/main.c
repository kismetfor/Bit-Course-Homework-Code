//
//  main.c
//  test
//
//  Created by rain on 2023/11/23.
//

#include <stdio.h>

int main(int argc, const char * argv[]) {
    //打开文件
    FILE* pf = fopen("data.txt", "w");
    if(pf == NULL){
        perror("fopen");
        return 1;
    }
    
    //写文件
    //...
    
    fclose(pf);
    pf = NULL;
    
    return 0;
}
