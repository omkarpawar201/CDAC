#include <iostream>
using namespace std;

class Complex
{
    int real, img;

public:
    Complex();
    // Complex (int, int);
    void show() const;
    void accept();
    void setReal(int);
    int getReal() const;
};

Complex::Complex()
{
    real = 10, img = 20;
}

void Complex::accept()
{
    cout << "Enter the values of real and img \n";
    cin >> real >> img;
}
void Complex::show() const
{
    cout << "Real number is " << real << " + " << img << "i" << endl;
}
void Complex::setReal(int r)
{
    real = r;
    cout << "Real number after setReal is " << real << " + " << img << "i" << endl;
}
int Complex::getReal() const
{
    return real;
}

int main()
{
    Complex c1;
    cout << "In default constructor ";
    c1.show();
    c1.accept();
    c1.show();
    c1.setReal(10);
    cout << "Real number is " << c1.getReal() << endl;
}