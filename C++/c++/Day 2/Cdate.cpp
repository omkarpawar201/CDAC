//#include <iostream>
using namespace std;

class Cdate
{
    int dd, mm, yy;

public:
    Cdate();
    // Cdate();
    void show() const;
    void accept();
    void setDd(int);
    int getDd() const;
};

Cdate::Cdate()
{
    dd = 25, mm = 9, yy = 2026;
}

void Cdate::accept()
{
    cout << "Enter the date \n";
    cin >> dd >> mm >> yy;
}
void Cdate::show() const
{
    cout << "The date is " << dd << "/" << mm << "/" << yy << endl;
}
void Cdate::setDd(int d)
{
    dd = d;
}
int Cdate::getDd() const
{
    return dd;
}

int main()
{
    Cdate d1;
    Cdate d2;
    d2.show();
    cout << "In default constructor ";
    d2.show();
    d1.accept();
    d1.show();
    d1.setDd(23);
    cout << "New date is " << d1.getDd() << endl;
}