#include <iostream>
#include <string.h>
#include <fstream>
using namespace std;

class Item
{
    int itemID, price, stockQuantity, quantity;
    string itemName;

public:
    Item() {}
    Item(int id, string itname, int pri, int stock)
    {
        if (pri < 0)
            throw "price cannot be negative";
        if (stock < 0)
            throw "quantity cannot be negative";

        itemID = id;
        itemName = itname;
        price = pri;
        stockQuantity = stock;
    }

    int getitemID()
    {
        return itemID;
    }
    string getitemName()
    {
        return itemName;
    }
    int getprice()
    {
        return price;
    }
    int getstockQuantity()
    {
        return stockQuantity;
    }

    // void show()
    // {
    //     cout << itemID << "\t" << itemName << "\t" << price << "\t" << stockQuantity << endl;
    // }
};

class Bill
{
    int billID, each_quan[20], count;
    Item purchased[10];
    string customerName;

public:
    Bill(int bid, string cname)
    {
        billID = bid;
        customerName = cname;
        count = 0;
    }

    Bill &operator+(Item &I1)
    {
        int q;

        cout << "enter the quantity for " << I1.getitemName() << " = ";
        cin >> q;

        if (q <= 0)
            throw "Quantity is not positive";
        if (q > I1.getstockQuantity())
            throw "Stock not available";

        purchased[count] = I1;
        each_quan[count] = q;

        count++;

        return *this;
    }

    friend ostream &operator<<(ostream &out, Bill &b)
    {
        int sumTotal = 0;

        if (b.count == 0)
        {
            throw "Cannot print empty bill";
        }

        out << "\n------- Bill " << b.billID << " -------\n"
            << endl;
        out << "Customer: " << b.customerName << endl;
        out << "----------------------------------\n";
        out << "ID\tName\tPrice\tQuantity\tTotal\n";

        for (int i = 0; i < b.count; i++)
        {
            int total = b.purchased[i].getprice() * b.each_quan[i];
            sumTotal = sumTotal + total;

            out << b.purchased[i].getitemID() << "\t"
                << b.purchased[i].getitemName() << "\t"
                << b.purchased[i].getprice() << "\t"
                << b.each_quan[i] << "\t" << "\t"
                << total << "\n";
        }
        out << "----------------------------------\n";
        out << "Total = " << sumTotal << "\n";

        ofstream my_bill("Bill.txt", ios::app);
        my_bill << "\n------- Bill " << " -------\n"
                << endl;
        my_bill << "Customer: " << b.customerName << endl;
        my_bill << "----------------------------------\n";
        my_bill << "ID\tName\tPrice\tQuantity\tTotal\n";

        for (int i = 0; i < b.count; i++)
        {
            int total = b.purchased[i].getprice() * b.each_quan[i];
            sumTotal = sumTotal + total;

            my_bill << b.purchased[i].getitemID() << "\t"
                    << b.purchased[i].getitemName() << "\t"
                    << b.purchased[i].getprice() << "\t"
                    << b.each_quan[i] << "\t" << "\t"
                    << total << "\n";
        }
        my_bill << "----------------------------------\n";
        my_bill << "Total = " << sumTotal << "\n";

        my_bill.close();

        return out;
    }
};

int main()
{
    try
    {
        Item i1(1001, "bottle", 30, 30);
        Item i2(1002, "pen", 10, 50);
        // i1.show();
        // throw
        Bill b1(1, "abc");
        b1 + i1; // b1.operator+(i1);
        b1 + i2; // b1.operator+(i2);

        cout << b1;
    }
    catch (const char *msg)
    {
        cout << msg;
    }
}