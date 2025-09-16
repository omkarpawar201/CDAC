// Longest Substring Without Repeating Characters

#include <iostream>
#include <string.h>
using namespace std;

int main()
{
    char str1[] = "abcabcbb";
    char str2[50];
    str2[0] = str1[0];
    
    for (int i = 0; i < strlen(str1); i++)
    {
        for (int j = 0; j <= strlen(str2); j++)
        {
            if (str2[j] != str1[i])
            {
                str2[j] = str1[i];
            }
        }
    }
    cout<<str2;
}