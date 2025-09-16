#include <iostream>
using namespace std;

class Temp
{
private:
    int pri_var;

protected:
    int pro_var;

public:
    Temp()
    {
        pro_var = 10;
        pri_var = 20;
    }

    friend class Fri_end;
};

class Fri_end
{
public:
    void show(Temp &t2)
    {
        cout << "Private value is " << t2.pri_var << endl;
        cout << "Protected value is " << t2.pro_var;
    }
};

int main()
{
    Temp t1;
    Fri_end f1;
    f1.show(t1);

    return 0;
}