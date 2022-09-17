#include <stdio.h>

int main(){
    printf("Hello world!\n");
    int sum = 0; 
    int i = 0;
    for(int i = 0; i<10; i++){
        sum +=i;
    }
    printf("Sum is %d", sum);
    return 0;
}