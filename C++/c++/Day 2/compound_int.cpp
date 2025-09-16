#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    float prin = 10000, int_rate = 0.06, comp = 12, t = 20;

    float c_int = prin * pow((1 + (int_rate) / comp), (comp * t));

    cout << "Addition of a and b = " << c_int;
}