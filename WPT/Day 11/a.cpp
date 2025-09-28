#include <iostream>
#include <string.h>
#include <algorithm>

using namespace std;

int main()
{
    string str = "race a car";

    transform(str.begin(), str.end(), str.begin(), ::tolower);

    str.erase(remove(str.begin(), str.end(), ' '), str.end());

    string str2 = str;
    reverse(str2.begin(), str2.end());

    cout << str << endl;
    cout << str2 << endl;

    if (str == str2)
    {
        cout << "palindrome";
    }
    else
    {

        cout << "not palindrome";
    }
}