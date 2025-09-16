#include<iostream>
using namespace std;
class Base {
private:
    int pvt = 1;
protected:
    int prot = 2;
public:
    int pub = 3;

    //int getPVT() { return pvt; }  // access private member
};

class ProtectedDerived : protected Base {
public:
    int getProt() { return prot; }
    int getPub() { return pub; }
};

int main() {
    ProtectedDerived obj;
    cout << "Protected = " << obj.getProt() << endl;
    cout << "Public = " << obj.getPub() << endl;
}
