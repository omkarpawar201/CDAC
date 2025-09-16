/*
    1
   212
  32123
 4321234
543212345
*/
#include <iostream>
using namespace std;

int main()
{
    int n = 5;

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i; j++)
        {
            cout << " ";
        }

        for (int k = i; k >= 1; k--)
        {
            cout << k;
        }
        for (int k = 2; k <= i; k++)
        {
            cout << k;
        }
        cout << "\n";
    }
}
