#include <iostream>
using namespace std;

int main()
{

    int rows = 1, num = 1;
    char ch = 'A';

    for (int i = 0; i < rows; i++)
    {
        for (int j = 1; j <= rows - i; j++)
        {
            cout << " ";
        }

        for (int j = 1; j <= rows && ch <= 'Z'; j++)
        {

            cout << ch << " ";
            ch++;
        }
        cout << endl;
        rows++;
    }

    return 0;
}
