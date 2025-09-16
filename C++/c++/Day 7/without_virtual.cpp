#include <iostream>
using namespace std;

class employee
{
    int id;

public:
    employee();
    employee(int);
    void display()
    {
        cout << "\nid of an emp is " << id << endl;
    }
    int findsalary()
    {
        return 0;
    }
};
employee::employee()
{
    cout << "in default of emp\n";
    id = 0;
}
employee::employee(int i)
{
    cout << "in para of emp\n";
    id = i;
}

class wageemployee : public employee
{
    int hrs, rate;

public:
    wageemployee();
    wageemployee(int, int, int);
    void display();
    int findsalary();
};
wageemployee::wageemployee()
{
    cout << "in default of wage\n";
    hrs = 0;
    rate = 0;
}
wageemployee::wageemployee(int i, int h, int r) : employee(i)
{
    cout << "in para of wage\n";
    hrs = h;
    rate = r;
}
int wageemployee::findsalary()
{
    return hrs * rate;
}
void wageemployee::display()
{
    employee::display();
    // cout << hrs << endl;
    // cout << rate << endl;
}

int main()
{
    wageemployee *ptr;
    employee e1;
    wageemployee we1(101, 5, 500);
    ptr = &we1;
    cout << "salary is " << ptr->findsalary();
    ptr->display();
}