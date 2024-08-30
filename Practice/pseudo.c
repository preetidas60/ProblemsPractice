#include<stdio.h>
void main(){
    int arr[] = {50, 40, 100, 290};
    for(int i=0; i<3; i++){
        if(arr[i] + arr[i+1] < 100){
            printf("true");
            break;
        }
    } 
}

