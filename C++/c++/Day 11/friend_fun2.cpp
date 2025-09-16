#include <iostream>
using namespace std;

class Temp
{
    int a;

public:
    Temp()
    {
        a = 10;
    }
    friend int fri(Temp t2);
};

int fri(Temp t2)
{
    t2.a = 20;
    return t2.a;
}

int main()
{
    Temp t1;
    cout << "value is " << fri(t1);

    return 0;
}