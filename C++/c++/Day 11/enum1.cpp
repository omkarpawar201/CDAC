#include <iostream>
using namespace std;

enum day
{
    value1,
    value2 = 10,
    value3
};

int main()
{
    day val;
    // int val2;

    val = value1;
    // val2 = value3;

    cout << val;
}