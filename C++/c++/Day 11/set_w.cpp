#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    cout << setw(5)<<1<<endl;
    cout<<setfill('*');
    cout << setw(5)<<10<<endl;
    cout << setw(5)<<100;
}