
#include <stdio.h>

int add(int a, int b){
    return a+b;
}
int sub(int a, int b){
    return a-b;
}
int mul(int a, int b){
    return a*b;
}
int Div(int a, int b){
    return a/b;
}

int main(int argc, const char * argv[]) {
    int (*pfarr[4])(int ,int) = {add, sub, mul, Div};
    int(* (*p)[4])(int, int) = &pfarr;
    return 0;
}
