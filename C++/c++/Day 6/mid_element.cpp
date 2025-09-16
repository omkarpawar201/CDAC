#include <iostream>
using namespace std;

int sec_larg(int arr[])
{
    int large = 0, sec, sum = 0;

    sec = large;

    for (int i = 0; i < 5; i++)
    {
        sum += arr[i];
    }
    
    int avg = sum/5;

    // for (int i = 0; i < 5; i++)
    // {//25 23 45 52 32
    //     if (large < arr[i])
    //     {
    //         sec = large;
    //         large = arr[i];
    //     } 
    //     else if (sec < arr[i] && arr[i] != large)
    //     {
    //         sec = arr[i];
    //     }        
    // }    
    return avg;
}

int main()
{
    int array[5];

    cout << "enter the array: ";

    for (int i = 0; i < 5; i++)
    {
        cin >> array[i];
    }
    cout << "Given array: " << endl;

    for (int i = 0; i < 5; i++)
    {
        cout << array[i] << "\t";
    }
    cout<<"\n"<<sec_larg(array);
}