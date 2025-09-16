#include <iostream>
using namespace std;

class Complex
{

    int real, img;

public:
    Complex();
    Complex(int, int);
    void show();
    Complex operator+(Complex &);
    Complex operator-(Complex &);
    Complex operator-();
};

void Complex::show()
{
    if (img > 0)
        cout << real << " + " << img << "i" << endl;
    else
        cout << real << img << "i" << endl;
}

Complex::Complex()
{
    real = 0;
    img = 0;
}

Complex::Complex(int r, int i)
{
    real = r;
    img = i;
}

Complex Complex::operator+(Complex &c3_new)
{
    Complex temp;
    temp.real = real + c3_new.real;
    temp.img = img + c3_new.img;

    return temp;
}
Complex Complex::operator-(Complex &c3_new)
{
    Complex temp;
    temp.real = real - c3_new.real;
    temp.img = img - c3_new.img;

    return temp;
}
Complex Complex::operator-()
{
    Complex temp;
    temp.real = -real;
    temp.img = -img;

    return temp;
}

int main()
{
    Complex c1;
    Complex c2(1, 2);
    Complex c3(3, 4);
    // Complex c4 = c2 + c3;
    Complex c4 = c2.operator+(c3);
    Complex c5 = c2.operator-(c3);
    Complex c6 = c2.operator-();

    c6.show();
}