// Given an integer x, return true if x is a palindrome, and false otherwise.

#include <iostream>
using namespace std;

int main()
{
    int num = 121, temp = 0, num2 = 0, org_num = num;

    for (int i = 0; i < 3; i++)
    {
        temp = num % 10;
        num2 = num2 * 10 + temp;
        num = num / 10;
    }

    if (org_num == num2)
    {
        cout << "true";
    }
    else
    {
        cout << "false";
    }

    // cout << num2;
}