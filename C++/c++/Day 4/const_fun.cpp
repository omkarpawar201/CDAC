#include <iostream>
using namespace std;

class Temp
{
    int a;

public:
    void setdata(int);

    int getdata() const
    {
        return a;
    }
    void show()
    {
        cout << a;
    }
};

void Temp::setdata(int b)
{
    a = b;
}

int main()
{
    Temp t1;
    t1.setdata(10);
    cout << t1.getdata();
}