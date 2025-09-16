#include <iostream>
#include <fstream>

using namespace std;

int main()
{
    ifstream file("demo.txt");
    // ofstream file("demo.txt");

    if (file)
    {
        cout << "file found"<<endl;
    }
    else
    {
        cout << "file not found"<<endl;
    }

    cout<<file.is_open();
    
    file.close();
    cout<<file.is_open();

    return 0;
}