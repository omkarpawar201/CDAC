#include <iostream>
using namespace std;

int main()
{
    int a = 10;

    typedef int* pointer;

    pointer p = &a;

    cout<<*p;
}