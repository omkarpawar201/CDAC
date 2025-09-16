#include <iostream>
// #include <conio.h>
using namespace std;

class A
{
    public:
        void show()
        {
            cout << " It is the member function of class A " << endl;
        }
};

class B
{
    public:
        void show()
        {
            cout << " It is the member function of class B " << endl;
        }
};

class child : public A, public B
{
    public:

        void display()
        {
            cout << " It is the member function of the child class " << endl;
        }
};

int main()
{

    child ch;
    // ch.show();
    
    ch.A::show();
    ch.B::show();
    ch.display();

    return 0;
}