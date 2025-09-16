#include <iostream>
using namespace std;

class Temp
{
    int num = 10;

public:
    void show()
    {
        cout << "Value is " << num;
    }
    
    friend void fri(Temp &t2);
};

void fri(Temp &t2){
    cout << "Value from friend function is " << t2.num;

}

int main(){
    Temp t1;
    t1.show();
    fri(t1);

    return 0;
}