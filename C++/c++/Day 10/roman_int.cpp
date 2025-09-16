// Roman to Integer

#include <iostream>
#include <string.h>
using namespace std;

int roman(char ch)
{
    switch (ch)
    {
    case 'I':
        return 1;
    case 'V':
        return 5;
    case 'X':
        return 10;
    case 'L':
        return 50;
    case 'C':
        return 100;
    case 'D':
        return 500;
    case 'M':
        return 1000;
    default:
        return 0;
    }
}

int main()
{

    char str[] = "IV";
    int sum = 0;

    for (int i = 0; i < strlen(str); i++)
    {
        if (roman(str[i]) < roman(str[i + 1]))
        {
            sum -= roman(str[i]);
        }
        else
        {
            sum += roman(str[i]);
        }
    }

    cout << sum;
}