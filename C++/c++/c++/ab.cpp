#include <iostream>
#include <string.h>
#include <fstream>

using namespace std;

int main()
{
    string str = "hello"; // 121

    int num = str.length();
    int j = 0;

    for (int i = 0; i < num / 2; i++)
    {
        if (str[i] == str[num - 1])
        {
            j++;
        }
        num--;
    }

    if (j > 0)
    {
        cout << "String is palindrome";
    }
    else
    {
        cout << "String is not palindrome";
    }

    return 0;
}
