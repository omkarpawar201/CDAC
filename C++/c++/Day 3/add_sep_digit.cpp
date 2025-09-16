#include <iostream>
using namespace std;

int main()
{
    int num1, num, sum = 0, temp, count = 0;

    // cout<<"Enter the number of digit = ";
    // cin>>num1;
    cout<<"Enter the number = ";
    cin>>num;

    temp = num;
    while (temp != 0)
    {
        temp = temp/10;
        count++;
    }
    
    for (int i = 0; i < count; i++)
    {
        sum += num%10;
        num = num / 10;  
    }
    
    cout<<"The sum is = "<<sum; 
}