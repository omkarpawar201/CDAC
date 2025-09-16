#include <iostream>
using namespace std;

void show();

int main()
{
    show();
    show();
    show();
}

// void show(){
//     int num = 0;

//     cout<<num<<endl;
//     num++;
// }

void show(){
    static int num;

    cout<<num<<endl;
    num++;
}