

#include <stdio.h>
#include <stdlib.h>

struct Stu{
    char name[20];
    int age;
};

struct Stu student[] = {{"lisa", 10}, {"lucy", 20}, {"paci", 30}};

int compare(const void* a, const void* b){
    return ((struct Stu*)a)->age - ((struct Stu*)a)->age;
}

int main(int argc, const char * argv[]) {
    int sz = sizeof(student)/sizeof(student[0]);
    qsort(student, sz, sizeof(student), compare);
    for (int i=0; i<sz; i++) {
        printf("%s %d\n", student[i].name, student[i].age);
    }
    
    return 0;
}
