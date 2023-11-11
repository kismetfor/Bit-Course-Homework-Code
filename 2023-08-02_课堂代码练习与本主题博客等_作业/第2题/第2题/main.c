//
//  main.c
//  第2题
//
//  Created by rain on 2023/11/7.
//

#include <stdio.h>
#include <string.h>

int main(int argc, const char * argv[]) {
    char a[1000] = {0};
    int i=0;
    for (i=0; i<1000; i++) {
        a[i] = -1-i;
    }
    //0000 0000 最大2^7-1=127
    //a[0] = -1-0=-1
    //a[1] = -1-1=-2
    //a[2] = -1-2=-3
    //a[i] = -1-i=0
    //-1的ASCLL码 加上1 i的符号位在前面
    //1000 0001+1111 1111 = 1 0000 0000
    //
    printf("%zd\n", strlen(a));
    // /0的ASCLL码为0, 碰到为0就找到
    return 0;
    git config --global user.name "Han"
    git config --global user.email "kismetfor33455@163.com"
    ssh-keygen -t rsa -C "kismetfor33455@163.com"
    /Users/rain/.ssh/id_rsa.pub
    mkdir learngit
    cd learngit
    pwd
    git add sample.txt
    git status
    git remote add origin https://kismetfor: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@github.com/kismetfor/2023-oj.git
    
    Username for 'https://github.com': kismetfor
    Password for 'https://your_username@github.com': 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@github.com
        
        git push -u origin main -u kismetfor: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@github.com

}
