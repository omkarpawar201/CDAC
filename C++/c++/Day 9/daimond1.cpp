#include <iostream>
using namespace std;

class Base
{
    public:
        void fun()
        {
            cout << "Hello" << endl;
        }
};

class Parent1 : public Base
{
};

class Parent2 : public Base
{
};

class Child : public Parent1, public Parent2
{
};

int main()
{
    Child ch;;
    // ch.fun();

    ch.Parent1::fun();
   
}