#include <iostream>
using namespace std;

enum Day
{
    sonday,
    monday,
    tuesday
};

int main()
{
    Day d = sonday;

    switch (d)
    {
    case sonday:
        cout << "This is sonday";
        break;
    case monday:
        cout << "This is monday";
        break;

    default:
        break;
    }
}