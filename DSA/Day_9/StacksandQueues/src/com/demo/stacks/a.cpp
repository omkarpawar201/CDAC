
#include <iostream>
using namespace std;

int main(){

    int a = 10;
    int *head = &a;
    int b = 20;
    int *b = &a;

    int *c = &b;

    cout<<b;

    return 0;
}