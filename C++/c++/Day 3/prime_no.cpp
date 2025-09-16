#include <iostream>
using namespace std;

int main()
{
    int num, flag = 0;

    cout<<"Enter the number = ";
    cin>>num;

    
    for (int i = 2; i < num; i++)
    {
        if (num%i == 0)
        {
            flag++;
        }
        
    }

    if (flag > 0)
    {
        cout<<"The number is not prime ";
    }
    else
    {
        cout<<"The number is prime ";
    }
       
}