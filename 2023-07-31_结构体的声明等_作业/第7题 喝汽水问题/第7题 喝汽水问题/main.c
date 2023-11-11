//
//  main.c
//  第7题 喝汽水问题
//
//  Created by rain on 2023/11/5.
//

#include <stdio.h>

struct Soda {
    int price;
    int bottle;
};

int count(struct Soda *s, int money){
    int sum = 0;
    while (money >= 0 || s->bottle>1) {
        if(s->bottle == 2){
            s->bottle -= 1;
            sum++;
        }
        else{
            money -= s->price;
            s->bottle++;
            sum++;
        }
    }
    return sum;
}

int main(int argc, const char * argv[]) {
    struct Soda soda = {1, 0};
    int money = 20;
    int s = count(&soda, money);
    printf("%d\n", s);
    return 0;
}
