#include <stdio.h>

void each_digit_of_number(int n){
    if(n<10){printf("%d\n", n);}
    else{
        each_digit_of_number(n/10);
        printf("%d\n", n%10);
    }
}
int main(){
    int n;
    while (scanf("%d", &n) == 1) {
        each_digit_of_number(n);
    }
    
}

