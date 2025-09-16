#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
    {
        // for(int i: nums){
        //     cout<<i;
        // }
        cout << nums.size();
        cout << target<<endl;
        int arr[2];
//      3 2 4
        for (int i = 0; i < nums.size() - 1; i++)
        {
            for (int j = i+1; j < nums.size(); j++)
            {
                if ((nums[i] + nums[j]) == target)
                {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        for (int i = 0; i < 2; i++)
        {
            cout << arr[i]<<"\t";
        }
   
    }
};

int main()
{
    Solution v1;
    vector<int> vec = {2,5,5,11};
    v1.twoSum(vec, 10);
}