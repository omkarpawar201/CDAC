#include <iostream>
#include <string.h>
using namespace std;

int main()
{
    char str[25];

    cout<<"Enter the string = ";
    cin>>str;

    cout<<"Length of the string = "<< strlen(str)<<endl;
    cout<<"Size of the string = "<< sizeof(str);
}