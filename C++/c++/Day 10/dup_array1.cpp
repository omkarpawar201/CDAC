// Remove Duplicates from Sorted Array

#include <iostream>
#include <vector>
using namespace std;

int main()
{
    int arr1[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int num = sizeof(arr1) / sizeof(arr1[0]);
    int arr2[10];

    // cout << "Enter the sorted array = ";
    // for (int i = 0; i < num; i++)
    // {
    //     cin >> v[i];
    // }

    // cout << "The sorted array = ";
    // for (int i = 0; i < num; i++)
    // {
    //     cout << arr[i] << "\t";
    // }
    arr2[0] = arr1[0];

    for (int i = 1; i < num; i++)
    {
        if (arr1[i - 1] != arr1[i])
        {
            arr2[i] = arr1[i];
        }
    }

    int num2 = sizeof(arr2) / sizeof(arr2[0]);
    cout << num << "\t";
    cout << num2 << "\t";

    for (int i = 0; i < num2; i++)
    {
        cout << arr2[i] << "\t";
    }
    // cout << "\n" << v[2];
}