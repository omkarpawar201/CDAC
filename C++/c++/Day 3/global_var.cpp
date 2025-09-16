#include <iostream>
using namespace std;

void show();

int num = 5;

int main()
{
    cout<<num<<endl;
    show();
    num++;
    cout<<num<<endl;
}

void show(){
    int num = 10;

    num++;
    cout<<num<<endl;
}