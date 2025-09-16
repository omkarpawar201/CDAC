#include <iostream>
using namespace std;

int main()
{
    int num1, num, temp = 0, sum = 0, org_num, temp2, count = 0;

    // cout<<"Enter the number of digit = ";
    // cin>>num1;
    cout<<"Enter the number = ";
    cin>>num;

    
    temp2 = num;
    while (temp2 != 0)
    {
        temp2 = temp2/10;
        count++;
    }

    org_num = num;
    
    for (int i = 0; i < count; i++)
    {
        temp = num%10;
        sum += temp*temp*temp;
        num = num / 10;  
    }
    
    // cout<<sum; 
    if (sum == org_num)
    {
        cout<<"The number is armstrong number "; 
    }
    else
    {
        cout<<"The number is not armstrong number "; 
    }
    
    
}