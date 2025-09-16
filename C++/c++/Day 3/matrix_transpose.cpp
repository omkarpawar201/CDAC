#include <iostream>
using namespace std;

int main()
{
    int arr[2][2], trans[2][2];

    cout << "Enter the array" << endl;
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cin >> arr[i][j];
        }
    }

    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cout << arr[i][j] << "\t";
        }
    }
    cout << endl;

    cout << "Transpose array" << endl;
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            trans[j][i] = arr[i][j];
        }
    }

    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            cout << trans[i][j] << "\t";
        }
    }
}