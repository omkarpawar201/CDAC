#include <iostream>
using namespace std;

void swap(int, int);

int main()
{

    int a, b;

    cout << "Enter the value = ";
    cin >> a >> b;

    cout << "The values of a and b before swapping are " << a << ", " << b;

    swap(a, b);
}

void swap(int p, int q)
{
    int temp = p;
    p = q;
    p = temp;
    cout << "\nThe values of a and b after swapping are " << p << ", " << q;
}