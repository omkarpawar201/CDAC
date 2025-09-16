#include <iostream>
#include <string.h>
using namespace std;

int main()
{
    char str1[] = "hello", temp;

    int size = strlen(str1), j = size-1;

    // for (int i = size - 1; i >=0 ; i--)
    // {
    //     cout<<str1[i];
    // }
    for (int i = 0; i < size / 2; i++)
    {
        temp = str1[i];
        str1[i] = str1[j];
        str1[j] = temp;
        j--;
    }

    cout << str1;
}
