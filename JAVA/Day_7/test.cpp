#include <iostream>
using namespace std;

class Test
{
public:
    Test() {};
    virtual void show()
    {
        cout << "in Test" << endl;
    }
};

class Test1 : public Test
{
public:
    Test1() {};
    void show()
    {
        cout << "in Test1" << endl;
    }
};

class Test2 : public Test
{
public:
    Test2() {};
    void show()
    {
        cout << "in Test2" << endl;
    }
};

int main()
{
    Test *ptr;
    // Test t;
    // Test1 t2;
    // Test2 t3;

    // ptr = &t;
    // ptr->show();
    // ptr = &t2;
    // ptr->show();
    // ptr = &t3;
    // ptr->show();

    ptr = new Test();
    ptr->show();
    ptr = new Test1();
    ptr->show();
    ptr = new Test2();
    ptr->show();

    return 0;
}