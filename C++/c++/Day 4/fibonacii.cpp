#include <iostream>
using namespace std;

int main()
{
    int num;

    cout << "Enter length of series = ";
    cin >> num;

    int fibb[num];

    fibb[0] = 0;
    fibb[1] = 1;

    for (int i = 2; i < num; i++)
    {
        fibb[i] = fibb[i - 2] + fibb[i - 1];
    }
    for (int i = 0; i < num; i++)
    {
        cout << fibb[i] << " ";
    }
}