#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    int num, p;
    
    cout << "Enter the number and power\n";  
    cin >> num >> p;  

    int power = pow(num,p);
    cout << "Power of number is " << power;  

}