#include <iostream>
#include <string>
using namespace std;

class Item
{
    int itemID, price, stockQuantity, quantity;
    string itemName;

public:
    Item() {}
    Item(int id, string itname, int pri, int quan)
    {
        if (pri < 0)
            throw "price cannot be negative";
        if (quan < 0)
            throw "quantity cannot be negative";
        itemID = id;
        itemName = itname;
        price = pri;
        quantity = quan;
    }

    void show()
    {
        cout << itemID << "\t" << itemName << "\t" << price << "\t" << quantity << endl;
    }

    int getID() { return itemID; }
    string getName() { return itemName; }
    int getPrice() { return price; }
    int getStock() { return stockQuantity; }
};

class Bill
{
    int billID;
    string customerName;
    Item purchased[10]; // fixed size
    int qty[10];        // quantity of each purchased item
    int count;

public:
    Bill(int id, string cname)
    {
        billID = id;
        customerName = cname;
        count = 0;
    }

    // overload + operator to add item into bill
    Bill &operator+(Item &it)
    {
        int q;
        cout << "Enter quantity for " << it.getName() << ": ";
        cin >> q;
        if (q <= 0)
            throw "quantity must be positive";
        if (q > it.getStock())
            throw "not enough stock available";

        purchased[count] = it;
        qty[count] = q;
        count++;
        return *this;
    }

    // overload << operator to print bill
    friend ostream &operator<<(ostream &out, Bill &b)
    {
        if (b.count == 0)
            throw "Cannot print empty bill";

        out << "\n===== BILL " << b.billID << " =====\n";
        out << "Customer: " << b.customerName << "\n";
        out << "---------------------------------\n";
        out << "ID\tName\tPrice\tQty\tTotal\n";
        for (int i = 0; i < b.count; i++)
        {
            int lineTotal = b.purchased[i].getPrice() * b.qty[i];
            out << b.purchased[i].getID() << "\t"
                << b.purchased[i].getName() << "\t"
                << b.purchased[i].getPrice() << "\t"
                << b.qty[i] << "\t"
                << lineTotal << "\n";
        }
        out << "---------------------------------\n";
        return out;
    }
};

int main()
{
    try
    {
        Item i1(1001, "Bottle", 30, 20);
        Item i2(1002, "Pen", 10, 50);

        i1.show();
        i2.show();

        Bill b1(1, "Omkar");
        b1 + i1; // add item
        b1 + i2; // add another item

        cout << b1; // print bill
    }
    catch (const char *msg)
    {
        cout << "Error: " << msg << endl;
    }
}
