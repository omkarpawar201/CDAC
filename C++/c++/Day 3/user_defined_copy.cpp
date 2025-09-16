#include <iostream>
#include <string.h>
using namespace std;

void user_copy(char*, char*);

int main()
{
    char str1[25];
    char str2[25];

    cout<<"Enter the first string = ";
    cin>>str1;
    
    user_copy(str2, str1);
    cout<<"The second string is : "<<str2;
}

void user_copy(char* s2, char* s1)
{
    while (*s1 != '\0')
    {
        *s2 = *s1;
        s1++;
        s2++;
    }
    *s2 = '\0';
}