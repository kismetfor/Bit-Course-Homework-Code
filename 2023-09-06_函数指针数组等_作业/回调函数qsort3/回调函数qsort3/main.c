

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Stu{
    char name[20];
    int age;
};

struct Stu student[] = {{"aisa", 10}, {"ducy", 20}, {"faci", 30}};

int compare(const void* a, const void* b){
    return strcmp(((struct Stu*)a)->name, ((struct Stu*)b)->name);
}

int main(int argc, const char * argv[]) {
    int sz = sizeof(student)/sizeof(student[0]);
    qsort(student, sz, sizeof(student[0]), compare);
    for (int i=0; i<sz; i++) {
        printf("%s %d\n", student[i].name, student[i].age);
    }
    
    return 0;
}
