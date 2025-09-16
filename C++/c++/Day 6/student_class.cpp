// Writeastudent class and use it in your program. Store the data of 10 students and
// display the sorted data according to their roll numbers, dates of birth, and total
// marks.

#include <iostream>
using namespace std;

class Student
{
public:
    // char str name[50];
    int roll_no, dob, dom, doy, marks;
    char name[50];

    void getdata()
    {
        cout << "Enter the roll no. : ";
        cin >> roll_no;
        cout << "Enter the name : ";
        cin >> name;
        cout << "Enter the DOB : ";
        cin >> dob >> dom >> doy;
        cout << "Enter the marks : ";
        cin >> marks;
    }

    void show() 
    {
        cout << "Roll No.: " << roll_no << endl;
        cout << "Name: " << name << endl;
        cout << "DOB: " << dob << "/" << dom << "/" << doy << endl;
        cout << "Marks: " << marks << endl;
        cout << "--------------------------" << endl;
    }

};

void roll_no_sort(Student s[], int num)
{
    for (int i = 0; i < num - 1; i++)
    {
        for (int j = 0; j < num - i - 1; j++)
        {
            if (s[j].roll_no > s[j + 1].roll_no)
            {
                swap(s[j], s[j + 1]);
            }
        }
    }
}

int main()
{
    int num = 2;
    Student s1[2];

    cout << "Enter the data of student" << endl;
    for (int i = 0; i < num; ++i)
    {
        cout << "Student " << i + 1 << ":\n";
        s1[i].getdata();
    }

    roll_no_sort(s1, num);

    cout<<"Data is"<<endl;
    for (int i = 0; i < num; i++)
    {
        s1[i].show();
    }
    
}