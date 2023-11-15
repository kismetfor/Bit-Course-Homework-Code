
#include <stdio.h>
#include <string.h>

struct Stu {
    char name[20];
    int age;
};

void swap(char* a, char* b, size_t size){
    for (int i=0; i<size; i++) {
        char temp = *a;
        *a = *b;
        *b = temp;
        a++;
        b++;
    }
}

int compare_arr(const void* a, const void* b){
    return *(int*)a - *(int*)b;
}

int compare_by_name(const void* a, const void* b){
    return strcmp(((struct Stu*)a)->name, ((struct Stu*)b)->name);
}
int compare_by_age(const void* a, const void* b){
    return ((struct Stu*)a)->age - ((struct Stu*)b)->age;
}

void bubble_sort(void* base, size_t num, size_t size, int (*compare)(const void*, const void*)){
    for (int i=0; i<num-1; i++) {
        for (int j=0; j<num-1-i; j++) {
            if(compare((char*)base+j*size, (char*)base+(j+1)*size)>0){
                swap((char*)base+j*size, (char*)base+(j+1)*size, size);
            }
        }
    }
}

void print(int* arr, int sz){
    for (int i=0; i<sz; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

void print_stu(struct Stu* p, int sz){
    for (int i=0; i<sz; i++) {
        printf("%s %d\n", p[i].name, p[i].age);
    }
    printf("\n");
}

void test1(void){
    int arr[] = {9,8,7,6,5,4,3,2,1,0};
    int sz = sizeof(arr)/sizeof(arr[0]);
    print(arr, sz);
    bubble_sort(arr, sz, sizeof(arr[0]), compare_arr);
    print(arr, sz);
}

void test2(void){
    struct Stu arr[] = {{"lihua", 20}, {"ahua", 39}, {"bhua", 30}};
    int sz = sizeof(arr)/sizeof(arr[0]);
    print_stu(arr, sz);
//    bubble_sort(arr, sz, sizeof(arr[0]), compare_by_name);
    bubble_sort(arr, sz, sizeof(arr[0]), compare_by_age);
    print_stu(arr, sz);
}

int main(int argc, const char * argv[]) {
//    test1();
    test2();
    return 0;
}
