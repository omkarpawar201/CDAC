#include<iostream>
using namespace std;
class Parent {
protected:  
    int id_protected; 
};

class Child : public Parent {
public:
    void setId(int id) {
        id_protected = id; //allowed by child
    }
    void displayId() {
        cout << "id_protected is: " << id_protected << endl;
    }
};

int main() {
    Child obj;
    obj.setId(81);
    obj.displayId();
}
