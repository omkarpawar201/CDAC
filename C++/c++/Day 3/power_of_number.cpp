#include <iostream>
using namespace std;

int main()
{
    int num, power, mul = 1;

    cout<<"Enter the number = ";
    cin>>num;
    cout<<"Enter the power = ";
    cin>>power;
    
    for (int i = 0; i < power; i++)
    {
        mul = mul*num;
    }
    cout<<"The power is "<<mul;
    
}