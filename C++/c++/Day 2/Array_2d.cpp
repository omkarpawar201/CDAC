// #include <iostream>
// using namespace std;

// int main()
// {

//     int arr[3][3];
//     int max = 0;

//     cout << "Enter elements in array\n";
//     for (int i = 0; i < 3; i++)
//     {
//         for (int j = 0; j < 3; j++)
//         {
//             cin >> arr[i][j];
//         }

//     }

//     max = arr[0][0];

//     cout << "Elements in array are \n";
//     for (int i = 0; i < 3; i++)
//     {
//         for (int j = 0; j < 3; j++)
//         {
//             cout << arr[i][j] << " ";
//         }
//     }

//     for (int i = 0; i < 3; i++)
//     {
//         for (int j = 0; j < 3; j++)
//         {
//             if (max < arr[i][j])
//             {
//                 max = arr[i][j];
//             }
//         }
//     }
//     cout << "\nMax element is " << max << endl;
// }

// *(*(a+i)+j)

#include <iostream>
using namespace std;

int main()
{

    int arr[3][3];
    int max = 0;

    cout << "Enter elements in array\n";
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cin >> *(*(arr + i) + j);
        }
    }

    max = arr[0][0];

    cout << "Elements in array are \n";
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << *(*(arr + i) + j) << " ";
        }
    }

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            if (max < *(*(arr + i) + j))
            {
                max = *(*(arr + i) + j);
            }
        }
    }
    cout << "\nMax element is " << max << endl;
}