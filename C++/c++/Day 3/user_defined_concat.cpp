#include <iostream>
#include <string.h>
using namespace std;

void user_cat(char*, char*);

int main()
{
    char str1[25];
    char str2[25];

    cout<<"Enter the first string = ";
    cin>>str1;
    cout<<"Enter the second string = ";
    cin>>str2;
    
    user_cat(str1, str2);
    cout<<"The second string is : "<<str1;
}

void user_cat(char* s1, char* s2)
{ 
    while (*s1 != '\0')
    {
        s1++;
    }
    while (*s2 != '\0')
    {
        *s1 = *s2;
        s1++;
        s2++;
    }
    *s1 = '\0';
}