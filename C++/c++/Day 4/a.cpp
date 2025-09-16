#include <iostream>
using namespace std;

int main()
{
    char ch = 'A';
    int row = 1;

    while (ch <= 'Z')
    {
        // Print spaces for pyramid alignment
        for (int s = 1; s <= 13 - row; s++)
        {
            cout << " ";
        }

        // Print letters for this row
        for (int i = 1; i <= row && ch <= 'Z'; i++)
        {
            cout << ch << " ";
            ch++;
            
            if (ch == 'Z')
            {
                break;
            }
            
        }
        cout << endl;
        row++;
    }
}