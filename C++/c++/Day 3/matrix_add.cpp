#include <iostream>
using namespace std;

int main()
{
    int arr1[2][2], arr2[2][2], sum[2][2];

    cout<<"Enter 1st array"<<endl;
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cin >> arr1[i][j];
        }
    }
    
    cout<<"Enter 2nd array"<<endl;
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cin >> arr2[i][j];
        }
    }
    
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cout << arr1[i][j] << "\t"; 
        }
    }
    cout<<endl;
    
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cout << arr2[i][j] << "\t"; 
        }
    }
    cout<<endl;
    cout<<"Addition of Arr1 and Arr2"<<endl;
    
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            sum[i][j] = arr1[i][j] + arr2[i][j];  
        }
    }
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cout << sum[i][j] << "\t"; 
        }
    }
}