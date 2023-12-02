
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

int main(int argc, const char * argv[]) {
    int (* pfArr[5])(int , int) = {NULL, Add, Sub, Mul, Div};
    int input;
    int a, b;
    int ret;
    do {
        menu();
        scanf("%d", &input);
        if(0 == input){
            printf("退出\n");
        }
        else if (input>0 && input<5){
                    printf("请输入>");
                    scanf("%d %d", &a, &b);
                    ret = pfArr[input](a, b);
                    printf("结果是%d\n", ret);
        }
        else{
            printf("请重新输入\n");
        }
    } while (input);
    return 0;
}
