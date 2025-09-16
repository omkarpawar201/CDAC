#include <iostream>
using namespace std;

class Cdate
{
    int dd, mm, yy;

public:
    Cdate()
    {
        dd = mm = yy = 0;
    }
    Cdate(int d, int m, int y)
    {
        dd = d;
        mm = m;
        yy = y;
    }

    void show()
    {
        cout << dd <<"/"<< mm <<"/"<< yy;
    }
};
int main()
{
    Cdate *ptr1 = new Cdate(16, 06, 1999);
    ptr1->show();
    delete[] ptr1;
}