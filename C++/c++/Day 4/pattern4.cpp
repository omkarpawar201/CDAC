/*
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
*/
#include <iostream>
using namespace std;

int main()
{
    int n = 5,temp =1;

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n - i; j++)
        {
            cout << " ";
        }

        for (int k = i; k >= 1; k--)
        {
            cout << temp;
            temp++;
        }
        // for (int k = 2; k <= i; k++)
        // {
        //     cout << k;
        // }
        cout << "\n";
    }
}
