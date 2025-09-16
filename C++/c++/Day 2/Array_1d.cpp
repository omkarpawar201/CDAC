// #include <iostream>
// using namespace std;

// int main()
// {

//     int arr[5];
//     int max = 0;

//     cout << "Enter elements in array\n";
//     for (int i = 0; i < 5; i++)
//     {
//         cin >> arr[i];
//     }

//     max = arr[0];

//     cout << "Elements in array are \n";
//     for (int i = 0; i < 5; i++)
//     {
//         cout << arr[i] << " ";
//     }

//     for (int i = 0; i < 5; i++)
//     {
//         if (max < arr[i])
//         {
//             max = arr[i];
//         }
//     }
//     cout << "\nMax element is " << max << endl;
// }

#include <iostream>
using namespace std;

int main()
{

    int arr[5];
    int max = 0;

    cout << "Enter elements in array\n";
    for (int i = 0; i < 5; i++)
    {
        cin >> *(arr + i);
    }

    max = arr[0];

    cout << "Elements in array are \n";
    for (int i = 0; i < 5; i++)
    {
        cout << *(arr + i) << " ";
    }

    for (int i = 0; i < 5; i++)
    {
        if (max < *(arr + i))
        {
            max = *(arr + i);
        }
    }
    cout << "\nMax element is " << max << endl;
}