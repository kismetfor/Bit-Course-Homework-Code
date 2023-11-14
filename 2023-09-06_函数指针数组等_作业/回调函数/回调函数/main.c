#include <stdio.h>

void menu(void){
    printf("****1.加法****\n");
    printf("****2.减法****\n");
    printf("****3.乘法****\n");
    printf("****4.除法****\n");
    printf("****0.退出****\n");
}

int Add(int a, int b){
    return a+b;
}
int Sub(int a, int b){
    return a-b;
}
int Mul(int a, int b){
    return a*b;
}
int Div(int a, int b){
    return a/b;
}

void calc(int (*pf)(int ,int)){
    int a, b;
    printf("请输入>");
    scanf("%d %d", &a, &b);
    int ret = pf(a, b);
    printf("结果是>%d\n", ret);
}

int main(int argc, const char * argv[]) {
    int input;
    int a, b;
    int ret;
    do {
        menu();
        scanf("%d", &input);
        switch(input){
            case 1:
                calc(Div);
                break;
            case 2:
                calc(Div);
                break;
            case 3:
                calc(Div);
                break;
            case 4:
                calc(Div);
                break;
            case 0:
                printf("退出\n");
                break;
            default:
                printf("请重新输入\n");
                break;
        }
    } while (input);
    return 0;
}

​
