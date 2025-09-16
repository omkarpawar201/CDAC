#include <iostream>
using namespace std;

class Complex
{

    int real, img;

public:
    Complex();
    Complex(int, int);
    void show();
    Complex operator++();
    Complex operator++(int);
    Complex operator--();
    Complex operator--(int);
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

Complex Complex::operator++()
{
    real++;
    img++;

    return (*this);
}

Complex Complex::operator++(int)
{
    Complex temp = (*this);
    real++;
    img++;

    return temp;
}

Complex Complex::operator--()
{
    real--;
    img--;

    return (*this);
}

Complex Complex::operator--(int)
{
    Complex temp = (*this);
    real--;
    img--;

    return temp;
}

int main()
{
    Complex c1;
    Complex c2(1, 2);
    Complex c5(3, 4);

    // Complex c3 = c2.operator++();

    // c5.show();
    // Complex c4 = c5.operator++();
    // c4.show();

    // Complex c6 = c2.operator--();

    c5.show();
    Complex c7 = c5.operator--();
    c7.show();
}