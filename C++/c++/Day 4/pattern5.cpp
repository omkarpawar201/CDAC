/*
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/

#include <iostream>
using namespace std;

int main()
{
    int n = 5;

    for (int i = 5; i >= 1; i--)
    {
        for (int j = 1; j <= n - i; j++)
        {
            cout << " ";
        }

        for (int k = i; k >= 1; k--)
        {
            cout << "*";
        }
        for (int k = 2; k <= i; k++)
        {
            cout << "*";
        }
        cout << "\n";
    }
}